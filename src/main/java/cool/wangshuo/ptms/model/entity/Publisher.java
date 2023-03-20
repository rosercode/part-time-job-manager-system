package cool.wangshuo.ptms.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author wangshuo
 * @date 2023/3/20 17:54
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Publisher extends BaseEntity{

    /**
     * 发布人昵称
     */
    private String nickname;

    /**
     * 发布人相关注释
     */
    private String comment;

    /**
     * 微信号码
     */
    private String wxCode;

    /**
     * qq号码，
     */
    private String qqCode;

    /**
     * 手机号码
     */
    private String phone;
}
