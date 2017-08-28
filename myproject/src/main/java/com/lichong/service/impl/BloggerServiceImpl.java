package com.lichong.service.impl;

import com.lichong.dao.BloggerMapper;
import com.lichong.service.BloggerService;
import com.lichong.to.Blogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BloggerServiceImpl implements BloggerService {

    @Autowired
    private BloggerMapper bloggerMapper;
    @Override
    public Blogger getBloggerById(Integer id) {
        return bloggerMapper.getBloggerById(id);
    }
}
