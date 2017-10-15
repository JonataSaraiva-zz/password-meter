package br.com.own.analyser.domain.business.processor.exclusive;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LettersOnlyProcessorTest {

    @Autowired
    LettersOnlyProcessor lettersOnlyProcessor;

    @Test
    public void teste(){
        Long scoreValue = lettersOnlyProcessor.getScoreValue("aaabbb");
        System.out.println("scoreValue = " + scoreValue);
    }


}