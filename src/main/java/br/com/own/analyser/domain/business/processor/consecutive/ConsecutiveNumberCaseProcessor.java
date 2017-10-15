package br.com.own.analyser.domain.business.processor.consecutive;

import static java.lang.Character.isDigit;

public class ConsecutiveNumberCaseProcessor extends ConsecutiveProcessor {

    @Override
    protected boolean isQualifiedForTypeAnalysed(Character newChar) {
        return isDigit(newChar) && isDigit(lastCharacter);
    }

}
