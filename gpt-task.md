# Lightning Defender Assignment

## Deadline
This work should be submitted before the next exercise session.

## Instructions
For details on how to complete and submit assignments, please refer to the assignments section of the course instructions on your learning management system.

## Preparation
- Review Module 2: Exploring the Anatomy of a Class.
- Read through the OLI material: you can find this both via your learning platform and directly through the provided link.

## Learning Goals
This week's goals include understanding and implementing:
* Java class design
* Instance fields
* Constructor methods
* Getters and setters
* The dot notation
* Printing to the terminal
* Main method and its purpose
* Variable scope and shadowing

## Troubleshooting
If you encounter issues:
1. Check if your question has already been asked under the issues section.
2. If not, post your question with a descriptive title.
3. Consult a teaching assistant during one of the exercise sessions.

Discuss with peers but remember, sharing exact answers is not permitted.

## Assignment

In a world where the skies are constantly barraged by storms, the mythic creatures known as *Lightning Defenders* stand as guardians of their territories. Your task is to model these mythic creatures in Java!

### Exercise 1.0 Starting Your Journey!
Create a new Java file named `LightningDefender.java` and define the class `LightningDefender` within it.

Then, within the `main` method, create variables that define a Lightning Defender:
- Name: String
- Energy Level: int
- Power: int
- Shield Strength: int
- Status: boolean (true for active, false for dormant)

Compile and run your program to ensure correctness.

### Exercise 1.1 Summon More Defenders
Create two more Lightning Defenders with different attributes.

Reflect on the scalability and maintainability of creating multiple defenders in this manner. Introduce the concept of Java classes and objects to alleviate these concerns.

### Exercise 1.2 Class Fields
Revise your `LightningDefender` class to use fields rather than local variables in the `main` method for the attributes of the Lightning Defender.

Instantiate a `LightningDefender` object within the `main` method and assign it relevant attributes.

### Exercise 1.3 Accessors and Mutators
With encapsulation in mind, convert all fields of the `LightningDefender` class to `private` and create getters and setters for each field.

Replace direct field access in the `main` method with these new methods.

### Exercise 1.4 The Constructor
Implement a constructor for the `LightningDefender` class that accepts parameters for all the object's attributes and initializes them accordingly.

Update the `main` method to use the constructor when creating Lightning Defender objects.

### Exercise 1.5 More Defenders, yet Again
Utilize the constructor to create two new Lightning Defender objects. Observe the improved code structure.

### Exercise 1.6 Reporting Status
Implement a `reportStatus()` method that prints out a formatted report of the Lightning Defender's attributes.

Ensure this method is called for each defender in the `main` method to verify functionality.

### Exercise 1.7 Lightning Attack!
Create an `attack` method simulating an attack scenario where one defender attacks another. This method should accept a `LightningDefender` object as a parameter to represent the target of the attack.

There should be a formula for calculating damage based on the attacker's power and the defender's shield strength, with the resulting loss of energy for the target.

Print out the attack details and the target's remaining energy level.

### Exercise 1.8 Exploring Shadowing
Investigate and prepare to discuss examples of variable shadowing and how it affects code within a class or methods.

## Checklist
- Created the initial setting for the world of Lightning Defenders.
- Used fields to define a Lightning Defender's attributes.
- Added getters and setters for all fields.
- Constructed a relevant constructor method.
- Implemented a method to print a Lightning Defender's status.
- Devised an `attack` method for simulating combat between defenders.
- Reviewed examples of variable shadowing.

## Bugs and Errors
If there are any issues or inconsistencies in this exercise, please report them. Your contributions will be acknowledged in the acknowledgment section.
