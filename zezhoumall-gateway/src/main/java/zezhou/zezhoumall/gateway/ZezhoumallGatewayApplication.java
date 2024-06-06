package zezhou.zezhoumall.gateway;

import lombok.ToString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class ZezhoumallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZezhoumallGatewayApplication.class, args);
    }

}
