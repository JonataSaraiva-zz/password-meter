package br.com.own.service;

import br.com.own.analyser.domain.business.PasswordMeterService;
import br.com.own.analyser.domain.model.PasswordMetric;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PasswordMeterServiceTest {

    @Autowired
    PasswordMeterService passwordMeterService;

    @Test
    public void teste(){
        PasswordMetric metric = passwordMeterService.analyse("aaabbb1");
        System.out.println("metric = " + metric);
    }
}