##### Reverse Polish Notation
Operation comes after its two operands

### Infix form: `5 + 2`
### Polish Notation: `+52`
### Reverse Polish Notation: `52+`

___
### Benefit
Operands are sent to the CPU in the order in which they are processed

##### <u>Example</u>
Infix form: `(6 * 2) / 3`
$\downarrow$
RPN: `62*3/`

Infix form: `(6 * 2) / (3 * 4)`
$\downarrow$
RPN: `62* 34*/`


##### Question:
RPN expressions are processed by the CPU(ALU)(executed) using a stack.

![[Pasted image 20240516191657.png]]

