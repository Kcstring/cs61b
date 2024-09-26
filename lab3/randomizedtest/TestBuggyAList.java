package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
    // YOUR TESTS HERE
    @Test
    public void testThreeAddThreeRemove()
    {
        BuggyAList list = new BuggyAList();
        AListNoResizing a = new AListNoResizing();
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        a.addLast(3);
        a.addLast(4);
        a.addLast(5);
        assertEquals(list.removeLast(),a.removeLast());
        assertEquals(list.removeLast(),a.removeLast());
        assertEquals(list.removeLast(),a.removeLast());
    }
    @Test
    public void randomizedTest()
    {
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList list = new BuggyAList();
        int N = 5000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 2);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                list.addLast(randVal);
            } else if (operationNumber == 1) {
                // size
                int size1 = L.size();
            }
        }
    }

}
