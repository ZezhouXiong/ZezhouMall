package zezhou.zezhoumall.product.dao;

import zezhou.zezhoumall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zezhou
 * @email sunlightcs@gmail.com
 * @date 2024-06-05 16:17:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
