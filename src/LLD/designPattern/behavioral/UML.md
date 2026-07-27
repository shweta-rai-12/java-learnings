Strategy Design Pattern UML Diagram :

Summary :
---------
The Strategy Pattern encapsulates interchangeable algorithms behind a common interface, allowing the client or context
to switch behaviors without changing its own implementation. It is widely used for payment processing, routing, 
sorting, pricing, compression, authentication, logging, and many other scenarios where behavior varies 
independently of the objects that use it.


                  +----------------------+
                  | <<interface>>        |
                  | Strategy             |
                  +----------------------+
                  | + execute()          |
                  +----------------------+
                            ^
         -------------------|-------------------
         |                  |                  |
+----------------+  +----------------+  +----------------+
| StrategyA      |  | StrategyB      |  | StrategyC      |
+----------------+  +----------------+  +----------------+
| execute()      |  | execute()      |  | execute()      |
+----------------+  +----------------+  +----------------+

                     used by
                        |
                        v

                +----------------------+
                | Context              |
                +----------------------+
                | Strategy strategy    |
                +----------------------+
                | performTask()        |
                +----------------------+
When to Use Strategy Pattern 
------------------------------
Use the Strategy Pattern when:
You have multiple ways to perform the same task.
You want to avoid large if-else or switch statements.
Algorithms should be interchangeable at runtime.
You want to follow the Open/Closed Principle by adding new behaviors without modifying existing code.
You want to isolate business rules into separate, testable classes.


Advantages
-----------
Eliminates complex conditional logic.
Easy to add new strategies without changing existing code.
Promotes composition over inheritance.
Improves readability and maintainability.
Each strategy can be unit-tested independently.
Supports runtime behavior changes.


Disadvantages
-------------
Increases the number of classes in the system.
Clients need to know which strategy to choose.
For very simple logic, using separate strategy classes may be unnecessary overhead.



------------------------------------------------------------------------------------------------------------------------------------
Observer Design Pattern UML Diagram :



