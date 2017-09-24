package br.com.own.model.processor.consecutive;

import static java.lang.Character.isDigit;

public class ConsecutiveNumberCaseProcessor extends ConsecutiveProcessor {

    @Override
    protected boolean isQualifiedForTypeAnalysed(Character newChar) {
        return isDigit(newChar) && isDigit(lastCharacter);
    }

}
