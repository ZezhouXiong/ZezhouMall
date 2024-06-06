package zezhou.zezhoumall.order.dao;

import zezhou.zezhoumall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author zezhou
 * @email sunlightcs@gmail.com
 * @date 2024-06-05 20:32:19
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
