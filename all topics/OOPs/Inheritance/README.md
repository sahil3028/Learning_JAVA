# INHERITANCE AND METHOD OVERRIDING

## Definition
Inheritance lets a child class reuse accessible fields and methods from a parent class, forming an IS-A relationship.

## Why this topic exists
Common Animal behaviour is written once, while Dog and Fish add their own specialised behaviour.

## Real-world analogy
A dog IS AN animal and a fish IS AN animal, but they move differently.

## Why this example demonstrates the topic
The files in this folder work together to show the concept in code: Animal.java, Dog.java, Fish.java, Main.java. Study the class declarations, fields, constructors, and method calls in that order.

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
- What does extends mean? What is inherited? Why call super()? What is method overriding?
- Define this concept in one sentence.
- Give a real-world analogy from this program.
- Identify the relevant class relationship and justify it.

## Common interview questions
- What problem does this feature solve?
- How does it differ from Inheritance reuses a parent class. Composition stores another object as a field.
- Which line proves the concept in this example?

## Difference from similar topics
Inheritance reuses a parent class. Composition stores another object as a field.

## Key points to remember
- Follow the data from fields to constructors to method calls.
- A reference type and an object's actual type can be different.
- OOP is about assigning each class one clear responsibility.