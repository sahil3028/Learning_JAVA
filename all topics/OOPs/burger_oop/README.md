# COMPOSITION, INHERITANCE, AND POLYMORPHISM

## Definition
Composition builds a larger object from smaller objects (HAS-A). Inheritance creates specialised versions of a class (IS-A), and polymorphism lets a base reference use overridden subclass behaviour.

## Why this topic exists
A meal can be assembled from reusable burger, drink, side, and topping objects instead of one huge class.

## Real-world analogy
A meal order HAS-A burger, drink, and side; a DeluxeBurger IS-A Burger with extra rules.

## Why this example demonstrates the topic
The files in this folder work together to show the concept in code: Burger.java, DeluxeBurger.java, Item.java, Main.java, MealOrder.java. Study the class declarations, fields, constructors, and method calls in that order.

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
- Why does MealOrder contain Item objects? Why does DeluxeBurger extend Burger? What does @Override prove?
- Define this concept in one sentence.
- Give a real-world analogy from this program.
- Identify the relevant class relationship and justify it.

## Common interview questions
- What problem does this feature solve?
- How does it differ from Composition is HAS-A; inheritance is IS-A. Here both are used together.
- Which line proves the concept in this example?

## Difference from similar topics
Composition is HAS-A; inheritance is IS-A. Here both are used together.

## Key points to remember
- Follow the data from fields to constructors to method calls.
- A reference type and an object's actual type can be different.
- OOP is about assigning each class one clear responsibility.