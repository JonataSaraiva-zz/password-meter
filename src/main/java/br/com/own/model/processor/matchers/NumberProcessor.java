package br.com.own.model.processor.matchers;

import org.springframework.stereotype.Service;

@Service
public class NumberProcessor implements PasswordProcessor {

    @Override
    public Long numberOfMatchsFor(String word){
        return word.chars()
                .mapToObj(i -> (char) i)
                .filter(Character::isDigit)
                .count();
    }

    @Override
    public Long calculate(long chars) {
        return chars * 4;
    }

}
