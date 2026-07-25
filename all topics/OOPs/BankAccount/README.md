# ENCAPSULATION AND CONSTRUCTORS

## Definition
Encapsulation means keeping an object's data private and allowing controlled access through methods. Constructors create objects with an initial valid state.

## Why this topic exists
It prevents outside code from changing important data carelessly and gives the class one place to enforce rules.

## Real-world analogy
A bank account is like a locked ATM: you cannot directly change the balance; you ask the account to deposit or withdraw.

## Why this example demonstrates the topic
The files in this folder work together to show the concept in code: BankAccount.java, Custumer.java, Main.java. Study the class declarations, fields, constructors, and method calls in that order.

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
- Why are fields private? What is constructor chaining? Why use this.field = field?
- Define this concept in one sentence.
- Give a real-world analogy from this program.
- Identify the relevant class relationship and justify it.

## Common interview questions
- What problem does this feature solve?
- How does it differ from Encapsulation protects data. Inheritance reuses behaviour through an IS-A relationship.
- Which line proves the concept in this example?

## Difference from similar topics
Encapsulation protects data. Inheritance reuses behaviour through an IS-A relationship.

## Key points to remember
- Follow the data from fields to constructors to method calls.
- A reference type and an object's actual type can be different.
- OOP is about assigning each class one clear responsibility.