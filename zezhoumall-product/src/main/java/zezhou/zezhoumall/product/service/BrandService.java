package zezhou.zezhoumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import zezhou.common.utils.PageUtils;
import zezhou.zezhoumall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zezhou
 * @email sunlightcs@gmail.com
 * @date 2024-06-05 16:17:07
 */
public interface BrandService extends IService<BrandEntity> {



    PageUtils queryPage(Map<String, Object> params);
}

