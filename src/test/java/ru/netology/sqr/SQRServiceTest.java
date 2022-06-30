package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test

    public void testNumberOfSquaresMinInitialAndFinalBoundary() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrNumber(1, 99);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testNumbersOfSquaresResultSeven() {
        SQRService service = new SQRService();

        int expected = 7;
        int actual = service.calcSqrNumber(100, 260);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNumbersOfSquaresNegativeInitialBoundary() {
        SQRService service = new SQRService();

        int expected = 14;
        int actual = service.calcSqrNumber(-100, 530);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNumbersOfSquaresMaxResult() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calcSqrNumber(100, 30_000);

        Assertions.assertEquals(expected, actual);
    }

}
