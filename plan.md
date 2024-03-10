**Plan of Action**

- Coding Questions

  - Question on Loops
  - Questions on Arrays and Strings
  - JavaFx
  - Object oriented Progamming
    - Create a Class called 'something' and give it properties
  - Exception Handling

- Main Topics to revise (Theoritical)

  - Java DataTypes

    - Primtive DataTypes

      - Boolean Values
        - bool -> 1 byte
      - Whole Numbers
        - byte -> 1 byte
        - short -> 2 bytes
        - int -> 4 bytes
        - long -> 8 bytes
      - Letter : alpbhabet or digit
        - char -> 2 bytes
      - Floating point numbers
        - float -> 4 bytes
        - double -> 8 bytes

    - Non Primitive DataTypes
      - String : Collection of Characters (char)
      - Array : Collection of Primitive dataTypes
        - int[] ==> store multiple integer values
        - double[] ==> store multiple double values
        - byte[] ==> store multiple byte values

  - Java Operators

    - Arithematic Operators
    - Logical Operators
    - Relational Operators
    - Assignment Operators
    - Bitwise Operators (redo)
    - Increment / Decrement
    - Ternary Operator (redo)

  - Java Decision Making Statement

    - if-else
    - Nested if-else
    - Switch Statement

  - Java Loops

    - For Loop
    - While Loop
    - Do While Loop
    - Enhanced For Loop

  - Object Oriented Programming

    - Inheritance - Single Inheritance - Multi-level Inheritance - Multiple Inheritance - Heirarchical Inheritance - Hybrid Inheritance
    - Polymorphism

      - Method Overloading > Multiple methods of the same but can have different types of parameters or number of parameters

        > void print2() {
        > System.out.println("Parent2 - a" + a);
        > }

        > void print2(int a) {
        > System.out.println("Parent2 - b" + a);
        > }

        > void print2(int a, int b) {
        > System.out.println("Parent2 - c" + a);
        > }

        > void print2(char a) {
        > System.out.println("Parent2 - d" + a);
        > }

    - Method Overriding

      > Child class inherit Parent Class

      > If Parent class and child class both have the method of the same name.
      > this is the situation where over-riding is seen

      > Function in the Child class over-rides the function in the child class

    - Encapsulation
      - Everything is inside of a class , grouped inside of a class
    - Abstraction

      - Data Hiding

        - Abstract Method

          > Method without body

          > Method without any definition

          > use 'abstract' keyword

        - Abstract Class

          > Class which has atleast 1 abstract method inside of it

          > use 'abstract' keyword

        - Interface

          > Similar to Abstract class but purely abstract. all methods inside of it must be abstract.

          > use 'interface' keyword

          > all variables are final by default inside an interface

      - Final keyword : something that is fixed, must not changed

        - Final Variable
          > Variable whose value cannot be changed
        - Final Method
          > Method which cannot be overridden
        - Final Class
          > Class which cannot be inherited

      - Access Modifiers
        - Public : Can be used from anywhere
        - Private : Can be used from the class where it is created
        - Protected : Can be used from the class and inside the inheriting class
        - Default :
