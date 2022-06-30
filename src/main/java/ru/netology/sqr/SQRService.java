package ru.netology.sqr;

public class SQRService {

    public int calcSqrNumber(int initialBoundary, int finalBoundary) {

        int result = 0;
        int x = 99;

        for (int i = 10; i <= x; i++) {
            if (i * i >= initialBoundary && i * i <= finalBoundary) {
                result = result + 1;
            }
        }
        return result;

    }

}
