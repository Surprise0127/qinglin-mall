package com.xykd.qinglinmallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.xykd.qinglinmallproduct.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author kd
 * @email 2176713510@qq.com
 * @date 2024-12-08 18:03:14
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

