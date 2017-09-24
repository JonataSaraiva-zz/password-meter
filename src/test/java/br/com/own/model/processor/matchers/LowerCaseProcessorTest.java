package br.com.own.model.processor.matchers;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Long.valueOf;


public class LowerCaseProcessorTest {

    private String password;
    private Long scoreValue;

    @Test
    public void calculateScoreBasedOnLowerCaseLetters(){
        giveAPassword();
        whenCalculetedYourCharactersScore();
        thenScoreMustBe();
    }

    private void thenScoreMustBe() {
        Assert.assertEquals(valueOf(2), scoreValue);
    }

    private void whenCalculetedYourCharactersScore() {
        this.scoreValue = new LowerCaseProcessor().getScoreValue(password);
    }

    private void giveAPassword() {
        this.password = "aaabbb1";
    }

}