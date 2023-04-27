package org.example.p42860;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.MethodName.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionTests {

        @Test
        @DisplayName("BAA → 1")
        void t01() {
                assertThat(
                        new Solution().solution("BAA")
                ).isEqualTo(
                        1
                );
        }

        @Test
        @DisplayName("CAA → 2")
        void t02() {
                assertThat(
                        new Solution().solution("CAA")
                ).isEqualTo(
                        2
                );
        }

        @Test
        @DisplayName("JEROEN -> 56")
        void t03() {
                assertThat(
                        new Solution().solution("JEROEN")
                ).isEqualTo(
                        56
                );
        }

        @Test
        @DisplayName("AAAAA → 0")
        void t4() {
                assertThat(
                        new Solution().solution("AAAAA")
                ).isEqualTo(
                        0
                );
        }

        @Test
        @DisplayName("ADAAAABCDKK -> 7")
        void t05() {
                assertThat(
                        new Solution().solution("ADAAAABCDKK")
                ).isEqualTo(
                        7
                );
        }

        @Test
        @DisplayName("B -> 1")
        void t06() {
                assertThat(
                        new Solution().solution("B")
                ).isEqualTo(
                        1
                );
        }

}
