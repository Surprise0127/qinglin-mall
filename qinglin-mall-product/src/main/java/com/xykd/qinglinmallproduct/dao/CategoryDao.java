package com.xykd.qinglinmallproduct.dao;

import com.xykd.qinglinmallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kd
 * @email 2176713510@qq.com
 * @date 2024-12-08 18:03:14
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}