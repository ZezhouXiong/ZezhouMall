package zezhou.zezhoumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import zezhou.common.utils.PageUtils;
import zezhou.zezhoumall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author zezhou
 * @email sunlightcs@gmail.com
 * @date 2024-06-05 16:17:07
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

