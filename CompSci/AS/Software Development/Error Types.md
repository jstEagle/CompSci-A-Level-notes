
#### Syntax errors
- A typo, missing bracket, incorrect punctuation.
- <mark class="hltr-yellow">When a programmer break the rules of a programming language.</mark>
- <mark class="hltr-blue">Prevent a compiler from generating object code.</mark>

	**Source code**
	- The programmer's statements in a high-level programming language (e.g. java)

	**Object code (intermediate code or bytecode)**
	- Binary / assembly representation of a program, but not yet runnable.
	- Source code: if (x > y) {}
	- Object code: LDD x
					CMP 200
					JPE 500
					JPN END

	**Machine code**
	- Binary patterns that a processor understands (instructions for a particular instruction set - e.g. Windows vs MacOS)


**Java**
Complies source code to bytecode. The Java Virtual Machine (JVM) translates bytecode to machine code because Java is multi-platform


#### Logic errors
- Will not crash a program
- Makes program not do what you want it to do
- e.g. incorrect operator (> instead of $\ge$)

	- Can be identified by:
		- Getting someone else to look at code
		- Running the algorithm through trace table
		- Using breakpoints, single stepping and variable watches in an IDE



#### Runtime errors
- An error that causes a program to crash
- 'runtime' = when your program is executing
- e.g. Index outside the bounds of the array, truing to access a text file that doesn't exist

Prevented through using try-catch structures
