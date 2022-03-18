package hu.nive.ujratervezes.zarovizsga.digitscounter;


import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
        if (s != null) {
            return countDigits(s).size();
        } else {
            return 0;
        }
    }

    private Set<Character> countDigits(String s) {
        Set<Character> digits = new HashSet<>();
        for (Character letter : s.toCharArray()) {
            if (Character.isDigit(letter)) {
                digits.add(letter);
            }
        }
        return digits;
    }
}
