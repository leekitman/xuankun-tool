package com.leekitman.xuankun.math.expression;

import com.leekitman.xuankun.math.exception.XuankunCodeError;
import com.leekitman.xuankun.math.exception.XuankunDividedByZeroException;

/**
 * 除法运算
 */
public class Divided extends BasicComputeExpression {
    @Override
    public Number getResult() throws XuankunCodeError {
        switch (getState()) {
            case DOUBLE_NUMBER:
                if (getRightNumber().doubleValue() == 0) {
                    throw new XuankunDividedByZeroException();
                }
                return getLeftNumber().doubleValue() / getRightNumber().doubleValue();
            case DOUBLE_EXPRESSION:
                if (getRightNumber().doubleValue() == 0) {
                    throw new XuankunDividedByZeroException();
                }
                return getLeftExpression().getResult().doubleValue() / getRightNumber().doubleValue();
            case EXPRESSION_NUMBER:
                double right = getRightExpression().getResult().doubleValue();
                if (right == 0) {
                    throw new XuankunDividedByZeroException();
                }
                return getLeftExpression().getResult().doubleValue() / right;
            default:
                throw new XuankunCodeError("代码错误：不存在的表达式状态：" + getState().name());
        }
    }
}
