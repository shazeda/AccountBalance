import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by shazeda on 10/30/17.
 */
public class AccountTest {

    @Test
    public void digitTest1() {
        float number = 123.456f;
        int actual = Account.decimalDigits(number);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void digitTest2() {
        float number = 123.45679f;
        int actual = Account.decimalDigits(number);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void digitTest3() {
        float number = 123f;
        int actual = Account.decimalDigits(number);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void digitTest4() {
        float number = 123.9f;
        int actual = Account.decimalDigits(number);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void digitTest5() {
        float number = 123.95f;
        int actual = Account.decimalDigits(number);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }
}
