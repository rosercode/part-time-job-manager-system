package cool.wangshuo.ptms;


import cool.wangshuo.ptms.mapper.UserMapper;
import cool.wangshuo.ptms.model.entity.User;
import cool.wangshuo.ptms.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class PartTimeJobApplicationTests {

    @Resource
    private UserMapper userMapper;


    @Test
    public void insertTest() {

        User user = new User();
        user.setDelete(false);
        user.setAccount("username");
        user.setPassword("1111");

        System.out.println(userMapper.insert(user));

    }

}
