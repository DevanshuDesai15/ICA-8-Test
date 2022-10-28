package tests;

import code.urinals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class getUnoccupiedUrinalsTest {

    @Test
    public void getUnoccupiedUrinalsTestInput1(){
        System.out.println("====== DEVANSHU DESAI == TESTS BELOW EXECUTED =======");
        urinals uri = new urinals();
        String input = "10001";
        int ans = uri.getUnoccupiedUrinals(input);
        Assertions.assertEquals(ans,1);
    }

    @Test
    public void getUnoccupiedUrinalsTestNonEmptyUrinals(){
        urinals uri = new urinals();
        String input = "10011";
        int ans = uri.getUnoccupiedUrinals(input);
        Assertions.assertEquals(ans,-1);
    }
    @Test
    public void getUnoccupiedUrinalsTestLength(){
        urinals uri = new urinals();
        String input = "10010101010101010101000000101010101010101010101010";
        int ans = uri.getUnoccupiedUrinals(input);
        Assertions.assertEquals(ans,-2);
    }

    @Test
    public void getUnoccupiedUrinalsTestLengthGreaterThan0(){
        urinals uri = new urinals();
        String input = "";
        int ans = uri.getUnoccupiedUrinals(input);
        Assertions.assertEquals(ans,-3);
    }
}
