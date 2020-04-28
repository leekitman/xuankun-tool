package com.leekitman.xuankun.math.statistics;

import com.leekitman.xuankun.math.XKM;
import com.leekitman.xuankun.math.exception.XuankunCodeError;
import com.leekitman.xuankun.math.exception.XuankunNullArgumentException;

import java.util.List;

public interface StatisticsUtils {

    /**
     * 求平均数
     * @param numbers 数集
     * @return 数集的平均值
     * @throws XuankunCodeError 可能抛出代码错误问题
     */
    static Number average(List<Number> numbers) throws XuankunCodeError {
        if (numbers == null || numbers.isEmpty()) {
            throw new XuankunNullArgumentException();
        }
        Number sum = 0;
        for (Number number : numbers) {
            sum = XKM.plus().compute(sum, number).getResult();
        }
        return XKM.divided().compute(sum, numbers.size()).getResult();
    }
}
