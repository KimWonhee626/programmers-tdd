package org.example.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("144 => 1")
    void t1() {
        assertThat(new Solution().solution(144)).isEqualTo(1);
    }

    @Test
    @DisplayName("976 => 2")
    void t2() {
        assertThat(new Solution().solution(976)).isEqualTo(2);
    }


}
