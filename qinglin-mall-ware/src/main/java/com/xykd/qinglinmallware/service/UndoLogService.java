package com.xykd.qinglinmallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.xykd.qinglinmallware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author kd
 * @email 2176713510@qq.com
 * @date 2024-12-09 20:59:16
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

