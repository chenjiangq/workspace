package jooj.jjooj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("jooj.jjooj.mapper")
@EnableCaching//开启缓存
public class JjoojApplication {

    public static void main(String[] args) {
        SpringApplication.run(JjoojApplication.class, args);
    }

}
