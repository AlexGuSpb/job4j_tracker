package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMaxThreeNumbers() {
        int left = 2;
        int right = 1;
        int up = 3;
        int result = Max.max(left, right, up);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMaxFourNumbers() {
        int left = 2;
        int right = 1;
        int up = 3;
        int down = 6;
        int result = Max.max(left, right, up, down);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}