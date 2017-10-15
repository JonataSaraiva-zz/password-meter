package br.com.own.analyser.domain.business.processor.matchers;

import org.junit.Test;

public class RepeatCharactersProcessorTest {

    @Test
    public void calculateScoreBasedOnRepeatCharacters(){
        Long scoreValue = RepeatCharactersProcessor.getScoreValue("aaabbb1");
        System.out.println("scoreValue = " + scoreValue);
    }

}