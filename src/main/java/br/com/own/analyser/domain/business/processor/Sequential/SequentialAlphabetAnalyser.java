package br.com.own.analyser.domain.business.processor.Sequential;

import org.springframework.stereotype.Service;

@Service
public class SequentialAlphabetAnalyser implements SequentialProcessor {

    @Override
    public Long analyse(String password){
        return SequentialAnalyser.analyse(password, SequentialPattern.ALPHABET);
    }

}
