package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FactTest {

    @Test
    void whenException() {
        Fact one = new Fact();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    one.calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("N could not be less than 0.");
    }

    @Test
    public void whenExceptionTwo() {
        Fact second = new Fact();
        int argument = 3;
        int expected = 6;
        int result = second.calc(argument);
        assertThat(result).isEqualTo(expected);
    }
}
