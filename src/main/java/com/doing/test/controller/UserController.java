package com.doing.test.controller;

import com.doing.test.domain.Result;
import com.doing.test.domain.dto.UserDTO;
import com.doing.test.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author doing
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public Result getUserInfo(@RequestParam("id") Long id) {
        try {
            UserDTO userInfo = userService.getUserInfo(id);
            return new Result(userInfo);
        } catch (Exception e) {
            LOG.error("getUserInfo fail", e);
            return new Result(Result.ERROR, e.getMessage());
        }
    }

}
