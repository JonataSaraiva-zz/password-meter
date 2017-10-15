package br.com.own.analyser.domain.model;


import lombok.Data;

@Data
public class PasswordMetric {

    private Long score;
    private Complexity complexity;

    public PasswordMetric(Long score) {
        this.score = score;
        this.complexity = complexity;
    }

}
