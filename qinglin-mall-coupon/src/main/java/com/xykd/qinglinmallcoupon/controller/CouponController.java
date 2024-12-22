package com.xykd.qinglinmallcoupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xykd.qinglinmallcoupon.entity.CouponEntity;
import com.xykd.qinglinmallcoupon.service.CouponService;
import com.common.utils.PageUtils;
import com.common.utils.R;



/**
 * 优惠券信息
 *
 * @author kd
 * @email 2176713510@qq.com
 * @date 2024-12-08 21:31:14
 */
@RestController
@RequestMapping("qinglinmallcoupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    /**
     * OpenFeign服务调用测试用例
     * @return
     */
    @RequestMapping("/test")
    private R test(){
        return R.ok("调用成功001");
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("qinglinmallcoupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("qinglinmallcoupon:coupon:info")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("qinglinmallcoupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("qinglinmallcoupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("qinglinmallcoupon:coupon:delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
