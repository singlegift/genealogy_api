package com.genealogy.controller;

import com.genealogy.entity.User;
import com.genealogy.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(tags = "Demo")
public class DemoController {

    @Autowired
    private IUserService userService;

    @ApiOperation("用户列表")
    @GetMapping("/list")
    public List<User> list() {
        int i = 1 / 0;
        return userService.selectList();
    }
}
