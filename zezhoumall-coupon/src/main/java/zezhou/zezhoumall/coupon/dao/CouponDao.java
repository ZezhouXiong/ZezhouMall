package zezhou.zezhoumall.coupon.dao;

import zezhou.zezhoumall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zezhou
 * @email sunlightcs@gmail.com
 * @date 2024-06-05 20:11:59
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
