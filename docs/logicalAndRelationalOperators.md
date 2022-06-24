# Logic And Relational Operators

## Java Operators

Operators are used to perform operations on variables and values.

In the example below, we use the + operator to add together two values:

```
int x = 100 + 50;
```

Although the + operator is often used to add together two values, like in the example above, it can also be used to add together a variable and a value, or a variable and another variable:

```
int sum1 = 100 + 50;        // 150 (100 + 50)
int sum2 = sum1 + 250;      // 400 (150 + 250)
int sum3 = sum2 + sum2;     // 800 (400 + 400)
```
Java divides the operators into the following groups:

* Arithmetic operators 
* Assignment operators 
* Comparison operators 
* Logical operators 
* Bitwise operators

## Arithmetic Operators

Arithmetic operators are used to perform common mathematical operations.

| Operator                                                | Name                                                  | Description                                | Example |
|---------------------------------------------------------|-------------------------------------------------------|--------------------------------------------|---------|
| +                                                       | 	Addition                                             | Adds together two values                   | 	x + y  |
| -                                                       | Subtraction                                           | Subtracts one value from another           | x - y   |
| *                                                       | Multiplication                                        | Multiplies two values                      | x * y   |
| /                                                       | Division                                              | 	Divides one value by another              | x / y   |
| %                                                       | 	Modulus                                              | 	Returns the division remainder	           | x % y   |
| ++ | Increment                                             | Increases the value of a variable by 1     | ++x     |
|--	| Decrement	 | Decreases the value of a variable by 1 | --x     |

## Java Assignment Operators
Assignment operators are used to assign values to variables.

In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:

```
int x = 10;
```

The addition assignment operator (+=) adds a value to a variable:

```
int x = 10;
x += 5;
```
A list of all assignment operators:


| Operator               | Example            | Same As    |  
|------------------------|--------------------|------------|
| =                      | 	x = 5	            | x = 5      |
| +=	                    | x += 3	            | x = x + 3  |
| -=                     | x -= 3             | 	x = x - 3 |
| *=                     | x *= 3             | x = x * 3  |
| /=                     | x /= 3	            | x = x / 3  |
| %=                     | x %= 3             | 	x = x % 3 |
| &=                     | 	x &= 3	           | x = x & 3  |
|| =                      | x                  | = 3        |x = x  | 3|
| ^=                     | x ^= 3             | x = x ^ 3  |
| >>=                    | x >>= 3            | x = x >> 3 |
| <<= | x <<= 3 | x = x << 3 |

## Java Comparison Operators

Comparison operators are used to compare two values:


| Operator                        | Name                         | Example |
|---------------------------------|------------------------------|---------|
| ==                              | Equal to                     | 	x == y |
| !=                              | Not equal                    | 	x != y |
| >	                              | Greater than                 | 	x > y  |
| <                               | 	Less than                   | 	x < y  |
| >=                              | Greater than or equal to     | x >= y  |
| <= | Less than or equal to | x <= y  |

## Java Logical Operators
Logical operators are used to determine the logic between variables or values:

| Operator                                                                                 | Name                                                                                   | Description                                                                | Example                               |
|------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------|----------------------------------------------------------------------------|---------------------------------------|
| &&                                                                                       | Logical and	                                                                           | Returns true if both statements are true	                                  | x < 5 &&  x < 10                      |
| <code>&#124;&#124;</code>                                                                | Logical or	                                                                            | Returns true if one of the statements is true                              | x < 5 <code>&#124;&#124;</code> x < 4 |
| !	| Logical not | Reverse the result, returns false if the result is true	| !(x < 5 && x < 10)                    |

## Let's try it
Complete [Operators.java](../src/main/java/com/codedifferently/operators/Operators.java)


| Prev                    | TOC                   | Next                                               |
| ----------------------- | --------------------- | -----------------------------------                |
| [Strings](strings.md)   | [TOC](../ReadMe.md)   | [Conditional Statements](conditionalStatements.md) |