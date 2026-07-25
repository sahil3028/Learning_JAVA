# UPCASTING, DOWNCASTING, AND instanceof

## Definition
Upcasting stores a child object in a parent reference. Downcasting asks Java to treat that reference as a specific child type, so child-only members can be used.

## Why this topic exists
Programs often receive a general parent type but sometimes need specialised child behaviour safely.

## Real-world analogy
Every dog is an animal, but only after confirming an animal is a dog can you ask it to bark.

## Why this example demonstrates the topic
The files in this folder work together to show the concept in code: Main.java, Movie.java, NextMain.java. Study the class declarations, fields, constructors, and method calls in that order.

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
- What is the danger of downcasting? Why use instanceof? What is the difference between declared type and actual object type?
- Define this concept in one sentence.
- Give a real-world analogy from this program.
- Identify the relevant class relationship and justify it.

## Common interview questions
- What problem does this feature solve?
- How does it differ from Casting changes the reference view, not the object. instanceof checks the real object before a downcast.
- Which line proves the concept in this example?

## Difference from similar topics
Casting changes the reference view, not the object. instanceof checks the real object before a downcast.

## Key points to remember
- Follow the data from fields to constructors to method calls.
- A reference type and an object's actual type can be different.
- OOP is about assigning each class one clear responsibility.