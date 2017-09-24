package br.com.own.model.processor.matchers;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Long.valueOf;

public class UpperCaseProcessorTest {

    private String password;
    private Long scoreValue;

    @Test
    public void calculateScoreBasedOnUpperCaseLetters(){
        giveAPassword();
        whenCalculetedYourCharactersScore();
        thenScoreMustBe();
    }

    private void thenScoreMustBe() {
        Assert.assertEquals(valueOf(8), scoreValue);
    }

    private void whenCalculetedYourCharactersScore() {
        this.scoreValue = new UpperCaseProcessor().getScoreValue(password);
    }

    private void giveAPassword() {
        this.password = "aaabbb";
    }

}