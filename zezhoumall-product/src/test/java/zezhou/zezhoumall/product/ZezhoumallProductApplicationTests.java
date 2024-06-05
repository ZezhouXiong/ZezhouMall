package zezhou.zezhoumall.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zezhou.zezhoumall.product.entity.BrandEntity;
import zezhou.zezhoumall.product.service.BrandService;

@SpringBootTest
class ZezhoumallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }


    @Test
    void updataById(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("测试");
        brandService.updateById(brandEntity);
    }

}
