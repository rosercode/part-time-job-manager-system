package cool.wangshuo.ptms.controller;

import com.baomidou.mybatisplus.extension.api.R;
import cool.wangshuo.ptms.mapper.UserMapper;
import cool.wangshuo.ptms.model.entity.User;
import cool.wangshuo.ptms.model.vo.GoodsAddVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/item")
@Api(value = "item")
public class ItemController {

    @Resource
    private UserMapper userMapper;

    @GetMapping(value = "/add1")
    @ApiOperation(value = "interface")
    public R helloGet(@Valid User user){
        userMapper.insert(user);
        return R.ok("添加成功");
    }

    @PostMapping(value = "/add2")
    public R add(@Valid @RequestBody GoodsAddVo goodsAddVo){
        return R.ok("添加成功");
    }
}
