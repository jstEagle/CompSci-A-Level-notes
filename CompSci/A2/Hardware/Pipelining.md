**This applies for [[RISC and CISC|CISC]]**

Pipelining is instruction-level parallelism

- Method used to increase job throughput
- Executes more instructions in a set period of time
- 5 stage 'pipe' used
- Handles interrupts in two ways
- Two key issues that may 'stall' the pipe

### Pipelining used

|                          | 1   | 2   | 3   | 4   | 5   | 6   | 7   |
| ------------------------ | --- | --- | --- | --- | --- | --- | --- |
| Instruction fetch (IF)   | 1.1 | 2.1 | 3.1 | 4.1 | 5.1 | 6.1 | 7.1 |
| Instruction decode (ID)  |     | 1.2 | 2.2 | 3.2 | 4.2 | 5.2 | 6.2 |
| Operand fetch (OF)       |     |     | 1.3 | 2.3 | 3.3 | 4.3 | 5.3 |
| Instruction execute (IE) |     |     |     | 1.4 | 2.4 | 3.4 | 4.4 |
| Result write back (WB)   |     |     |     |     | 1.5 | 2.5 | 3.5 |

Number of cycles saved using pipelining
$$(instructions * stages) - (instructions + (stages - 1))$$

### Pipelining not used

|                          | 1   | 2   | 3   | 4   | 5   | 6   | 7   | 8   | 9   | 10  |
| :----------------------- | :-- | :-- | :-- | :-- | :-- | :-- | :-- | :-- | :-- | --- |
| Instruction fetch (IF)   | 1.1 |     |     |     |     | 2.1 |     |     |     |     |
| Instruction decode (ID)  |     | 1.2 |     |     |     |     | 2.2 |     |     |     |
| Operand fetch (OF)       |     |     | 1.3 |     |     |     |     | 2.3 |     |     |
| Instruction execute (IE) |     |     |     | 1.4 |     |     |     |     | 2.4 |     |
| Result write back (WB)   |     |     |     |     | 1.5 |     |     |     |     | 2.5 |
