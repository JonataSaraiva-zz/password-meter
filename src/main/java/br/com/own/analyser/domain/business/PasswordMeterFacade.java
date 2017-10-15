package br.com.own.analyser.domain.business;

import br.com.own.analyser.domain.business.processor.Sequential.SequentialProcessor;
import br.com.own.analyser.domain.business.processor.consecutive.ConsecutiveLowerCaseProcessor;
import br.com.own.analyser.domain.business.processor.consecutive.ConsecutiveNumberCaseProcessor;
import br.com.own.analyser.domain.business.processor.consecutive.ConsecutiveProcessor;
import br.com.own.analyser.domain.business.processor.consecutive.ConsecutiveUpperCaseProcessor;
import br.com.own.analyser.domain.business.processor.exclusive.OneTypeProcessor;
import br.com.own.analyser.domain.business.processor.matchers.PasswordProcessor;
import br.com.own.analyser.domain.business.processor.matchers.RepeatCharactersProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

import static java.util.Arrays.asList;

@Service
public class PasswordMeterFacade {

    private Collection<PasswordProcessor> passwordProcessor;
    private Collection<SequentialProcessor> sequencialProcessor;
    private Collection<OneTypeProcessor> oneTypeProcessors;

    @Autowired
    public PasswordMeterFacade(Collection<PasswordProcessor> passwordProcessor, Collection<SequentialProcessor> sequencialProcessor, Collection<OneTypeProcessor> oneTypeProcessors) {
        this.passwordProcessor = passwordProcessor;
        this.sequencialProcessor = sequencialProcessor;
        this.oneTypeProcessors = oneTypeProcessors;
    }

    public Long calculateScoreForMatchersRequirements(String password){
        return passwordProcessor.stream()
                        .mapToLong(processor -> processor.getScoreValue(password))
                        .sum();
    }

    public Long calculateScoreForExclusiveRequirements(String password) {
        return oneTypeProcessors.stream()
                        .mapToLong(processor -> processor.getScoreValue(password))
                        .sum();
    }

    public Long calculateScoreForSequentialRequirements(String password) {
        return sequencialProcessor.stream()
                        .mapToLong(processor -> processor.getScoreValue(password))
                        .sum();
    }

    public Long calculateScoreForRepeatCharacters(String password) {
        return RepeatCharactersProcessor.getScoreValue(password);
    }

    public Long calculateScoreForConsecutiveRequirements(String password) {
        List<ConsecutiveProcessor> consecutiveProcessors = asList(new ConsecutiveLowerCaseProcessor(),
                                                                  new ConsecutiveUpperCaseProcessor(),
                                                                  new ConsecutiveNumberCaseProcessor());

        return consecutiveProcessors.stream()
                                .mapToLong(processor -> processor.getScoreValue(password))
                                .sum();
    }
}
