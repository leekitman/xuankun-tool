package com.leekitman.xuankun.math;

import com.leekitman.xuankun.math.expression.Divided;
import com.leekitman.xuankun.math.expression.Minus;
import com.leekitman.xuankun.math.expression.Plus;
import com.leekitman.xuankun.math.expression.Times;

/**
 * 数学公式计算唯一入口
 */
public abstract class XKM {

    /**
     * 不允许通过new方式创建对象
     */
    private XKM() {
    }

    /**
     * 基本运算：加法
     */
    public static Plus plus(){
        return new Plus();
    }

    /**
     * 基本运算：减法
     */
    public static Minus minus(){
        return new Minus();
    }

    /**
     * 基本运算：乘法
     */
    public static Times times(){
        return new Times();
    }

    /**
     * 基本运算：除法
     */
    public static Divided divided(){
        return new Divided();
    }

}
