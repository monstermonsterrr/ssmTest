<%--
  Created by IntelliJ IDEA.
  User: kgako
  Date: 2022/9/15
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登录界面</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 注意：项目正式环境请勿引用该地址 -->
    <link href="//unpkg.com/layui@2.7.6/dist/css/layui.css" rel="stylesheet">
</head>
<body>


<!-- 示例-970 -->
<!--
<ins class="adsbygoogle"
style="display:inline-block;width:970px;height:90px"
data-ad-client="ca-pub-6111334333458862"
data-ad-slot="3820120620"></ins>
-->

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>登录</legend>
</fieldset>

<form class="layui-form" action="" lay-filter="example">
    <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-block">
            <input type="text" name="userName" lay-verify="title" autocomplete="off" placeholder="请输入用户名" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">密码框</label>
        <div class="layui-input-block">
            <input type="password" name="passWord" placeholder="请输入密码" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1" >立即提交</button>
        </div>
    </div>
</form>

<!-- 注意：项目正式环境请勿引用该地址 -->
<script src="//unpkg.com/layui@2.7.6/dist/layui.js"></script>


<script>
layui.use(['form', 'util', 'laydate'], function(){
  var form = layui.form;
  var layer = layui.layer;
  var util = layui.util;
  var laydate = layui.laydate;

  //日期
  laydate.render({
    elem: '#date'
  });
  laydate.render({
    elem: '#date1'
  });

  //自定义验证规则
  form.verify({
    title: function(value){
      if(value.length < 0 ){
        return '用户名至少得有个字符啊';
      }
    }
    ,pass: [
      /^[\S]{6,12}$/
      ,'密码必须6到12位，且不能出现空格'
    ]
  });

  //指定开关事件
  form.on('switch(switchTest)', function(data){
    layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
      offset: '6px'
    });
    layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
  });

  //提交事件
  form.on('submit(demo1)', function(data){
    var maintenancePlace = JSON.stringify(data.field);
        $.ajax({
            url : '/saveUser',
            type : 'post',
            dataType : 'json',
            contentType :"application/json",
            data : maintenancePlace,
            success : function (data1) {
                alert(11111111)
            }
        })
  });

  //表单赋值
  layui.$('#LAY-component-form-setval').on('click', function(){
    form.val('example', {
      "username": "贤心" // "name": "value"
      ,"password": "123456"
      ,"interest": 1
      ,"like[write]": true //复选框选中状态
      ,"close": true //开关状态
      ,"sex": "女"
      ,"desc": "我爱 layui"
    });
  });

  //表单取值
  layui.$('#LAY-component-form-getval').on('click', function(){
    var data = form.val('example');
    alert(JSON.stringify(data));
  });
  // 普通事件
  util.on('lay-on', {
    // 获取验证码
    "get-vercode": function(othis){
      var isvalid = form.validate('.demo-phone'); // v2.7.0 新增
      // 验证通过
      if(isvalid){
        layer.msg('手机号验证通过，执行发送验证码的操作');
      }
    }
  });

});
</script>

</body>
</html>