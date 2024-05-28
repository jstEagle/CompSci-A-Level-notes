Different ways data can be accessed in RAM before it is sent to the CPU.

#### <mark class="hltr-yellow">LDD - direct addressing</mark>
Operand is the address where the data is.
e.g. loading the OS into the same address every time.

#### <mark class="hltr-green">LDI - indirect addressing</mark>
Operand contains a 2nd address. Data to return to the CPU is at this 2nd location.
e.g. Implementing the pointer of the top of a stack.

#### <mark class="hltr-cyan">LDX - indexed addressing</mark>
Operand is identified by adding the instruction's operand to the value in the index register.
e.g. processing data in an array.

#### LDR - immediate addressing into the index register
Operand is always preceded with a hash symbol, #.
Hash symbol is always followed by an integer literal. (literal means hardcoded)

### RAM

| 100 | 6   |
| --- | --- |
| 110 | 3   |
| 120 | 24  |
| 130 | 100 |  

<mark class="hltr-yellow">LDD 110</mark>
ACC: 3

<mark class="hltr-green">LDI 130</mark>
ACC: 6

<mark class="hltr-cyan">LDX 110</mark>
IX (index register): 10 denary
ACC: 24



START:  LDR #0
LOOP:   LDX 50

OUT
INC IX

CMP #55
JPE END
JPN LOOP

END: 