package br.com.own.analyser.domain.business.processor.matchers;

import org.springframework.stereotype.Service;

@Service
public class RepeatCharactersProcessor  {
    
    public static Long getScoreValue(String password){
        return calculateUsingDeduction(password);
    }
    
    private static Long calculateUsingDeduction(String password) {
        double deduction = 0D;
        double charsRepeted = 0D;

        boolean existCharRepeted = false;

        char[] chars = password.toCharArray();

        for (int i=0; i < chars.length; i++) {

            existCharRepeted = false;

            for (int b=0; b < chars.length; b++) {

                if (chars[i] == chars[b] && i != b) {
                    existCharRepeted = true;
					deduction += Math.abs( chars.length / ( b - i ) );
                }

            }

            if(existCharRepeted){
                charsRepeted++;
                Double uniqueChars = chars.length - charsRepeted;
                deduction = getValueForDeduction(uniqueChars, deduction);
            }

        }

        return (long) deduction;
    }

    private static double getValueForDeduction(Double uniqueChars, Double deduction) {
        return uniqueChars != 0 ? Math.ceil( deduction / uniqueChars) : Math.ceil(deduction);
    }

}
