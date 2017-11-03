# Questions & Answers

## Why does `LinkedStack` not require an explicit constructor?
Because `LinkedStack` invoked `Node`, which has an explicit constructor.

## What is the time and (extra) space complexity of each of the `LinkedStack` methods, as well as `ReverseLines.main`?
### `LinkedStack`
- `push()`: T(n) =O(1); S(n) =O(1);
- `peek()`: T(n) =O(1); S(n) =O(1);
- `pop()`: T(n) =O(1); S(n) =O(1);
- `isEmpty()`: T(n) =O(n); S(n) =O(n);
- `asList()`: T(n) =O(n); S(n) =O(n);

### `ReverseLines` 
- `main`: T(n) =O(n); S(n) =O(n);

## How else (not using `Node`) could we have implemented `LinkedStack` in such a way that it is still based on a linked list but the `asList` method uses constant time and space?
We can construct an empty stack using an `LinkedList` as the container. <br>
`public ListStack() {` <br> 
`   list = new LinkedList<>();` <br>
`}`

## Is it better for `push` and `pop` to return the item or the stack itself? Briefly discuss the pros and cons of each design.
- To return the item
  - **pros** <br>
    Less time and space complexity(O(1)).
  - **cons** <br>
    Other items in the stack are invisible.
- To retrun the stack itself
  - **pros** <br>
    You can see all of the items in the stack.
  - **cons** <br>
    More time and space complexity(O(n)).