package zezhou.zezhoumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import zezhou.common.utils.PageUtils;
import zezhou.zezhoumall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author zezhou
 * @email sunlightcs@gmail.com
 * @date 2024-06-05 16:17:06
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

