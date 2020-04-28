package com.leekitman.xuankun.math.expression;

import com.leekitman.xuankun.math.exception.XuankunCodeError;

/**
 * 乘法运算
 */
public class Times extends TwoUnitExpression{
    @Override
    public Number getResult() throws XuankunCodeError {
        switch (getState()) {
            case DOUBLE_NUMBER:
                return getLeftNumber().doubleValue() * getRightNumber().doubleValue();
            case DOUBLE_EXPRESSION:
                return getLeftExpression().getResult().doubleValue() * getRightNumber().doubleValue();
            case EXPRESSION_NUMBER:
                return getLeftExpression().getResult().doubleValue() * getRightExpression().getResult().doubleValue();
            default:
                throw new XuankunCodeError("代码错误：不存在的表达式状态：" + getState().name());
        }
    }
}
