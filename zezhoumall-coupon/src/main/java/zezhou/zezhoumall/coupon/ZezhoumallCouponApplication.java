package zezhou.zezhoumall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("zezhou.zezhoumall.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class ZezhoumallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZezhoumallCouponApplication.class, args);
    }

}
