package com.wangtao.app.consumer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wangtao.app.consumer.feign.UserFeignClient;
import com.wangtao.app.consumer.feign.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangtao
 * Created at 2024-09-22
 */
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/userCache")
@RestController
public class UserCacheController {

    private final UserFeignClient userFeignClient;

    private final StringRedisTemplate redisTemplate;

    private final ObjectMapper objectMapper;

    @GetMapping("/{id}")
    public UserDTO getAndSet(@PathVariable Long id) throws JsonProcessingException {
        log.info("getAndSet id:{}", id);
        UserDTO userDTO = userFeignClient.getUserById(id);
        redisTemplate.opsForValue().set("saywalking:user:" + id, objectMapper.writeValueAsString(userDTO));
        return userDTO;
    }
}
