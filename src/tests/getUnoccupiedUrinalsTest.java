package tests;

import code.urinals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class getUnoccupiedUrinalsTest {

    @Test
    public void getUnoccupiedUrinalsTestInput1(){
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

}
