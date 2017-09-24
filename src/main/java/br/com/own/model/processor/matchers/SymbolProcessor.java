package br.com.own.model.processor.matchers;

import org.springframework.stereotype.Service;

@Service
public class SymbolProcessor implements PasswordProcessor {

    public Long numberOfMatchsFor(String word){
        return word.chars()
                .mapToObj(i -> (char) i)
                .filter(c -> !Character.isLetterOrDigit(c))
                .count();
    }

    @Override
    public Long calculate(long chars) {
        return chars * 6;
    }

}
