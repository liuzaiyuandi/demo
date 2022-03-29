package com.mydemo.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mydemo.demo.entity.Admin;
import com.mydemo.demo.service.AdminService;
import com.mydemo.demo.mapper.AdminMapper;
import org.springframework.stereotype.Service;

/**
* @author Blue
* @description 针对表【admin】的数据库操作Service实现
* @createDate 2021-11-22 23:33:42
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
    implements AdminService{

}




