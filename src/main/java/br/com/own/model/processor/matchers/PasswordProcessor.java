package br.com.own.model.processor.matchers;

import org.springframework.stereotype.Service;

@Service
public interface PasswordProcessor {

    Long numberOfMatchsFor(String word);

    Long calculate(long chars);

    default Long getScoreValue(String word){
        Long chars = this.numberOfMatchsFor(word);
        return calculate(chars);
    }

}
