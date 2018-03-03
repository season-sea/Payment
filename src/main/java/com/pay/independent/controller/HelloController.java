package com.pay.independent.controller;

import com.pay.independent.entity.BlogConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class HelloController {

    private Logger logger= LoggerFactory.getLogger(HelloController.class);

    @Resource
    private BlogConfig blogConfig;

    @RequestMapping("/hello")
    public String index() {

        logger.info("name is:{},title is:{}",blogConfig.getName(),blogConfig.getTitle());
        return "Hello World，name is:"+blogConfig.getName()+"      title is:"+blogConfig.getTitle()+"" +
                "开始使用";
    }

    @RequestMapping("/index2")
    public String index2(ModelMap map) {
        map.addAttribute("host", "http://www.bai.com");
        return "index.html";
    }
}
