package com.lichong.ui.controller;


import com.lichong.service.BloggerService;
import com.lichong.to.Blogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class MainController extends BaseController {

    @Autowired
    private BloggerService bloggerService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public String testSSM() {
        Blogger blogger = bloggerService.getBloggerById(1);
        return "ssm build ok!" + blogger.getUserName();
    }

    @RequestMapping(value = "/menu")
    public String menu(){
        return "menu";
    }

}
