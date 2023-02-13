package cool.wangshuo.ptms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("cool.wangshuo.ptms.model.entity")
@MapperScan("cool.wangshuo.ptms.mapper")
@SpringBootApplication
public class PartTimeJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(PartTimeJobApplication.class, args);
    }

}
