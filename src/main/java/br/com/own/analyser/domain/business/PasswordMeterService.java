package br.com.own.analyser.domain.business;

import br.com.own.analyser.domain.model.PasswordMetric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import static br.com.own.analyser.util.NumberUtil.sum;

@Service
@RequestScope
public class PasswordMeterService {

    private PasswordMeterFacade facade;

    @Autowired
    public PasswordMeterService(PasswordMeterFacade facade) {
        this.facade = facade;
    }

    public PasswordMetric analyse(String password) {
        Long scoreMatchers = facade.calculateScoreForMatchersRequirements(password);

        Long scoreExclusive = facade.calculateScoreForExclusiveRequirements(password);
        Long scoreSequential = facade.calculateScoreForSequentialRequirements(password);
        Long scoreConsecutive = facade.calculateScoreForConsecutiveRequirements(password);
        Long scoreRepeatedChars = facade.calculateScoreForRepeatCharacters(password);

        long finalScore = scoreMatchers - sum(scoreExclusive, scoreSequential, scoreConsecutive, scoreRepeatedChars);

        return new PasswordMetric(finalScore);
    }

}
