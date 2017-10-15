package br.com.own.analyser.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberUtilTest {

    @Test
    public void mustSumAnyLongNumbers(){
        Long total = NumberUtil.sum(1L, 10L, 5L);
        assertEquals(Long.valueOf(16), total);
    }

}