package com.zjipst.client;

import com.zjipst.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author songhao
 */
@FeignClient("userService")
public interface UserClient {

    /** 查询user
     * @param id
     * @return
     */
    @RequestMapping("/getUser/{id}")
    User findByUserId(@PathVariable Long id);

}