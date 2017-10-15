package br.com.own.analyser.domain.business.processor.consecutive;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Long.valueOf;

public class ConsecutiveLowerCaseProcessorTest {

    @Test
    public void calculateScoreBasedOnConsecutiveLowerCase(){
        Long score = new ConsecutiveLowerCaseProcessor().getScoreValue("aaabbb");
        Assert.assertEquals(valueOf(-10), score);
    }

}