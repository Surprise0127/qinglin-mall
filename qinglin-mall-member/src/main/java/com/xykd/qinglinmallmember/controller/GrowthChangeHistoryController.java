package com.xykd.qinglinmallmember.controller;

import java.util.Arrays;
import java.util.Map;

import com.xykd.qinglinmallmember.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xykd.qinglinmallmember.entity.GrowthChangeHistoryEntity;
import com.xykd.qinglinmallmember.service.GrowthChangeHistoryService;
import com.common.utils.PageUtils;
import com.common.utils.R;

import javax.annotation.Resource;


/**
 * 成长值变化历史记录
 *
 * @author kd
 * @email 2176713510@qq.com
 * @date 2024-12-09 21:03:03
 */
@RestController
@RequestMapping("qinglinmallmember/growthchangehistory")
public class GrowthChangeHistoryController {
    @Autowired
    private GrowthChangeHistoryService growthChangeHistoryService;

    @Resource
    CouponFeignService couponFeignService;

    /**
     * 测试
     * @return R
     */
    @RequestMapping("/openfeigntest")
    public R openFeignTest(){
        return R.ok(couponFeignService.test());
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("qinglinmallmember:growthchangehistory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = growthChangeHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("qinglinmallmember:growthchangehistory:info")
    public R info(@PathVariable("id") Long id){
		GrowthChangeHistoryEntity growthChangeHistory = growthChangeHistoryService.getById(id);

        return R.ok().put("growthChangeHistory", growthChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("qinglinmallmember:growthchangehistory:save")
    public R save(@RequestBody GrowthChangeHistoryEntity growthChangeHistory){
		growthChangeHistoryService.save(growthChangeHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("qinglinmallmember:growthchangehistory:update")
    public R update(@RequestBody GrowthChangeHistoryEntity growthChangeHistory){
		growthChangeHistoryService.updateById(growthChangeHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("qinglinmallmember:growthchangehistory:delete")
    public R delete(@RequestBody Long[] ids){
		growthChangeHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
