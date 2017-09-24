package br.com.own.model.processor.matchers;

import org.springframework.stereotype.Service;

@Service
public class LowerCaseProcessor implements PasswordProcessor {

    private String password;

    @Override
    public Long numberOfMatchsFor(String password){
        this.password = password;

        return password.chars()
                .mapToObj(i -> (char) i)
                .filter(Character::isLowerCase)
                .count();
    }

    @Override
    public Long calculate(long chars) {
        return  chars == 0 ? 0 : ( password.length() - chars ) * 2;
    }

}
