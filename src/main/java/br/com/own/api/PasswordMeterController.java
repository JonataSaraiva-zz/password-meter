package br.com.own.api;

import br.com.own.analyser.domain.model.PasswordMetric;
import br.com.own.analyser.domain.business.PasswordMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/passwordMeter")
public class PasswordMeterController {

    private PasswordMeterService passwordMeterService;

    @Autowired
    public PasswordMeterController(PasswordMeterService passwordMeterService) {
        this.passwordMeterService = passwordMeterService;
    }

    @ResponseBody
    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public PasswordMetric analyse(@PathVariable String password){
        return passwordMeterService.analyse(password);
    }

}
