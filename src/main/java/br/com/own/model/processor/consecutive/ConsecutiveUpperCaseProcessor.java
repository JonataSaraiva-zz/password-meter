package br.com.own.model.processor.consecutive;

import static java.lang.Character.isUpperCase;

public class ConsecutiveUpperCaseProcessor extends ConsecutiveProcessor {

    @Override
    protected boolean isQualifiedForTypeAnalysed(Character newChar) {
        return isUpperCase(newChar) && isUpperCase(lastCharacter);
    }

}
