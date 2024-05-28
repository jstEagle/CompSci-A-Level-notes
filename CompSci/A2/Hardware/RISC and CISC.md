
| Reduced Instruction Set Computers                           | Complex Instruction Set Computers        |
| :---------------------------------------------------------- | :--------------------------------------- |
| Fewer instructions                                          | More instructions                        |
| Simpler instructions                                        | More complexity to instructions          |
| Small number of instruction formats                         | Many instruction formats                 |
| Single-cycle instructions whenever possible                 | Multi-cycle instructions                 |
| Fixed-length instructions                                   | Variable-length instructions             |
| Only 'load' and 'store' instructions used to address memory | Many instructions used to address memory |
| Fewer addressing modes                                      | More addressing modes                    |
| More general-purpose registers                              | Fewer general-purpose registers          |
| Hard-wired control unit                                     | Microprogramming control unit            |
| Pipelining is easier                                        | Pipelining is more difficult             |

### RISC Processors
- ARM - Advanced RISC machine (smartphones, tablets)
- Faster execution of instructions
- Less resource hungry
- Less power hungry

**Aim: To reduce the time taken (i.e. clock cycles) for each instructions to be executed**

- Limits interactions with RAM via:
	- A large number of genera-purpose registers (i.e. more than one Accumulator)
	- Fewer transistors (switches) used compared with a CISC processor (i.e. more hard-wired control when processing instructions)


### CISC Processors
- Used by general-purpose PCs and automation (control) devices

**Aim: To reduce the number of assembly instructions produced by a compiler**
- Compiler combines many simple instructions into a single complex instruction
- Requires more clock cycles to execute a single instruction
- Not suited to parallel processing or pipelining

_One instruction may do many things_
