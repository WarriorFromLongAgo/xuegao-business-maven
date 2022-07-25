package com.xuegao;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;

/**
 * 业务类
 *
 * @author xuegao
 * @version 1.0
 * @date 2022-3-10
 */
public interface AbstractCheckService {

    /**
     * checkIsNull
     * 判断入参的字段是否为空
     *
     * @param object:
     * @param errorMsg:
     * @author xuegao
     * @date 2022/4/25 15:13
     */
    default AbstractCheckService checkIsNull(Object object, String errorMsg) {
        if (isRealEmpty(object)) {
            throw new RuntimeException(errorMsg);
        }
        return this;
    }

    /**
     * checkLength
     * 判断入参的字段是否超过限制
     *
     * @param size:
     * @param length:
     * @param errorMsg:
     * @author xuegao
     * @date 2022/4/25 15:14
     */
    default AbstractCheckService checkLength(int size, int length, String errorMsg) {
        if (size > length) {
            throw new RuntimeException(errorMsg);
        }
        return this;
    }

    /**
     * isRealEmpty
     * 判断入参的字段是否为空
     *
     * @param object:
     * @return boolean
     * @author xuegao
     * @date 2022/4/25 15:15
     */
    default boolean isRealEmpty(Object object) {
        if (object == null) {
            return true;
        }
        if (object instanceof String) {
            return StringUtils.isBlank(object.toString());
        }
        return ObjectUtils.isEmpty(object);
    }

    /**
     * isNotRealEmpty
     * 判断入参的字段是否不为空
     *
     * @param object:
     * @return boolean
     * @author xuegao
     * @date 2022/4/25 15:15
     */
    default boolean isNotRealEmpty(Object object) {
        return !isRealEmpty(object);
    }
}