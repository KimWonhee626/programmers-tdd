package org.example.polynomial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolynomialTests {
    @Test
    @DisplayName("3 + 3 == 6")
    public void t1() {
        assertThat(Polynomial.calc("3 + 3")).isEqualTo(6);
    }

    @Test
    @DisplayName("50 + 300 == 350")
    public void t2() {
        assertThat(Polynomial.calc("50 + 300")).isEqualTo(350);
    }

    @Test
    @DisplayName("50 - 30 == 20")
    public void t3() {
        assertThat(Polynomial.calc("50 - 30")).isEqualTo(20);
    }

    @Test
    @DisplayName("10 - 20 + 30 == 20")
    public void t4() {
        assertThat(Polynomial.calc("10 - 20 + 30")).isEqualTo(20);
    }

    @Test
    @DisplayName("10 * -10 == -100")
    public void t5() {
        assertThat(Polynomial.calc("10 * -10")).isEqualTo(-100);
    }

    @Test
    @DisplayName("10 * 20 * 30 == 6000")
    public void t6() {
        assertThat(Polynomial.calc("10 * 20 * 30")).isEqualTo(6000);
    }

    @Test
    @DisplayName("10 + 5 * 2 == 20")
    public void t7() {
        assertThat(Polynomial.calc("10 + 5 * 2")).isEqualTo(20);
    }

    @Test
    @DisplayName("20 + 10 + 5 * 2 == 40")
    public void t8() {
        assertThat(Polynomial.calc("20 + 10 + 5 * 2")).isEqualTo(40);
    }

    @Test
    @DisplayName("10 * 20 - 20 * 30 == -400")
    public void t9() {
        assertThat(Polynomial.calc("10 * 20 - 20 * 30")).isEqualTo(-400);
    }

    @Test
    @DisplayName("10 * 20 + 10 + 5 * 2 == 220")
    public void t10() {
        assertThat(Polynomial.calc("10 * 20 + 10 + 5 * 2")).isEqualTo(220);
    }

    @Test
    @DisplayName("10 * -20 == -200")
    public void t11() {
        assertThat(Polynomial.calc("10 * -20")).isEqualTo(-200);
    }

    @Test
    @DisplayName("(10 + 20) == 30")
    public void t12() {
        assertThat(Polynomial.calc("(10 + 20)")).isEqualTo(30);
    }

}
