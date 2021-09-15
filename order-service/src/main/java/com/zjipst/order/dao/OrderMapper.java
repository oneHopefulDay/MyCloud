package com.zjipst.order.dao;

import com.zjipst.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author songhao
 */
@Mapper
public interface OrderMapper {

    /** 返回所有的订单
     * @return
     */
    @Select("select * from tb_order")
    List<Order> list();


    /** 根据id 查询订单
     * @param id
     * @return
     */
    @Select("select * from tb_order where id = #{id}")
    Order getOrder(@Param("id") Long id);

}
