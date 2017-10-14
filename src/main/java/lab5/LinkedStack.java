package lab5;

import java.util.List;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    top.next = (Node<E>) obj;
    return obj;
  }

  @Override
  public E peek() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    if(top.next == null){
    return (E) top;}
    return null;
  }

  @Override
  public E pop() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    if(top.next == null){
      top.next=top;}
    return (E) top;
  }

  @Override
  public boolean isEmpty() {
    // TODO
    return false;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    // TODO add any instance variable(s) required to support this
    return null;
  }
}
