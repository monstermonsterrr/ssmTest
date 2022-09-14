package com.kim.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.spi.http.HttpContext;
import java.util.Map;

/**
 * @author AnneRose
 * @date 2022/9/13 15:47
 * @Version v1.0
 */
public class BaseController {

    public void requestParam(HttpServletRequest request, HttpServletResponse response){
        String param = request.getQueryString();
    }
}
