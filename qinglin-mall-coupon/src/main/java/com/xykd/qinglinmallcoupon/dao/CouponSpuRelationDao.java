package com.xykd.qinglinmallcoupon.dao;

import com.xykd.qinglinmallcoupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author kd
 * @email 2176713510@qq.com
 * @date 2024-12-08 21:31:14
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
