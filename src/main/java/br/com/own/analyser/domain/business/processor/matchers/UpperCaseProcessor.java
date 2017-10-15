package br.com.own.analyser.domain.business.processor.matchers;

import org.springframework.stereotype.Service;

@Service
public class UpperCaseProcessor implements PasswordProcessor {

    private String password;

    public Long numberOfMatchsFor(String password) {
        this.password = password;

        return password.chars()
                .mapToObj(i -> (char) i)
                .filter(Character::isUpperCase)
                .count();
    }

    @Override
    public Long calculate(long chars) {
        return chars == 0 ? 0 : (password.length() - chars) * 2;
    }

}
