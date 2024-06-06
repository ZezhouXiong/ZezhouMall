package zezhou.zezhoumall.product.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import zezhou.common.utils.PageUtils;
import zezhou.zezhoumall.product.entity.CategoryEntity;
import zezhou.zezhoumall.product.entity.ProductAttrValueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 * 
 * @author zezhou
 * @email sunlightcs@gmail.com
 * @date 2024-06-05 16:17:06
 */
@Mapper
public interface ProductAttrValueDao extends BaseMapper<ProductAttrValueEntity> {

    /**
     * 商品三级分类
     *
     * @author zezhou
     * @email sunlightcs@gmail.com
     * @date 2024-06-05 16:17:07
     */
    interface CategoryService extends IService<CategoryEntity> {

        PageUtils queryPage(Map<String, Object> params);

        List<CategoryEntity> listWithTree();
    }
}
