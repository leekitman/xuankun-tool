package com.leekitman.xuankun.math.expression;

import com.leekitman.xuankun.math.Expression;
import com.leekitman.xuankun.math.exception.XuankunCodeError;
import com.leekitman.xuankun.math.exception.XuankunNullArgumentException;
import lombok.Data;

/**
 * 基本运算法则
 */
@Data
public abstract class BasicComputeExpression implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    private Number leftNumber;
    private Number rightNumber;

    private State state;

    public Number compute(Number left, Number right) throws XuankunCodeError {
        state = State.DOUBLE_NUMBER;
        setLeftNumber(left);
        setRightNumber(right);
        check();
        return getResult();
    }

    public Number compute(Expression left, Number right) throws XuankunCodeError {
        state = State.EXPRESSION_NUMBER;
        setLeftExpression(left);
        setRightNumber(right);
        check();
        return getResult();
    }

    public Number compute(Expression left, Expression right) throws XuankunCodeError {
        state = State.DOUBLE_EXPRESSION;
        setLeftExpression(left);
        setRightExpression(right);
        check();
        return getResult();
    }


    public abstract Number getResult() throws XuankunCodeError;


    public void check() throws XuankunCodeError {
        switch (state) {
            case DOUBLE_NUMBER:
                if (getLeftNumber() == null || getRightNumber() == null) {
                    throw new XuankunNullArgumentException();
                }
                break;
            case DOUBLE_EXPRESSION:
                if (getLeftExpression() == null || getRightNumber() == null) {
                    throw new XuankunNullArgumentException();
                }
                break;
            case EXPRESSION_NUMBER:
                if (getLeftExpression() == null || getRightExpression() == null) {
                    throw new XuankunNullArgumentException();
                }
                break;
            default:
                throw new XuankunCodeError("代码错误：不存在的表达式状态：" + state.name());
        }
    }

    enum State {

        DOUBLE_NUMBER,
        DOUBLE_EXPRESSION,
        EXPRESSION_NUMBER
    }
}
