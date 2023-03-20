package cool.wangshuo.ptms.service.impl;

import cool.wangshuo.ptms.mapper.ItemMapper;
import cool.wangshuo.ptms.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangshuo
 * @date 2023/3/20 18:01
 */

@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemMapper itemMapper;

}
