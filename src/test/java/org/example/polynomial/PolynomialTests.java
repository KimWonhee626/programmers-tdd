package org.example.polynomial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolynomialTests {
    @Test
    @DisplayName("3 + 3 = 6")
    public void t1() {
        assertThat(Polynomial.calc("3 + 3")).isEqualTo(6);
    }

    @Test
    @DisplayName("50 + 300 = 350")
    public void t2() {
        assertThat(Polynomial.calc("50 + 300")).isEqualTo(350);
    }

    @Test
    @DisplayName("50 - 30 = 20")
    public void t3() {
        assertThat(Polynomial.calc("50 - 30")).isEqualTo(20);
    }
}
