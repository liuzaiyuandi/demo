package com.mydemo.demo.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mydemo.demo.entity.Admin;
import com.mydemo.demo.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AdminController {

    private AdminService adminService;

    @GetMapping("/get")
    public Admin demo(){
        return  adminService.getOne(Wrappers.<Admin>lambdaQuery().eq(Admin::getId, 1));
    }
}
