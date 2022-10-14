package ru.job4j.array;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLowerCase;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = !name.isEmpty() && isLowerCase(name.codePointAt(0));
            if (valid) {
                for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (!isSpecialSymbol(code) && !isDigit(code) && !isUpperLatinLetter(code) && !isLowerLatinLetter(code)) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 95;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}