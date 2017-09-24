package br.com.own.model.processor.Sequential;

public interface SequentialProcessor {

    Long analyse(String password);

    default Long getScoreValue(String password){
        Long occurrences = this.analyse(password);
        return this.calculate(occurrences);
    }

    default Long calculate(Long ocurrences){
        return ocurrences * 3;
    }

}
