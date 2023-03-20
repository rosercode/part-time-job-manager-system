package cool.wangshuo.ptms.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author wangshuo
 * @date 2023/3/20 17:58
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Item extends BaseEntity{

    /**
     * 问题概述
     */
    private String summary;

    /**
     * 问题
     */
    private String question;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 死线（截至时间）
     */
    private Date deadLine;

    /**
     * 过程性文档(富文本)
     */
    private String processDocument;

    /**
     * 实际结束（完成）时间
     */
    private String realEndTime;

    /**
     * 是否结束（完成）
     */
    private int end;

    /**
     * 发布人id
     */
    private Integer publisherId;

    /**
     * 价格（人民币）
     */
    private Integer price;

    /**
     * 支付方式1、支付宝2、微信3、其它
     */
    private Integer payType;

}
