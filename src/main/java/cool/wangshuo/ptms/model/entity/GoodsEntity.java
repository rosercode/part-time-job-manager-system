package cool.wangshuo.ptms.model.entity;

import cool.wangshuo.ptms.model.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangshuo
 * @description
 * @createDate 2022/10/26 13:59
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsEntity extends BaseEntity {

    // 商品名称
    private String name;

    // 商品类型
    private String goodType;

    // 商品价格
    private Integer price;

}