### Software designed to convert <mark class="hltr-blue">source</mark> code into <mark class="hltr-green">object</mark> code

Java: compiler converts source code into bytecode $\rightarrow$ sent to the JVM $\rightarrow$ interpreter converts line by line into machine code for the CPU's instruction set.


### Three types of translators:
1. Compiler
2. Interpreter
3. Assembler
_____
### Assembler
Converts low-level assembly language into machine code
________
### Interpreter
- Converts high-level program statements into machine code
- Translates and executes one line at a time
- Stops translation as soon as an error is found
![[Pasted image 20240522114043.png]]
##### <mark class="hltr-green">Advantages</mark>
- Simplifies process of debugging and testing programs in development stage
- Errors in programming code found one at a time

##### <mark class="hltr-red">Disadvantages</mark>
- Interpreted programs run slowly because each line of code is translated, then executed, before the process repeats
- Computer system needs interpreter software to run interpretation process

##### Steps
1. Start running program
2. Execution halts when program encounters an error
3. Fix error and rerun program
4. Continue to fix and run until program runs without errors
##### Example
Java Bytecode $\rightarrow$ Java Virtual Machine
______
### Compiler
- Converts high-level program statements into machine code
- Translates all code before execution can occur
- Code is only translated all at once

##### Steps
1. Compiler entire program
2. Run compiled program
3. Use error report to fix as many errors as possible
4. Recompile _revised_ program and rerun it

![[Pasted image 20240522114844.png]]

##### <mark class="hltr-green">Advantages</mark>
- Compiled programs run faster than interpreted programs
- Compiled code ready to run (doesn't have to translate each instruction before processing)
- Creates a standalone, executable file

##### <mark class="hltr-red">Disadvantages</mark>
- Debugging compiled programs is much more complex than interpreted programs
- Up to programmer to locate errors based on error reports.

________

### Compiler vs Interpreters
**Compiler:**
- Translates the entire program before sending it to the processor for execution
- Faster to execute, slower to translate
- Security - more secure because source code is not present in the executable file

**Interpreter:**
- Translates one line of source code at a time, sends it to the processor for execution and only then translates the next line
- Faster to translate, slower to execute (especially loops)
- Source code always has to be present with the interpreter
- Security - less secure / robust security measures need to be taken on the (web/email/file) server
