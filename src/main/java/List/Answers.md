# Question and Answers

## 1. What is the purpose of `E` in this class definition?
`E` is a generic type parameter, so we can use the same class with different input. For example, `String` or `int` could both work.

## 2. What is the purpose of `this` in the second constructor definition?
`this` refers to `data` and `next` in the current method, not in other constructors or methods.

## 3. What is the purpose of `toString` in this class definition?
`toString` method aims to define the print format of any list using `Node` class. Without other definition, directly invoking `Node` class will pint list like:  <br /> 
`Node@564160838(hello, Node@2012232625)Node@2012232625(Cindy, Node@846063400)Node@846063400(what, Node@627150481)Node@627150481(up)null`
  
## 4. Which way to create the list more clearly conveys the actual structure of the list?
The first way more clearly conveys the actual list structure, because it shows the link between Nodes.

## 5. What happens if you use the `printNode` method on this circular list?
It will go into an infinite loop.

## 6. How would you describe the shape of any noncyclical structure you can build using the `Node` class? Furthermore, can you build structures with branches that look like trees, where a node can have more than one successor or neighbor?
The shape of any noncyclical structure building with the `Node` class is like a chain. <br /> 
I cannot build structures like trees. When I tried to link `hello` to `cindy` and `roger` the same time and run the program, it printed only part of the `list` and threw an `Exception`: <br /> 
`hello Roger null`<br /> 
`Exception in thread "main" java.lang.NullPointerException`  

## 7. Would the same code work for an `ArrayList`?
No. It will remind you `Cannot resolve method iterator(). ` 
