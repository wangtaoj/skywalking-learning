package com.wangtao.app.provider.controller;

import com.wangtao.app.provider.po.User;
import com.wangtao.app.provider.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangtao
 * Created at 2024-09-22
 */
@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public User get(@PathVariable Long id) {
        return userService.selectById(id);
    }
}
