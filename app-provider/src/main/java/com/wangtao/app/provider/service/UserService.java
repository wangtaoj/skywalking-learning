package com.wangtao.app.provider.service;

import com.wangtao.app.provider.mapper.UserMapper;
import com.wangtao.app.provider.po.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author wangtao
 * Created at 2024-09-22
 */
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserMapper userMapper;

    public User selectById(Long id) {
        return userMapper.selectById(id);
    }
}
