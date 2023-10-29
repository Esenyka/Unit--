package hw1;

public class Calculator {
    public static int calculateDiscount(int purchase, int discount) {
        if ((purchase >= 1) & (discount >= 1)) {
            int dis = (discount * purchase) / 100;
            return purchase - dis;
        } else {
            throw new ArithmeticException();
        }
    }

}
