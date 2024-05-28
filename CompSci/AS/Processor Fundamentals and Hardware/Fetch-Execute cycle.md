### Fetch
![[Pasted image 20230830094319.png]]

**<u>4 special-purpose registers</u>**
- Program Counter (PC)
	- Contains the address of the next instruction to be fetched.

- Memory Address Register (MAR)
	- Contains the address of the current instruction to be fetched.

- Memory Data Register (MDR)
	- Contains the 'data', the contents to be returned from RAM.

- Current Instruction Register (CIR)
	- Contains a copy of the MDR's contents.

##### Register Transfer Notation
$[MAR]$ <- $[PC]$ //Start of a new FE cycle
$[MDR]$ <- $[[MAR]]$
$[CIR]$ <- $[MDR]$
$[PC]$ <- $[PC]$ + 1

$[PC]$ - In square brackets means to load the contents of this register.

$[[MAR]]$ - In double brackets means to load the contents of the memory location referred to in the MAR.

### Decode
In the decode stage, the CPU interprets or deciphers the fetched instruction to determine what operation needs to be performed and on which data. This involves several sub-steps

In summary, the decode stage is crucial for understanding the fetched instruction and preparing the CPU for the actual execution of that instruction. It involves extracting the <mark class="hltr-green">opcode</mark>, <mark class="hltr-blue">operands</mark>, and registers, and performing any necessary calculations to set up the instruction for execution in the next stage.

### Execute
After the decode stage, the CPU proceeds to the "execute" stage. In this stage, the actual <mark class="hltr-purple">operation specified by the opcode is carried out using the identified operands</mark> and registers. For example, if the <mark class="hltr-orange">opcode indicates an addition operation, the CPU adds the values from the specified registers and stores the result back in a register</mark>.

### Interrupt?
[[Interrupt Handling]]

