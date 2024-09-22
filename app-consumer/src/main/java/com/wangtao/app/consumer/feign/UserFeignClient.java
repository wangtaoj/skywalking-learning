package com.wangtao.app.consumer.feign;

import com.wangtao.app.consumer.feign.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wangtao
 * Created at 2024-09-22
 */
@FeignClient(name = "app-provider", path = "/user")
public interface UserFeignClient {

    @GetMapping("/{id}")
    UserDTO getUserById(@PathVariable(name="id") Long id);
}
