package com.basicservlet.controller;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

/*
Create By: Ron Rith
Create Date: 12/21/2017
*/
public class BaseController {
    public static final String PARAM_BASE_URL = "baseURL";
    //get base url
    public String getBaseURL(HttpServletRequest request) {
        return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
    }
}
