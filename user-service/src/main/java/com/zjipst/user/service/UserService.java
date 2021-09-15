package com.zjipst.user.service;

import com.zjipst.user.entity.User;

import java.util.List;

/**
 * @author songhao
 */

public interface UserService {

    /**返回所有的人员信息
     * @return
     */
    List<User> list();


    /** 根据人员信息获取人员
     * @param id
     * @return
     */
    User getUserById(Long id);
}
