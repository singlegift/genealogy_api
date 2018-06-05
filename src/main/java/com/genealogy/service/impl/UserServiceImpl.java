package com.genealogy.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.genealogy.entity.User;
import com.genealogy.mapper.UserMapper;
import com.genealogy.service.IUserService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "cache")
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {

    @Cacheable(keyGenerator = "keyGenerator")
    public List<User> selectList() {
        return super.selectList(null);
    }

}
