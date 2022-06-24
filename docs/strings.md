# Strings

Strings are used for storing text.

A String variable contains a collection of characters surrounded by double quotes:

```
String best90sRapGroup = "WuTang Clan";
```

### String Length

A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:

```
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());
```

### More String Methods

There are many string methods available, for example toUpperCase() and toLowerCase()

```
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"
```

### Finding a Character in a String

The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):

```
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7
```

### String Concatenation

The `+` operator can be used between strings to combine them. This is called concatenation:

```
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);
```

You can also use the concat() method to concatenate two strings:

```
String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));
```

### Java User Input

The Scanner class is used to get user input, and it is found in the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings:

```java
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}

```

## Let's try it

Complete [StringsExample.java](../src/main/java/com/codedifferently/strings/StringsExample.java)


| Prev                            | TOC                 | Next                                 |
|---------------------------------|---------------------|--------------------------------------|
| [Primitives](javaPrimitives.md) | [TOC](../ReadMe.md) | [Logical and Relational Operators](logicalAndRelationalOperators.md) |