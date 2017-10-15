package br.com.own.analyser.domain.business.processor.matchers;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Long.valueOf;

public class MiddleNumberOrSymbolsProcessorTest {

    private String password;
    private Long scoreValue;

    @Test
    public void calculateScoreBasedOnMiddleNumberOrSymbols(){
        giveAPassword();
        whenCalculetedYourCharactersScore();
        thenScoreMust();
    }

    private void thenScoreMust() {
        Assert.assertEquals(valueOf(10), scoreValue);
    }

    private void whenCalculetedYourCharactersScore() {
        this.scoreValue = new MiddleNumberOrSymbolsProcessor().getScoreValue(password);
    }

    private void giveAPassword() {
        this.password = "abc@##123";
    }

}