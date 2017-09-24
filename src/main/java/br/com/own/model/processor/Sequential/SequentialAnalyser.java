package br.com.own.model.processor.Sequential;

final class SequentialAnalyser {

    public static final int LIMIT_OF_SEQUENCE = 3;
    public static final int NOT_FOUND = -1;

    public static Long analyse(String word, SequentialPattern pattern){
        Long numbersInSequence = 0L;

        for (int i=0; i < pattern.getLenght(); i++) {
            String sequence = pattern.getValue().substring(i, i + LIMIT_OF_SEQUENCE);
            String inverseSequence = new StringBuilder(sequence).reverse().toString();

            if (word.indexOf(sequence) != NOT_FOUND || word.indexOf(inverseSequence) != NOT_FOUND) {
                numbersInSequence++;
            }
        }

        return numbersInSequence;
    }

}
