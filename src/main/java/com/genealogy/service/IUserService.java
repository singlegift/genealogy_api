package com.genealogy.service;

import com.baomidou.mybatisplus.service.IService;
import com.genealogy.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {
    List<User> selectList();
}
