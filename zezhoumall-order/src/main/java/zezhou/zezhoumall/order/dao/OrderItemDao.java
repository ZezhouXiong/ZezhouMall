package zezhou.zezhoumall.order.dao;

import zezhou.zezhoumall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zezhou
 * @email sunlightcs@gmail.com
 * @date 2024-06-05 20:32:19
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
