package com.lichong.dao;

import com.lichong.to.Blogger;
import org.springframework.stereotype.Repository;

@Repository
public interface BloggerMapper {

    Blogger getBloggerById(Integer id);
}
