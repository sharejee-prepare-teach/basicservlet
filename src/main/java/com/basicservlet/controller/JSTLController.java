package com.basicservlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by : Ron Rith
 * Create Date: 12/17/2017.
 */
@Controller
public class JSTLController {
    @RequestMapping(value = "/persons")
    public String getPerson(){
        return "person";
    }
}
