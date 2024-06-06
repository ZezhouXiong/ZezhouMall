package zezhou.zezhoumall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("zezhou.zezhoumall.member.dao")
@EnableFeignClients(basePackages = "zezhou.zezhoumall.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class ZezhoumallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZezhoumallMemberApplication.class, args);
    }

}
