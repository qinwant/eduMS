package com.goktech.service.impl;

import com.goktech.mapper.TestMapper;
import com.goktech.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kingwan on 2020/7/13.
 * 说明：服务层实现类，注入mapper
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public String findAll() {
//        List<String> all = testMapper.findAll();
//        return all;
        return "success";
    }
}
