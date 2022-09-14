package com.kim.controller;

import com.kim.model.userInfo;
import com.kim.service.UserService;
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


/**
 * @author AnneRose
 * @date 2022/9/6 18:08
 * @Version v1.0
 */
@Controller
public class UserMessage {
    @Autowired
    private UserService userServiceImpl;

    @RequestMapping(value = "/selectAll",method = {RequestMethod.GET})
    public void helloWorld(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
            List<userInfo> userList = userServiceImpl.selectAll();
            request.setAttribute("userInfo",userList);
            request.getRequestDispatcher("saveUser.jsp").forward(request,response);
    }
}
