package com.leekitman.xuankun.math;

import com.leekitman.xuankun.math.exception.XuankunCodeError;

/**
 * 基本运算表达式
 */
public interface Expression {

    Number getResult() throws XuankunCodeError;
}
