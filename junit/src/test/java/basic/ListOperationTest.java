package basic;

import basic.ListOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListOperationTest {

    private List<Integer> list;

    @BeforeEach
    public void setUp(){
        list = new ArrayList<>();
    }

    @Test
    public void testAddElement(){
        ListOperations.addElement(list, 5);
        ListOperations.addElement(list, 8);
        Assertions.assertTrue(list.contains(8));
    }

    @Test
    public void testRemoveElement(){
        ListOperations.addElement(list, 1);
        ListOperations.addElement(list, 5);
        ListOperations.removeElement(list, 1);
        Assertions.assertEquals(1, list.size());
        Assertions.assertFalse(list.contains(1));
    }
    @Test
    public void testGetSize(){
        ListOperations.addElement(list, 1);
        ListOperations.addElement(list, 2);
        ListOperations.addElement(list, 3);
        Assertions.assertEquals(3, list.size());
    }
}
