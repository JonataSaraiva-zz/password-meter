package br.com.own.analyser.domain.business.processor.consecutive;

public abstract class ConsecutiveProcessor {

    private Long occurrences = 0L;
    protected Character lastCharacter = Character.MAX_VALUE;

    public Long getScoreValue(String password){
        Long occurrences = this.calculateNumberOfOccurrences(password);
        return this.calcule(occurrences);
    }

    private Long calculateNumberOfOccurrences(String password){

        password.chars()
                .mapToObj(i -> (char) i)
                .forEach(this::computeTypeOfCharacter);

        return this.occurrences;
    }

    private void computeTypeOfCharacter(Character newChar) {
        if(isQualifiedForTypeAnalysed(newChar)) {
            this.occurrences ++;
        }

        this.lastCharacter = newChar;
    }

    private Long calcule(Long occurrences){
        return  (occurrences * 2);
    }

    protected abstract boolean isQualifiedForTypeAnalysed(Character newChar);

}
