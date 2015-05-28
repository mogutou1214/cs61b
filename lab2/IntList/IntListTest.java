import static org.junit.Assert.*;
import org.junit.Test;

public class IntListTest {

    /** Example test that verifies correctness of the IntList.list static 
     *  method. The main point of this is to convince you that 
     *  assertEquals knows how to handle IntLists just fine.
     */

    @Test 
    public void testList() {
        IntList one = new IntList(1, null);
        IntList twoOne = new IntList(2, one);
        IntList threeTwoOne = new IntList(3, twoOne);

        IntList x = IntList.list(3, 2, 1);
        assertEquals(threeTwoOne, x);
    }

    @Test
    public void testdSquareList() {
      IntList L = IntList.list(1, 2, 3);
      IntList.dSquareList(L);
      assertEquals(IntList.list(1, 4, 9), L);
    }

    /** Do not use the new keyword in your tests. You can create
     *  lists using the handy IntList.list method.  
     * 
     *  Make sure to include test cases involving lists of various sizes
     *  on both sides of the operation. That includes the empty list, which
     *  can be instantiated, for example, with 
     *  IntList empty = IntList.list(). 
     *
     *  Keep in mind that dcatenate(A, B) is NOT required to leave A untouched.
     *  Anything can happen to A. 
     */

    //TODO:  Create testSquareListRecursive()
    @Test
    public void testSquareListRecursive() {
    	IntList L = IntList.list(1, 2, 3);
    	IntList L2 = IntList.squareListRecursive(L);
    	IntList empty = IntList.list();
    	IntList empty2 = IntList.squareListRecursive(empty);
    	assertEquals(IntList.list(1, 2, 3), L);
    	assertEquals(IntList.list(1, 4, 9), L2);
    	assertEquals(empty, empty2);	
    }
    
    //TODO:  Create testDcatenate and testCatenate
    @Test
    public void testDcatenate() {
    	IntList L1 = IntList.list(1, 2, 3);
    	IntList L2 = IntList.list(4, 5, 6);
    	IntList L6 = IntList.list(4, 5, 6);
    	IntList L7 = IntList.list(4, 5, 6);
    	IntList L3 = IntList.dcatenate(L1, L2);
    	IntList empty = IntList.list();
    	IntList L4 = IntList.dcatenate(L6, empty);
    	IntList L5 = IntList.dcatenate(empty, L7);
    	assertEquals(IntList.list(1, 2, 3, 4, 5, 6), L3);
    	assertEquals(L1, L3);
    	assertEquals(IntList.list(4, 5, 6), L4);
    	assertEquals(IntList.list(4, 5, 6), L5);
    }
    
    @Test
    public void testCatenate() {
    	IntList L1 = IntList.list(1, 2, 3);
    	IntList L2 = IntList.list(4, 5, 6);
    	IntList L3 = IntList.dcatenate(L1, L2);
    	assertEquals(IntList.list(1, 2, 3), L1);
    	assertEquals(IntList.list(4, 5, 6), L2);
    	assertEquals(IntList.list(1, 2, 3, 4, 5, 6), L3);  	
    }

    /* Run the unit tests in this file. */
    public static void main(String... args) {
        jh61b.junit.textui.runClasses(IntListTest.class);
    }       
}   
