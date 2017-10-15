package br.com.own.analyser.domain.business.processor.consecutive;

import static java.lang.Character.isUpperCase;

public class ConsecutiveUpperCaseProcessor extends ConsecutiveProcessor {

    @Override
    protected boolean isQualifiedForTypeAnalysed(Character newChar) {
        return isUpperCase(newChar) && isUpperCase(lastCharacter);
    }

}
