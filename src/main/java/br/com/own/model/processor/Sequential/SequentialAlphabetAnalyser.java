package br.com.own.model.processor.Sequential;

import org.springframework.stereotype.Service;

@Service
public class SequentialAlphabetAnalyser implements SequentialProcessor {

    @Override
    public Long analyse(String password){
        return SequentialAnalyser.analyse(password, SequentialPattern.ALPHABET);
    }

}
