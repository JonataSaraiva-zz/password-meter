package br.com.own.controller;

import br.com.own.model.PasswordMetric;
import br.com.own.service.PasswordMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passwordMeter")
public class PasswordMeterController {

    private PasswordMeterService passwordMeterService;

    @Autowired
    public PasswordMeterController(PasswordMeterService passwordMeterService) {
        this.passwordMeterService = passwordMeterService;
    }

    @GetMapping
    @ResponseBody
    public PasswordMetric analyse(@PathVariable String password){
        return passwordMeterService.analyse(password);
    }

}
