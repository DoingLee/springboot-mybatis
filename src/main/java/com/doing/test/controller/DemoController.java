package com.doing.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    private static final Logger LOG = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private Environment environment;

    /**
     * 测试：http://127.0.0.1:8080/test
     *
     * @return 测试，返回hello world
     */
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String home() {
        LOG.info("hello world ! this is my log");
        LOG.info("server-port :" + environment.getProperty("server.port"));
        return "hello world ! ";
    }


}
