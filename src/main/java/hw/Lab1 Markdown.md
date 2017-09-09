# COMP 271 002 F17: Lab 1
## Markdown
### Part 2
Discussion: What would be a really simple solution if n were not an argument, i.e., if it were always 17?

* Remove the following part of ```for ```statement

  ``` for(n = 1; n<100; n++)```

* Even more, make the whole method body to only one line of code:

  ```System.out.println(17);```

  Since you know 17 could not be divided by 3, 5, or 15.

### Part 3
Discussion: How could you have automatically tested your initial solution from part 2?

Introduced another variable ```m``` and an ```if...else``` statement to test the initial input from the command line. If requirnment does not reached, "error" will be printed.

### Part 4
Discussion: What changes between parts 2, 3, and 4, and what stays the same? Does it matter what list implementation you choose? If so, in what way(s)?

1. The ```if...else``` statement always stay the same, while the main class and variables could be changed.
2. I tried ```ArrayList``` and ```LinkedList``` both. They are only different in running speed in this case. ```ArrayList``` seems to be faster. 