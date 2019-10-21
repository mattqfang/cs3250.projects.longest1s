
import org.junit.Test;
import org.junit.Assert;

public class LongestOnes_Test {

    @Test
    public void Test_Success_0() {
        Assert.assertTrue(LongestOnes.LongestOnes(0) == 0); //0000
    }

    @Test
    public void Test_Success_3(){
        Assert.assertTrue(LongestOnes.LongestOnes(3) == 2); //0011
    }

    @Test
    public void Test_Success_14(){
        Assert.assertTrue(LongestOnes.LongestOnes(14) == 3); //1110
    }

    @Test
    public void Test_Success_7782(){
        Assert.assertTrue(LongestOnes.LongestOnes(7782) == 4); //0001 1110  0110 0110
    }

}
