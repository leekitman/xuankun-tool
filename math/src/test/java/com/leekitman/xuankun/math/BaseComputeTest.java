package com.leekitman.xuankun.math;

import com.leekitman.xuankun.math.exception.XuankunCodeError;
import org.junit.Test;

public class BaseComputeTest {

    @Test
    public void aa1() {
        Integer a = 203;
        Double b = 405.2;
        System.out.println(a.doubleValue());
        System.out.println(b.doubleValue());
        double v = a + b;
        System.out.println(a + b);
    }

    /**
     * (3+4)+(5+6)+(7+8)
     */
    @Test
    public void aa2() throws XuankunCodeError {
        Integer a = 3;
        Integer b = 4;
        Integer c = 5;
        Integer d = 6;
        Integer e = 7;
        Integer f = 8;
        System.out.println(XKM.plus().compute(
                XKM.plus().compute(
                        XKM.plus().compute(a, b),
                        XKM.plus().compute(c, d)
                ),
                XKM.plus().compute(e, f)
        ).getResult());
    }

    /**
     * all-(8-7)-[6-(5-4)]-(3-2)
     */
    @Test
    public void aa3() throws XuankunCodeError {
        Double all = 34.123456789;
        Integer z = 2;
        Integer a = 3;
        Integer b = 4;
        Integer c = 5;
        Integer d = 6;
        Integer e = 7;
        Integer f = 8;
        // 转换成加法公式：
        System.out.println(XKM.minus().compute(             //【all-(8-7)-[6-(5-4)]-(3-2)】-【7】
                XKM.minus().compute(             //【all-(8-7)-[6-(5-4)]】-【(3-2)】
                        XKM.minus().compute(                        //【all-(8-7)】-【6-(5-4)】
                                XKM.minus().compute(all,            //【all】-【8-7】
                                        XKM.minus().compute(f, e)   //【8】-【7】
                                ),
                                XKM.minus().compute(d,              //【6】-【5-4】
                                        XKM.minus().compute(c, b)   //【5】-【4】
                                )
                        ),
                        XKM.minus().compute(a, z)                   //【3】-【2】
                ),
                e
        ).getResult());
    }

    @Test
    public void aa4() throws XuankunCodeError {
        Double a = 3.5;
        System.out.println(XKM.times().compute(a, a).getResult());
    }

    @Test
    public void aa5() throws XuankunCodeError {
        Double a = 3.5;
        Double b = 0.0;
        Integer c = 5;
        System.out.println(XKM.divided().compute(a, c).getResult());
    }
}
