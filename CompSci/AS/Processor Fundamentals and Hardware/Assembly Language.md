- Low level programming languages
- One step up from machine code
- 1:1 Relationship between Assembly instruction and a machine code instruction

E.g. 
<mark class="hltr-blue">LDD</mark> <mark class="hltr-green">100 </mark>-> <mark class="hltr-blue">00010011</mark> <mark class="hltr-green">01100100</mark>

<mark class="hltr-blue">Operation code (instruction)</mark>

<mark class="hltr-green">Operand</mark>



- Java and bytecode
Java is a **compiled** language; it translated the source code (programmer's statements) into an intermediate code (bytecode).
The **bytecode** is then send to the **Java Virtual Machine (JVM)**, which uses an **interpreter** to generate machine code from the bytecode.
**This allows Java to be cross-platform.**


- The OS contains the processor's **Instruction set** - all of the assembly / machine code commands that a processor understands.

- Assembly instructions are **mnemonics** - short codes for the opcodes (instructions)
Data movement
input / output of data (to/from the CPU)
Arithmetic operations
'jump' instructions (condition and unconditional instructions - iteration, selection).
Compare instructions(iteration, loops)

**Modes of addressing**
Direct addressing - LDD
Indirect addressing - LDI
Indexed addressing - LDX
Immediate addressing - LDM

ACC - General purpose register
