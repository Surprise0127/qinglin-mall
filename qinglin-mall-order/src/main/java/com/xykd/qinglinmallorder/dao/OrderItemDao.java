package com.xykd.qinglinmallorder.dao;

import com.xykd.qinglinmallorder.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author kd
 * @email 2176713510@qq.com
 * @date 2024-12-09 21:01:34
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
