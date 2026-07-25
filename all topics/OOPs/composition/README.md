# COMPOSITION

## Definition
Composition is a HAS-A relationship: one class stores and uses objects of other classes as its parts.

## Why this topic exists
It models real objects from smaller reusable components and keeps responsibilities separated.

## Real-world analogy
A personal computer HAS-A monitor, motherboard, and computer case; it is not a monitor.

## Why this example demonstrates the topic
The files in this folder work together to show the concept in code: Main.java, PersonalComputer.java, Product.java. Study the class declarations, fields, constructors, and method calls in that order.

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
- Why is PersonalComputer composition? Can a Product object have its own behaviour? Why is composition often preferred over inheritance?
- Define this concept in one sentence.
- Give a real-world analogy from this program.
- Identify the relevant class relationship and justify it.

## Common interview questions
- What problem does this feature solve?
- How does it differ from Inheritance means IS-A. Composition means HAS-A and is used when one object is built from parts.
- Which line proves the concept in this example?

## Difference from similar topics
Inheritance means IS-A. Composition means HAS-A and is used when one object is built from parts.

## Key points to remember
- Follow the data from fields to constructors to method calls.
- A reference type and an object's actual type can be different.
- OOP is about assigning each class one clear responsibility.