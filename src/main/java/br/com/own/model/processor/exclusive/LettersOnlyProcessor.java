package br.com.own.model.processor.exclusive;

import br.com.own.model.processor.matchers.LowerCaseProcessor;
import br.com.own.model.processor.matchers.UpperCaseProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LettersOnlyProcessor implements OneTypeProcessor {

    private UpperCaseProcessor upperCaseAnalyser;
    private LowerCaseProcessor lowerCaseAnalyser;

    @Autowired
    public LettersOnlyProcessor(UpperCaseProcessor upperCaseAnalyser, LowerCaseProcessor lowerCaseAnalyser) {
        this.upperCaseAnalyser = upperCaseAnalyser;
        this.lowerCaseAnalyser = lowerCaseAnalyser;
    }

    public boolean validate(String password){
        Long matchsUpperCase = upperCaseAnalyser.numberOfMatchsFor(password);
        Long matchsLowerCase = lowerCaseAnalyser.numberOfMatchsFor(password);

        Long numberOfLetters = matchsLowerCase + matchsUpperCase;

        return isAllCharactersThisType(password, numberOfLetters);
    }

}
