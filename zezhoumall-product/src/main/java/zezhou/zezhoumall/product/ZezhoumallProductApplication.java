package zezhou.zezhoumall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("zezhou.zezhoumall.product.dao")
@SpringBootApplication
public class ZezhoumallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZezhoumallProductApplication.class, args);
    }

}
