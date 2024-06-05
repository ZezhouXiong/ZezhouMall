package zezhou.zezhoumall.product.dao;

import zezhou.zezhoumall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author zezhou
 * @email sunlightcs@gmail.com
 * @date 2024-06-05 16:17:07
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
