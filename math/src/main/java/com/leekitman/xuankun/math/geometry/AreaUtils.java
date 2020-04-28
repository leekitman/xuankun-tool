package com.leekitman.xuankun.math.geometry;

import com.leekitman.xuankun.math.XKM;
import com.leekitman.xuankun.math.exception.XuankunCodeError;

/**
 * 面积计算方法
 */
public interface AreaUtils {

    /**
     * 求平行四边形面积
     * 计算公式：宽 * 高
     *
     * @param width  宽
     * @param height 高
     * @return 平行四边形面积
     * @throws XuankunCodeError 代码错误问题
     */
    @SuppressWarnings("SuspiciousNameCombination")
    static Number parallelogramArea(Number width, Number height) throws XuankunCodeError {
        return XKM.times().compute(width, height).getResult();
    }

    /**
     * 求平行梯形面积
     * 计算公式：[(上边宽 + 下边宽) * 高] / 2
     *
     * @param topWidth    上边宽
     * @param bottomWidth 下边宽
     * @param height      高
     * @return 平行梯形面积
     * @throws XuankunCodeError 代码错误问题
     */
    static Number parallelTrapezoidArea(Number topWidth, Number bottomWidth, Number height) throws XuankunCodeError {
        return XKM.divided().compute(
                // 先求平行四边形面积：(上边宽 + 下边宽) * 高
                parallelogramArea(XKM.plus().compute(topWidth, bottomWidth).getResult(), height),
                2
        ).getResult();
    }

    /**
     * 求三角形面积
     * 计算公式：(宽 * 高) / 2
     *
     * @param width  宽
     * @param height 高
     * @return 三角形面积
     * @throws XuankunCodeError 代码错误问题
     */
    static Number triangleArea(Number width, Number height) throws XuankunCodeError {
        return parallelTrapezoidArea(0, width, height);
    }

    /**
     * 求圆的面积
     * 计算公式：Pi * 半径^2
     *
     * @param radius 半径
     * @return 圆的面积
     * @throws XuankunCodeError 代码错误问题
     */
    static Number circularArea(Number radius) throws XuankunCodeError {
        return XKM.times().compute(Math.PI, Math.pow(radius.doubleValue(), 2)).getResult();
    }
}
