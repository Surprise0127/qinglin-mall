package com.xykd.qinglinmallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.xykd.qinglinmallware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author kd
 * @email 2176713510@qq.com
 * @date 2024-12-09 20:59:16
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

