package cool.wangshuo.ptms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;

@EntityScan("cool.wangshuo.ptms.model.entity")
@MapperScan("cool.wangshuo.ptms.mapper")
@SpringBootApplication
public class PartTimeJobApplication {

    public static ConfigurableApplicationContext ac;

    public static void main(String[] args) {
        ac =  SpringApplication.run(PartTimeJobApplication.class, args);
    }


}
