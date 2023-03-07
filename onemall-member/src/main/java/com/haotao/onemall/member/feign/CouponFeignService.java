package com.haotao.onemall.member.feign;

import com.haotao.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tao
 * @since 2023/03/07
 */

@FeignClient(name = "onemall-coupon", url = "http://localhost:7000/")
public interface CouponFeignService {
    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupons();
}
