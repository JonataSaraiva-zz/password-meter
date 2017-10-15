package br.com.own.analyser.domain.business.processor.consecutive;

import static java.lang.Character.isLowerCase;

public class ConsecutiveLowerCaseProcessor extends ConsecutiveProcessor {

    @Override
    protected boolean isQualifiedForTypeAnalysed(Character newChar) {
        return isLowerCase(newChar) && isLowerCase(lastCharacter);
    }


}
