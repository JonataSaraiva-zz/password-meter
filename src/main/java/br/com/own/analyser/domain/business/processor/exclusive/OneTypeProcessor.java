package br.com.own.analyser.domain.business.processor.exclusive;

public interface OneTypeProcessor {

    boolean validate(String password);

    default Long getScoreValue(String password){
        return validate(password) ? password.length() : 0L;
    }

    default boolean isAllCharactersThisType(String word, Long charsFound){
        return word.length() == charsFound;
    };

}
