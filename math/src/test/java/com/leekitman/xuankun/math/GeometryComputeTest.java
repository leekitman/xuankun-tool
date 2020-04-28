package com.leekitman.xuankun.math;

import com.leekitman.xuankun.math.exception.XuankunCodeError;
import com.leekitman.xuankun.math.geometry.AreaUtils;
import org.junit.Test;

public class GeometryComputeTest {

    @Test
    public void one() throws XuankunCodeError {
        System.out.println(AreaUtils.parallelogramArea(10, 10));
    }

    @Test
    public void one1() throws XuankunCodeError {
        System.out.println(AreaUtils.parallelTrapezoidArea(10, 20, 10));
    }

    @Test
    public void one2() throws XuankunCodeError {
        System.out.println(AreaUtils.triangleArea(10, 10));
    }

    @Test
    public void one3() throws XuankunCodeError {
        System.out.println(AreaUtils.circularArea(10));
    }
}
