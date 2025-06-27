package cn.webwss.springboot.init;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

//@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@SpringBootApplication
@MapperScan("cn.webwss.springboot.init.mapper")
@EnableScheduling
public class SpringBootInitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootInitApplication.class, args);
    }

}
