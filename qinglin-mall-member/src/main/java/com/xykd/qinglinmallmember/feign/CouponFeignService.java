package com.xykd.qinglinmallmember.feign;

import com.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("qinglin-mall-coupon")
public interface CouponFeignService {

    @RequestMapping("/qinglinmallcoupon/coupon/test")
    public R test();

}
