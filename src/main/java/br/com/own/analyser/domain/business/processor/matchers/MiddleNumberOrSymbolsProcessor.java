package br.com.own.analyser.domain.business.processor.matchers;

import org.springframework.stereotype.Service;

import static java.util.Objects.requireNonNull;

@Service
public class MiddleNumberOrSymbolsProcessor implements PasswordProcessor {

    public static final int SECOND_ITEM = 1;

    @Override
    public Long numberOfMatchsFor(String password) {
        requireNonNull(password);

        String middleContent = password.substring(SECOND_ITEM, password.length() - 1);

        return middleContent.chars()
                    .mapToObj(i -> (char) i)
                    .filter(c -> !Character.isLetter(c))
                    .count();
    }

    @Override
    public Long calculate(long chars) {
        return chars * 2;
    }

}
