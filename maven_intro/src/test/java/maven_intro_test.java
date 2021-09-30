import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class maven_intro_test {
    @Test
    public void test1(){
        String expected = "hello world";
        String actual=maven_intro.testCase();
        assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        String expected = "hello world";
        String actual=maven_intro.testCase();
        assertEquals(expected, actual);
    }
}
