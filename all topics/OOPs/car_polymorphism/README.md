# RUNTIME POLYMORPHISM AND METHOD OVERRIDING

## Definition
Polymorphism lets one parent-type reference represent different child objects. At runtime Java selects the overridden method belonging to the real object.

## Why this topic exists
Code can work with all car types through Car without writing separate driving code for every type.

## Real-world analogy
A remote has one power button, but a TV and AC respond in their own way.

## Why this example demonstrates the topic
The files in this folder work together to show the concept in code: Car.java, Main.java. Study the class declarations, fields, constructors, and method calls in that order.

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
- What is runtime polymorphism? Why can Car car = new ElectricCar(...) work? When is the overridden method chosen?
- Define this concept in one sentence.
- Give a real-world analogy from this program.
- Identify the relevant class relationship and justify it.

## Common interview questions
- What problem does this feature solve?
- How does it differ from Overriding happens in a child class; overloading uses the same method name with different parameter lists.
- Which line proves the concept in this example?

## Difference from similar topics
Overriding happens in a child class; overloading uses the same method name with different parameter lists.

## Key points to remember
- Follow the data from fields to constructors to method calls.
- A reference type and an object's actual type can be different.
- OOP is about assigning each class one clear responsibility.