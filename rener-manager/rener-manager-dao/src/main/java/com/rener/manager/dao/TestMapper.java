package com.rener.manager.dao;

import com.rener.manager.pojo.vo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper {
    User test();
}
