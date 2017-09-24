package br.com.own.model.processor.matchers;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Long.valueOf;
import static org.junit.Assert.assertEquals;

public class NumberProcessorTest {

    private String password;
    private Long scoreValue;

    @Test
    public void calculateScoreBasedOnCountNumbers(){
        giveAPassword();
        whenCalculetedYourCharactersScore();
        thenScoreMust();
    }

    private void thenScoreMust() {
        assertEquals(valueOf(4), scoreValue);
    }

    private void whenCalculetedYourCharactersScore() {
        this.scoreValue = new NumberProcessor().getScoreValue(password);
    }

    private void giveAPassword() {
        this.password = "aaabbb1";
    }

}