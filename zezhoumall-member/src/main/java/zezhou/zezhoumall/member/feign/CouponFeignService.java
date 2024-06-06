package zezhou.zezhoumall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import zezhou.common.utils.R;

@FeignClient("zezhoumall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list ")
    public R memberCoupons();
}
