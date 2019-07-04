package com.study.tdd.ums_admin.controller;

import com.study.tdd.ums_admin.entity.UmsAdmin;
import com.study.tdd.ums_admin.service.IUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/user")
@RestController
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/{id}")
    public String getOneById(@PathVariable("id") Long id){
        Optional<UmsAdmin> umsAdmin = userService.selectOne(id);
        return umsAdmin.isPresent()?umsAdmin.toString():"";
    }

}
