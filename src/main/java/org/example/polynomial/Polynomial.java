package org.example.polynomial;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Polynomial {
    public Polynomial(String exp) {

    }

    public static int calc(String exp) {
        exp = stripOuterBrackets(exp);

        // 매개변수에 단일항이 들어오면 그대로 리턴
        if (!(exp.contains(" "))) {
            return Integer.parseInt(exp);
        }

        boolean needToMulti = exp.contains(" * ");
        boolean needToPlus = exp.contains(" + ") || exp.contains(" - ");

        boolean needToCompound = needToMulti && needToPlus;

        if (needToCompound) {
            exp = exp.replaceAll("- ", "+ -");
            String[] bits = exp.split(" \\+ ");

            String newExp = Arrays.stream(bits)
                    .mapToInt(Polynomial::calc)
                    .mapToObj(e -> e + "") // String으로 변경
                    .collect(Collectors.joining(" + "));

            return calc(newExp);
        } else if (needToPlus) {
            exp = exp.replaceAll("- ", "+ -");

            String[] bits = exp.split(" \\+ ");
            int sum = 0;

            for (int i = 0; i < bits.length; i++) {
                sum += Integer.parseInt(bits[i]);
            }

            return sum;
        } else if (needToMulti) {
            String[] bits = exp.split(" \\* ");
            int sum = 1;

            for (int i = 0; i < bits.length; i++) {
                sum *= Integer.parseInt(bits[i]);
            }

            return sum;
        }

        throw new RuntimeException("올바른 계산식이 아닙니다.");
    }

    private static String stripOuterBrackets(String exp) {

        int outerBracketsCount = 0;

        while (exp.charAt(outerBracketsCount) == '(' && exp.charAt(exp.length() - 1 - outerBracketsCount) == ')') {
            outerBracketsCount++;
        }

        if (outerBracketsCount == 0) return exp;

        return exp.substring(outerBracketsCount, exp.length() - outerBracketsCount);
    }

}
