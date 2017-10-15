package br.com.own.analyser.domain.business.processor.matchers;

import org.springframework.stereotype.Service;

import static java.lang.Long.valueOf;

@Service
public class CharactersProcessor implements PasswordProcessor {

    @Override
    public Long calculate(long chars) {
        return chars * 4;
    }

    @Override
    public Long numberOfMatchsFor(String word){
        return valueOf(word.length());
    }

}
