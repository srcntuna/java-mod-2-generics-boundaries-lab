# Generics Boundaries Lab

## Learning Goals

- Create a generic static method with an upper bound

## Instructions

Create a method that returns the average of a list of numbers. Make sure the
method is restricted to dealing with numbers and that your code will not
compile if you try to pass in a list of objects that not actually numbers.

Hints:

- You need to use an upper bound wildcard
- You can use the `Double` class as the precision for your calculation
- The average is the sum divided by the number of elements in the list
