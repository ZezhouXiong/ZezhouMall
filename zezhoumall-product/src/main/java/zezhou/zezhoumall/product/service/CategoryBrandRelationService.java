package zezhou.zezhoumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import zezhou.common.utils.PageUtils;
import zezhou.zezhoumall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author zezhou
 * @email sunlightcs@gmail.com
 * @date 2024-06-05 16:17:07
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

