package cool.wangshuo.ptms.component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;


/**
 * @author wangshuo
 * @description
 * @createDate 2022/10/26 12:33
 */

@Component
public class MetaHandler implements MetaObjectHandler {

    /**
     * 新增数据执行
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        boolean hasSetter = metaObject.hasSetter("createTime");
        if (hasSetter) {
            this.setFieldValByName("createTime", new Date(), metaObject);
        }
        hasSetter = metaObject.hasSetter("updateTime");
        if (hasSetter) {
            this.setFieldValByName("updateTime", new Date(), metaObject);
        }
    }

    /**
     * 更新数据执行
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        boolean hasSetter = metaObject.hasSetter("updateTime");
        if (hasSetter) {
            this.setFieldValByName("updateTime", new Date(), metaObject);
        }
    }
}