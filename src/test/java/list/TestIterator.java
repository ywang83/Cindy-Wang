package list;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class TestIterator {

  private List<Integer> list;
  // See the Java List Interface documentation to understand what all the List methods do ...

  @Before
  public void setUp() throws Exception {
    list = new ArrayList<Integer>();
    // TODO also try with a LinkedList - does it make any difference?
    //list = new LinkedList<Integer>();
  }

  @After
  public void tearDown() throws Exception {
    list = null;
  }

  @Test
  public void testEmpty() {
    final Iterator<Integer> i = list.iterator();
    assertFalse(i.hasNext());
  }

  @Test
  public void testNonempty() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    final Iterator<Integer> i = list.iterator();
    assertTrue(i.hasNext());
    assertEquals(33, i.next().intValue());
    // TODO fix the expected values in the assertions below
    assertTrue(i.hasNext());
    assertEquals(77, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(44, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(77, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(55, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(77, i.next().intValue());
    assertTrue(i.hasNext());
    assertEquals(66, i.next().intValue());
    assertFalse(i.hasNext());
  }

  @Test
  public void testRemove() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    final Iterator<Integer> i = list.iterator();
    while (i.hasNext()) {
      if (i.next() == 77) {
        i.remove(); // TODO what happens if you use list.remove(77)?
      }
    }
    // list.remove(77);
    // TODO using assertEquals and Arrays.asList, express which values are left in the list
    // See TestList.java for examples of how to use Arrays.asList; also see the Java Arrays
    // class for more information
    assertEquals(list, Arrays.asList(33, 44, 55, 66));// remove this line when done
  }

  @Test
  public void testAverageValues() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    double sum = 0;
    int n = 0;
    // TODO use an iterator and a while loop to compute the average (mean) of the values
    final Iterator<Integer> i = list.iterator();
    while (i.hasNext()) {
      sum +=i.next();
      n=list.size();
      double mean = sum/n;
    }
    // (defined as the sum of the items divided by the number of items)
    // testNonempty shows how to use an iterator; use i.hasNext() in the while loop condition
    assertEquals(61.3, sum / n, 0.1);
    assertEquals(7, n);
  }
}
