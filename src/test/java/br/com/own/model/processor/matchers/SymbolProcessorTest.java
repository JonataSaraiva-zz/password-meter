package br.com.own.model.processor.matchers;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Long.valueOf;

public class SymbolProcessorTest {

    private String password;
    private Long scoreValue;

    @Test
    public void calculateScoreBasedOnSymbolProcessor(){
        giveAPassword();
        whenCalculetedYourCharactersScore();
        thenScoreMust();
    }

    private void thenScoreMust() {
        Assert.assertEquals(valueOf(18), scoreValue);
    }

    private void whenCalculetedYourCharactersScore() {
        this.scoreValue = new SymbolProcessor().getScoreValue(password);
    }

    private void giveAPassword() {
        this.password = "aa%%#c123";
    }

}