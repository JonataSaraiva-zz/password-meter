package br.com.own.analyser.domain.business.processor.Sequential;


public enum SequentialPattern {

    NUMBERS("01234567890", 8),
    ALPHABET("abcdefghijklmnopqrstuvwxyz", 23),
    SYMBOLS(")!@#$%^&*()", 8);

    private String values;
    private Integer lenght;

    SequentialPattern(String values, Integer lenght) {
        this.values = values;
        this.lenght = lenght;
    }

    public String getValue() {
        return values;
    }

    public Integer getLenght() {
        return lenght;
    }
}
