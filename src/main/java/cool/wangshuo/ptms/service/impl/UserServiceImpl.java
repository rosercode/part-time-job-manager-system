package cool.wangshuo.ptms.service.impl;

import cool.wangshuo.ptms.mapper.UserMapper;
import cool.wangshuo.ptms.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangshuo
 * @date 2023/3/20 17:48
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

}
