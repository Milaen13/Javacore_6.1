public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        calc.println.accept(a);
        int b = calc.minus.apply(1, 1);
        calc.println.accept(b);
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
        int d = calc.multiply.apply(1, 2);
        calc.println.accept(d);
        int e = calc.pow.apply(2);
        calc.println.accept(e);
        int f = calc.abs.apply(2);
        calc.println.accept(f);
        boolean g = calc.isPositive.test(-2);
        calc.println.accept(g);
    }
}