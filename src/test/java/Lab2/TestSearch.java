package Lab2;

import Lab2.Team;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestSearch {

  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

  // TODO makeListFixture

  List<Team> makeListFixture(final int size) {
    final List<Team> list = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      list.get(i).equals( new Team("Team " + s, "Coach " + s, i * 100 + 50));
    }
    return list;
  }

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }

  // TODO: testFindPositionList0, 10s, 10f
  @Test
  public void testFindPositionList0() {
    final List<Team> list1 = makeListFixture(0);
    assertFalse(Search.findTeamPosition(list1, "Team 5").isPresent());
  }

  // @Test
  public void testFindPositionList10s() {
    final List<Team> list1 = makeListFixture(10);
    assertFalse(Search.findTeamPosition(list1, "Team 5").isPresent());
  }

  // @Test
  public void testFindPositionList10f() {
    final List<Team> list1 = makeListFixture(10);
    assertFalse(Search.findTeamPosition(list1, "Team 11").isPresent());
  }

  // TODO: testFindMinFundingArray for several sizes and scenarios

  // TODO: testFindMinFundingArrayFast for several sizes and scenarios
}
