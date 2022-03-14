import org.junit.jupiter.api.*;

public class TestCalc {

    Calculator c;

    @BeforeEach
    public void setUp() {

        c = Calculator.instance.get();
    }

    //сложение
    @Test
    public void plus() {

        // given
        final int a = 1;
        final int b = 1;
        final int expected = 2;

        // when
        final int result = c.plus.apply(a, b);

        // then
        Assertions.assertEquals(expected, result);

    }

    //вычитание
    @Test
    public void minus() {

        // given
        final int a = 1;
        final int b = 1;
        final int expected = 0;

        // when
        final int result = c.minus.apply(a, b);

        // then
        Assertions.assertEquals(expected, result);

    }

    //деление
    @Test
    public void divide() {

        // given
        final int a = 100;
        final int b = 10;
        final int expected = 10;

        // when
        final int result = c.divide.apply(a, b);

        // then
        Assertions.assertEquals(expected, result);
    }
}
