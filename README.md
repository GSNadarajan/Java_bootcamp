# <span style="color:blue">JAVA DSA</span>

## Day 1: 8/12/2023

Programming is divided into three categories:

1. **Procedural Programming**
2. **Functional Programming**
3. **Object-Oriented Programming Language (OOPS)**

### <span style="color:green">Procedural Programming</span>
It is a collection or order of statements to make a program, such as:

1. Get the first number
2. Get the second number
3. Add the two numbers and store in a third variable
4. Print the result

This order of statements is called Procedural Programming. 

### <span style="color:orange">Functional Programming</span>
Writing a program only with pure functions and first-class functions.

### <span style="color:red">Object-Oriented Programming Language</span>
Revolves around objects. For example, "Human" is a class, and "Nattu" is an object or instance of the class "Human" with properties specific to that class. Code + Data = Object. It is easier to develop, debug, and reuse and maintain.

### Static vs Dynamic


| Static                                | Dynamic                               |
| ------------------------------------- | ------------------------------------- |
| Perform type checking at compile time | Perform type checking at run time     |
| Error will show at compile time       | Error might not show until runtime    |
| Declare data type before use          | No need to declare datatype of variables |
| More control                          | Saves time in writing code but might give error at runtime |

For example, when declaring a variable with `a = 10;`, there are two memory types involved: stack memory and heap memory. Here, `a` is a reference variable stored in stack memory, and `10` is an object stored in heap memory

### <span style="color:purple">Garbage Collection</span>
If an object has no reference variable, it will be moved to garbage collection. For instance:

```java
a = 10;       // Initially, 'a' is pointing to 10
a = "nattu";  // Now 'a' is pointing to "nattu," and the 10 will be moved to the garbage collection

### syntax of java code

// The class name should be same as the file name
// This is the entry point of this class Main and static represents no need to create objects for this class to run this main function... public represents access specifier... void represents it return type.... String[] args represents command line argument for accessing arrays string in command line argument

public class Main{ 
    public static void main(String[] args){ 
        int age = 21; // int is the data type and age represents reference variable and 21 is the object
        system.out.println(age); // system is the class and out is the variable in the function println()
    }
}

### Conditions in java

// if else conditional statement

if(age == 18){
     system.out.println("Eligible for vote");  // condition for checking eligibility of vote
}
else{
     system.out.println("Not eligible for vote");
}

### Loops in java

// for loop

// for loop will do the same thing where while loop do.. but we should use for loop for finite conditions... 
// if we don't know the end (infinite loop) should use while loop

for(int i = 0; i < 10; i++){
     system.out.println(i); // It will print from 0 to 10
}

// while loop

int i = 0;
while(i < 10){
     system.out.println(i);
     i++:
}

// do while loop

do(
     // do initially
)
while(
     // check condition
)


### ARRAYS

// syntax

datatype[] variable_name = new datatype[size];

// Example (Store 5 roll numbers):

int[] rnos = new int[5];  
//or 
int[] rnos1 = {21,23,34,35} 


// int[] ros; // Declaration of array. ros is getting defined in the stack
// ros = new int[4]; // Initialisation: actually here object is being created in heap memory


