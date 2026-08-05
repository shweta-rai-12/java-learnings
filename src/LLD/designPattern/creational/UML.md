**1. Factory Design Pattern :** 

Def : The Factory Pattern provides a single place to create objects, hiding the object creation logic from the client.

                 Payment                                        
                    ^
        ------------------------
        |          |           |
      UPI        Card       Paypal

                 ^
                 |
          PaymentFactory

The client doesn't know which class is instantiated.

When to Use Factory Pattern
----------------------------
When:
Only one object needs to be created.
Client shouldn't know the creation logic.
Object creation is centralized.

Real-Life Examples
------------------
NotificationFactory → Email, SMS, Push
PaymentFactory → UPI, Card, PayPal
LoggerFactory → FileLogger, DBLogger, ConsoleLogger

Advantages
-----------
Centralized object creation.
Easy to extend.
Client is loosely coupled.

------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------

**2. Abstract Factory Pattern**

Definition : 
The Abstract Factory Pattern provides an interface for creating families of related objects without specifying their concrete classes.
Instead of creating one object,
it creates multiple related objects.


UML :

                    FurnitureFactory
                  /                  \
       ModernFactory          VictorianFactory
          |                         |
   ----------------         ------------------
|       |      |         |      |         |
Chair   Sofa   Table     Chair   Sofa    Table


When the application needs multiple related objects that should work together consistently (for example, all Windows UI
components or all Modern furniture).

Can Abstract Factory use Factory Pattern internally?
-----------------------------------------------------
Yes.
Each method in an abstract factory (such as createButton() or createChair()) is effectively acting as a factory method 
for that specific product.

------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------

**3. Singleton Design Pattern**

