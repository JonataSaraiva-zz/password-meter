package br.com.own.model.processor.consecutive;

import static java.lang.Character.isLowerCase;

public class ConsecutiveLowerCaseProcessor extends ConsecutiveProcessor {

    @Override
    protected boolean isQualifiedForTypeAnalysed(Character newChar) {
        return isLowerCase(newChar) && isLowerCase(lastCharacter);
    }


}
