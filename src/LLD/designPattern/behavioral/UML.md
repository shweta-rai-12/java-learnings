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

Summary :
---------
The Observer Pattern creates a one-to-many dependency between a subject and its observers. When the subject's state changes, 
all registered observers are automatically notified. This pattern is ideal for event-driven systems, notifications, GUI listeners, 
stock market updates, weather monitoring, and inventory alerts because it keeps the subject loosely coupled from the actions taken by its observers.

                    +----------------+
                    |    Subject     |
                    +----------------+
                    | addObserver()  |
                    | removeObserver()|
                    | notifyObservers()|
                    +----------------+
                           ^
                           |
                   +----------------+
                   |     Stock      |
                   +----------------+

         ---------------------------------------
         |                  |                 |
         v                  v                 v

+----------------+  +----------------+  +----------------+
| MobileDisplay  |  | EmailService   |  | WebDashboard   |
+----------------+  +----------------+  +----------------+


When to Use Observer Pattern
------------------------------
Use it when:
One object changes and many objects depend on it.
Multiple systems need to react automatically to an event.
You want loose coupling between the publisher and subscribers.
Observers should be added or removed dynamically.

Common examples:
----------------
Stock price notifications
Weather apps
Event listeners in GUI frameworks
Chat applications
Notification systems
Inventory updates
Publish–Subscribe systems (within a process)

Advantages
----------
Loose coupling between subject and observers.
Easy to add new observers without modifying the subject.
Supports dynamic subscription and unsubscription.
Follows the Open/Closed Principle.
Encourages event-driven design.

Disadvantages
-------------
Notifications may be sent to many observers, affecting performance.
Notification order is not always guaranteed unless explicitly handled.
Poorly designed observer chains can make debugging harder.
Observers must unsubscribe when appropriate to avoid memory leaks (especially in long-running applications).

