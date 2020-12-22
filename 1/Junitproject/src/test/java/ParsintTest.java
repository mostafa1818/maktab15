import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ParsintTest {
//    public static void main(String arg[])  {
//
//
//        test1();
//        test2();
//        test3();
//    }
    @Test
    public   void test1()  {
        int input=0;
          input =Parsint.convert("-12");
          int []b={10};
          Assert.assertEquals("test", -12,input);
    }
    @Test( )
    public   void test2()  {
        int input=0;
        input =Parsint.convert("-33a");
        int []b={10};
        Assert.assertEquals("test", -121,input);
    }
    @Test( )
    public   void test3() {
        int input = 0;
        input = Parsint.convert("-33 ");
        int[] b = {10};
        Assert.assertEquals("test", -121, input);
    }

}
