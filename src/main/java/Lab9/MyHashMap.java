package Lab9;

import java.util.*;


/**
 * A generic HashMap custom implementation using chaining. Concretely, the table is an ArrayList of
 * chains represented as LinkedLists.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
public class MyHashMap<K, V> implements Map<K, V> {

  private static final int DEFAULT_TABLE_SIZE = 11; // a prime

  private List<List<Entry<K, V>>> table;

  public MyHashMap() {
    this(DEFAULT_TABLE_SIZE);
  }

  public MyHashMap(final int tableSize) {
    // allocate a table of the given size
    table = new ArrayList<>(tableSize);
    // then create an empty chain at each position
    for (int i = 0; i < tableSize; i += 1) {
      table.add(new LinkedList<>());
    }
  }

  @Override
  public int size() {
    // TODO add the sizes of all the chains
    int result = table.size()%DEFAULT_TABLE_SIZE;
    return result;
  }

  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  @Override
  public boolean containsKey(final Object key) {
    // TODO follow basic approach of remove below (though this will be much simpler)
    final int index = calculateIndex(key);
    final Iterator<Entry<K, V>> iter = table.get(index).iterator();
    while (iter.hasNext()) {
      final Entry<K, V> entry = iter.next();
      if (entry.getKey().equals(key)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean containsValue(final Object value) {
    // TODO follow basic approach of remove below (though this will be much simpler)

    for (int i = 0; i < table.size(); i += 1) {
      final Iterator<Entry<K, V>> iter = table.get(i).iterator();
      while (iter.hasNext()) {
        final Entry<K, V> entry = iter.next();
        if (entry.getValue().equals(value)) {
          return true;
        }
      }
    }
    return false;
  }



  @Override
  public V get(final Object key) {
    // TODO follow basic approach of remove below (though this will be simpler)
    final int index = calculateIndex(key);
    final Iterator<Entry<K, V>> iter = table.get(index).iterator();
    while (iter.hasNext()) {
      final Entry<K, V> entry = iter.next();
      if (entry.getKey().equals(key)) {
        final V oldValue = entry.getValue();
        return oldValue;
      }
    }
    return null;
  }

  @Override
  public V put(final K key, final V value) {
    // TODO follow basic approach of remove below (this will be similar)
    Map<K, V> aMap = new HashMap<>();
    aMap.put(key,value);
    Set entries = aMap.entrySet();
    List<Entry<K,V>> list = new LinkedList<>();
    list.addAll(entries);
    table.add(list);
    if (entries != null) {
      Iterator iterator = list.iterator();
      while (iterator.hasNext()) {
        Entry entry = (Entry) iterator.next();
        Object newValue = entry.getValue();
        return (V) newValue;
      }
      }
    return null;
  }

  @Override
  public V remove(final Object key) {
    final int index = calculateIndex(key);
    final Iterator<Entry<K, V>> iter = table.get(index).iterator();
    while (iter.hasNext()) {
      final Entry<K, V> entry = iter.next();
      if (entry.getKey().equals(key)) {
        final V oldValue = entry.getValue();
        iter.remove();
        return oldValue;
      }
    }
    return null;
  }

  @Override
  public void putAll(final Map<? extends K, ? extends V> m) {
    // TODO add each entry in m's entrySet
    Set<? extends Entry<? extends K, ? extends V>> mySet = m.entrySet();
    List<Entry<K,V>> list = new LinkedList<>();
    list.addAll((Collection<? extends Entry<K, V>>) mySet);
    table.add(list);

//    if (mySet != null) {
//      Iterator iterator = list.iterator();
//      while (iterator.hasNext()) {
//        Map.Entry entry = (Map.Entry) iterator.next();
//        table.add((List<Entry<K, V>>) entry);
//      }
//    }

  }

  @Override
  public void clear() {
    // TODO clear each chain


  }

  /** The resulting keySet is not "backed" by the Map, so we keep it unmodifiable. */
  @Override
  public Set<K> keySet() {
    final Set<K> result = new HashSet<>();
    // TODO populate the set
//    result.add((K) table);

    return Collections.unmodifiableSet(result);
  }

  /** The resulting values collection is not "backed" by the Map, so we keep it unmodifiable. */
  @Override
  public Collection<V> values() {
    final List<V> result = new LinkedList<>();
    // TODO populate the list


    return Collections.unmodifiableCollection(result);
  }

  /** The resulting entrySet is not "backed" by the Map, so we keep it unmodifiable. */
  @Override
  public Set<Entry<K, V>> entrySet() {
    final Set<Entry<K, V>> result = new HashSet<>();
    // TODO populate the set
//    result.add((Entry<K, V>) table);


    return Collections.unmodifiableSet(result);
  }

  @Override
  public String toString() {
    // TODO return the string representation of the underlying table
    return "";
  }

  public boolean equals(final Object that) {
    if (this == that) {
      return true;
    } else if (!(that instanceof Map)) {
      return false;
    } else {
      // TODO simply compare the entry sets
      return false;
    }
  }

  private int calculateIndex(final Object key) {
    // positive remainder (as opposed to %)
    // required in case hashCode is negative!
    return Math.floorMod(key.hashCode(), table.size());
  }
}
