# Vending Machine

This project is an exercise in designing a vending machine using OOP and TDD.
The Vending Machine will accept money, make change, maintain inventory, and dispense products.  
All the things that you might expect a vending machine to accomplish.


### MVP

* The vending machine will accept valid coins (10p, 20p, 50p, etc) and reject invalid ones (1p, 2p).

* When a valid coin is inserted the amount of the coin will be added to the current amount. Rejected coins are returned.

* There are three products: cola for £1.00, crisps for £0.50, and sweet for £0.65.  When the respective code is entered
and enough money has been inserted, the product is returned and the current amount will be set to £0.00.  If there is not enough money inserted then the machine returns the amount still required.

#### Extensions

* When a product is selected that costs less than the amount of money in the machine, then the correct change is placed
in the coin return.

* When the return coins button is pressed, the money the customer has placed in the machine is returned into the coin return.

#### Progress

I have finished MVP and the first part of extensions for this project. I have also branched off and started creating a console interface
that a user can interact with to use the Vending Machine.
