# JAVA RECORDS AND IMMUTABILITY

## Definition
A record is a compact Java data carrier that automatically provides final fields, accessors, a constructor, equals, hashCode, and toString.

## Why this topic exists
It removes boilerplate when an object mainly represents data that should not change after creation.

## Real-world analogy
A printed student ID card contains fixed details; to change a detail, issue a new card.

## Why this example demonstrates the topic
The files in this folder work together to show the concept in code: LPAStudent.java, Main.java, Student.java. Study the class declarations, fields, constructors, and method calls in that order.

## Class relationships
Read each extends clause as **IS-A**. Read an object stored in a field as **HAS-A**. The comments in the source identify which relationship is being used.

## Step-by-step execution flow
1. Main creates the object(s) for the example.
2. Constructors initialise their state and connect related objects.
3. Methods are called through the reference available to the program.
4. Where a subclass overrides a method, Java chooses the real object's implementation at runtime.

## Important code snippets
- Look for private fields: they show encapsulation.
- Look for extends: it shows inheritance (IS-A).
- Look for new: it creates an object.
- Look for super(...): it initialises the parent portion of a child object.
- Look for @Override: it shows specialised behaviour and can enable runtime polymorphism.

## Common viva questions
- What does a record generate automatically? Why are records immutable? What is the difference between name() and getName()?
- Define this concept in one sentence.
- Give a real-world analogy from this program.
- Identify the relevant class relationship and justify it.

## Common interview questions
- What problem does this feature solve?
- How does it differ from A POJO can be mutable through setters; a record has no setters and its components are final.
- Which line proves the concept in this example?

## Difference from similar topics
A POJO can be mutable through setters; a record has no setters and its components are final.

## Key points to remember
- Follow the data from fields to constructors to method calls.
- A reference type and an object's actual type can be different.
- OOP is about assigning each class one clear responsibility.