package ru.job4j.converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assertions.assertEquals(expected, out, eps);
    }

    @Test
    public void rubleToDollar() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assertions.assertEquals(expected, out, eps);

    }
}