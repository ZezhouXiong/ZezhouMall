package zezhou.zezhoumall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("zezhou.zezhoumall.ware.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class ZezhoumallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZezhoumallWareApplication.class, args);
    }

}
