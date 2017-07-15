package com.jmj.common.annotation;

import java.lang.annotation.*;

/**
 * Created by ryao on 2017/7/11.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
public @interface ImportantField {
}
