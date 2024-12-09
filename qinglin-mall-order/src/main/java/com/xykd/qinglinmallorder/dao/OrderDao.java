package com.xykd.qinglinmallorder.dao;

import com.xykd.qinglinmallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author kd
 * @email 2176713510@qq.com
 * @date 2024-12-09 21:01:34
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
