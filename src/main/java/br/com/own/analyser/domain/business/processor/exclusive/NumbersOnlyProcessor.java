package br.com.own.analyser.domain.business.processor.exclusive;

import br.com.own.analyser.domain.business.processor.matchers.NumberProcessor;
import org.springframework.stereotype.Service;

@Service
public class NumbersOnlyProcessor implements OneTypeProcessor {

    private NumberProcessor numberAnalyser;

    public NumbersOnlyProcessor(NumberProcessor numberAnalyser) {
        this.numberAnalyser = numberAnalyser;
    }

    @Override
    public boolean validate(String password){
        Long totalOfNumbers = numberAnalyser.numberOfMatchsFor(password);
        return isAllCharactersThisType(password, totalOfNumbers);
    }

}
