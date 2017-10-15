package br.com.own.analyser.util;

import java.util.Arrays;

public class NumberUtil {

    public static Long sum (Long ... numbers){
        return Arrays.stream(numbers)
                    .mapToLong(Long::longValue)
                    .sum();
    }

}
