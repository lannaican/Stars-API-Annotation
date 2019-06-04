package com.star.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Detail：SocketService添加该注解
 * Author：Stars
 * Create Time：2019/4/26 10:12
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface SocketService {
    String value();
}
