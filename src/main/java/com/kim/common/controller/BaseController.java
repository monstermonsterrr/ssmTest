package com.kim.common.controller;

import com.kim.model.userInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.spi.http.HttpContext;
import java.util.HashMap;
import java.util.Map;

/**
 * @author AnneRose
 * @date 2022/9/13 15:47
 * @Version v1.0
 */
public class BaseController {

    public Map<String,Object> requestParam(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> result = new HashMap<String, Object>();
        if(request.getSession().getAttribute("userinfo") != null){
            userInfo userInfo = (userInfo)request.getSession().getAttribute("userinfo");
            result.put("userId",userInfo.getUserid());
        }else{
            result.put("userId","test001");
        }

            return result;
    }
}
