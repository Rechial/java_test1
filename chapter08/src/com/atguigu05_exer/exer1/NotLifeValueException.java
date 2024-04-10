package com.atguigu05_exer.exer1;

/**
 * ClassName:NotLifeValueException
 * Package:com.atguigu05_exer.exer1
 * Description:
 *  (1)自定义异常类NoLifeValueException继承RuntimeException
 *  ①提供空参构造和有参构造
 *  ②在有参构造中，需要调用父类的有参构造，把异常信息传入
 * @Author QF
 * Create 2024/4/9 15:31
 * @Version 1.0
 */
public class NotLifeValueException extends RuntimeException{

    static final long serialVersionUID = -21749720L;
    public NotLifeValueException(){

    }

    public NotLifeValueException(String msg){
        super(msg);
    }
}
