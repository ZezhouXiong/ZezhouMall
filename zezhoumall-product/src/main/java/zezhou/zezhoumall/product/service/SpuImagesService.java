package zezhou.zezhoumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import zezhou.common.utils.PageUtils;
import zezhou.zezhoumall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author zezhou
 * @email sunlightcs@gmail.com
 * @date 2024-06-05 16:17:07
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

