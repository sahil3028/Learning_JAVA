/*
Topic: Thread States
Definition: Threads allow more than one task to make progress within a program.
Why / usage: They keep long-running work from blocking other work.
Where to use it: Use threads or executors for background work, servers, downloads, and responsive user interfaces.
*/
- New State   
- Runnable State  ->  start() method
- Running State     -> a thead is running with run() method 
- Waiting State	    -> sleep(),  wait() method
- Dead State

Through notify(), you will go to waiting state to runnable state.
From Running, Runnable state to dead state through stop() method.