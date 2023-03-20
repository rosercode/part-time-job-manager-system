package cool.wangshuo.ptms.controller;

import com.baomidou.mybatisplus.extension.api.R;
import cool.wangshuo.ptms.model.vo.GoodsAddVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/hello")
@Api(value = "Hello API")
public class HelloController {

    @GetMapping(value = "/add")
    @ApiOperation(value = "interface")
    public R helloGet(@Valid GoodsAddVo goodsAddVo){
        return R.ok("添加成功");
    }

    @PostMapping(value = "/add")
    public R add(@Valid @RequestBody GoodsAddVo goodsAddVo){
        return R.ok("添加成功");
    }
}
