package com.kim.controller;

import com.kim.common.controller.BaseController;
import com.kim.model.userInfo;
import com.kim.service.UserService;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;


/**
 * @author AnneRose
 * @date 2022/9/6 18:08
 * @Version v1.0
 */

@Controller
public class UserMessage extends BaseController {
    @Autowired
    private UserService userServiceImpl;

    /**
     * 选择全部用户业务
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @RequestMapping(value = "/selectAll",method = {RequestMethod.GET})
    public void selectAll(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
            List<userInfo> userList = userServiceImpl.selectAll();
            request.setAttribute("userInfo",userList);
            request.getRequestDispatcher("saveUser.jsp").forward(request,response);
    }

    /**
     * 保存用户业务
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @RequestMapping(value = "/saveUser",method = {RequestMethod.POST})
    public String saveUser(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        userInfo userInfo = new userInfo();
        userInfo.setUsername(userName);
        userInfo.setPassword(passWord);
        userServiceImpl.saveUser(userInfo);
        return "saveUser";

    }

    /**
     * 删除用户业务
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @RequestMapping(value = "deleteUser",method = {RequestMethod.GET})
    public void deleteUser(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        Map<String,Object> map = this.requestParam(request,response);
        String userId = (String)map.get("userId");
        userServiceImpl.deleteUser(userId);

    }

    /**
     * 更新用户业务
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @RequestMapping(value = "updateUser",method = {RequestMethod.GET})
    public void updateUser(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        Map<String,Object> map = this.requestParam(request,response);
        String userId = (String)map.get("userId");
        userInfo userInfo = userServiceImpl.selectOne(userId);
        List<userInfo> userList = userServiceImpl.selectAll();
        request.setAttribute("userInfo",userList);
        request.getRequestDispatcher("saveUser.jsp").forward(request,response);
    }

}
