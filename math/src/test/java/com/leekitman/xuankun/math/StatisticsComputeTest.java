package com.leekitman.xuankun.math;

import com.leekitman.xuankun.math.exception.XuankunCodeError;
import com.leekitman.xuankun.math.statistics.StatisticsUtils;
import org.assertj.core.util.Lists;
import org.junit.Test;

public class StatisticsComputeTest {

    @Test
    public void average() throws XuankunCodeError {
        System.out.println(StatisticsUtils.average(Lists.newArrayList(1,2,3)));
    }

    @Test
    public void average2() throws XuankunCodeError {
        System.out.println(StatisticsUtils.average(Lists.newArrayList(1,-2,3)));
    }
}
