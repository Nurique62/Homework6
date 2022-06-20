package ru.netology.sqr;


import static org.junit.jupiter.api.Assertions. *;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldFind3No() {
        SQRService service = new SQRService();

        int actual = service.calculate(200,300);
        int expected = 3;

        assertEquals(actual,expected);

    }
    @Test
    public void shouldFind0() {
        SQRService service = new SQRService();
        int actual = service.calculate(1,1);
        int expected = 0;
        assertEquals(actual,expected);
    }
}

