package com.atguigu04_throw;

/**
 * ClassName:BelowZeroException
 * Package:com.atguigu04_throw
 * Description:
 *
 * @Author QF
 * Create 2024/4/9 11:43
 * @Version 1.0
 */
public class BelowZeroException extends Exception{

    static final long serialVersionUID = -74834611110L;
    public BelowZeroException(){

    }

    public BelowZeroException(String name){
        super(name);
    }

    public BelowZeroException(String message, Throwable cause){
        super(message,cause);
    }


}
