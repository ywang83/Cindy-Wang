package Lab2;

import java.util.List;
import java.util.Optional;

public class Search {

  /** Looks for the position of the named team in an array. */
  public static int findTeamPosition(final Team[] arr, final String key) {
    // Gets the array size
    final int size = arr.length;
    // Runs through a for loop to check
    for (int i = 0; i < size; i++) {
      // Gets the current item at index and compare name to key
      if (arr[i].getName().equals(key)) {
        // Return the index of where the item with key is located
        return i;
      }
    }
    // If it does not exist in the array then return an empty Optional
    return -1;
  }

  /** Looks for the position of the named team in a list. */
  public static int findTeamPosition(final List<Team> list, final String key) {
    // TODO complete this method
      final int size = list.size();
      for (int i = 0; i < size; i++) {
          if (list.get(i).getName().equals(key)) {
              return i;
      }
    }
    return -1;
  }

  /**
   * Looks for the position of the poorest team that has at least 
   * the specified funding level.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static int findTeamMinFunding(final Team[] arr, final int minFunding) {
    // TODO complete this method
      final int size = arr.length;
      for (int i = 0; i < size; i++) {
          if (arr[i].getFunding() >= minFunding) {
              return i;
      }
    }
        return -1;
  }

  /**
   * Looks for the position of the poorest team that has at least 
   * the specified funding level. 
   * Uses binary search: Initially search the entire array, 
   * then repeatedly eliminate the wrong half of the array until 
   * zero or one items are left.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static int findTeamMinFundingFast(final Team[] arr, final int minFunding) {
    // TODO complete this method
    // Gets the array size
    final int size = arr.length;
    // Initially search the entire array
    int low = 0;
    int high = size - 1;
    // Keep going as long as there is more than one item to be checked
    // Eliminate the wrong half of the array
    // Return current item only if it meets the condition!
      while (low <= high) {
          int mid = (low + high) / 2;
          if (arr[low].getFunding() >= minFunding)
              return low;
          else if (arr[low].getFunding() < minFunding && arr[mid].getFunding() < minFunding)
              low = mid +1;
          else // (arr[low].getFunding() < minFunding && arr[mid].getFunding() >= minFunding)
              high = mid;
      }
      return -1;  //arr[high].getFunding() < minFunding
  }
}
