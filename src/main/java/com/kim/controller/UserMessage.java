package com.kim.controller;

import com.kim.model.UserInfo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author AnneRose
 * @date 2022/9/6 18:08
 * @Version v1.0
 */
@Controller
public class UserMessage {

    @RequestMapping(value = "/hello",method = {RequestMethod.POST})
    public void helloWorld(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        UserInfo user = new UserInfo();
        user.setUserName(userName);
        user.setPassword(passWord);
        request.setAttribute("user",user);
        request.getRequestDispatcher("saveUser.jsp").forward(request,response);//请求转发，请求可二次转发

    }
}
