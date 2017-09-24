package br.com.own.model.processor.Sequential;

import org.springframework.stereotype.Service;

@Service
public class SequentialSymbolAnalyser implements SequentialProcessor {

    @Override
    public Long analyse(String word){
        return SequentialAnalyser.analyse(word, SequentialPattern.SYMBOLS);
    }

}
