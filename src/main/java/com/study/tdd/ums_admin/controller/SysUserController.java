package com.study.tdd.ums_admin.controller;

import com.study.tdd.ums_admin.entity.SysUser;
import com.study.tdd.ums_admin.service.ISysUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/sys/user")
public class SysUserController {

    private final ISysUserService sysUserService;

    public SysUserController(ISysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @RequestMapping(value = "/{id}",method= RequestMethod.GET)
    public String findSysUserOneByUserId(@PathVariable("id") Long id){
        Optional<SysUser> sysUser = sysUserService.findOneById(id);
        return sysUser.isPresent()?sysUser.get().toString():"";
    }

}
