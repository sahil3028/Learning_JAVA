/*
Topic: Polymorphism
Definition: Polymorphism lets a parent-type reference call behaviour implemented by different child objects.
Why / usage: It makes code flexible because one variable can work with many related types.
Where to use it: Use it when processing different implementations through one common parent class or interface.
*/
Polymorphism:
- Many behaviour ( same object or reference has differnet behaviours)

1. Compile time polymorhism -- Overloading
	add(int, int)
	add(int, int, int)

2. Run time polymorphism -- Overriding
	A
		add(int,int)
	B
		add(int, int)