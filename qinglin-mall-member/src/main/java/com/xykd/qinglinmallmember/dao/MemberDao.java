package com.xykd.qinglinmallmember.dao;

import com.xykd.qinglinmallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author kd
 * @email 2176713510@qq.com
 * @date 2024-12-09 21:03:03
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
