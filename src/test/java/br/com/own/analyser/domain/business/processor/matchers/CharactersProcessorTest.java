package br.com.own.analyser.domain.business.processor.matchers;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Long.valueOf;

public class CharactersProcessorTest {

    private String password;
    private Long scoreValue;

    @Test
    public void calculateScoreBasedOnPasswordLengh(){
        giveAPassword();
        whenCalculetedYourCharactersScore();
        thenScoreMust();
    }

    private void thenScoreMust() {
        Assert.assertEquals(valueOf(28), scoreValue);
    }

    private void whenCalculetedYourCharactersScore() {
       this.scoreValue = new CharactersProcessor().getScoreValue(password);
    }

    private void giveAPassword() {
        this.password = "aaabbb1";
    }


}