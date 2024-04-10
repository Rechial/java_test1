package com.atguigu11.annotation;

/**
 * ClassName:MyAnnotation
 * Package:com.atguigu11.annotation
 * Description:
 *
 * @Author QF
 * Create 2024/1/4 21:43
 * @Version 1.0
 */
public @interface MyAnnotation {
    String value() default "hello";
}
