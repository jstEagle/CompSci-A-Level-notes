### Stage One - Lexical Analysis
- **White space** removed
- **Comments** removed
- **Simple error check** (e.g. illegal variable names flagged)
- **Keywords/operators**, variables, constants and are **tokenised**
- **Symbol table established**, but not filled in other than identifiers

![[Pasted image 20240522115351.png]]


### Stage Two - Syntax Analysis
- The process of checking to see that the sequence of input characters is a valid sentence (i.e. code from lexical analyser is put through a grammar check)
- Symbol table filled in

![[Pasted image 20240522115520.png]]

##### - **Semantic analysis**
  - **Label checks**
  - **Flow of control checks**
  - **Declaration checks**

### Stage Three - Code Generation
![[Pasted image 20240522115646.png]]
**Interpreted OR Converted into distributable object code**
____

### Purpose of Code Optimisation
- Create efficient machine code
- Often used where speed and/or efficiency is critical (e.g. real-time computer systems), otherwise not worth the effort
- Uses **Linking** and **Loading** techniques

### Purpose of Linkers & Loaders
- Modules in source code are compiled separately
- **Loaders** - Determines location of separately compiled modules in memory / places (loads) separately compiled modules into memory
- **Linkers** - Calculates memory address of each compiled module in memory / links a program's modules, so that can work with each other

_____
### Errors in compilation
##### Lexical Analysis
- Illegal variable identifiers

IF illegal name found, add this to the error diagnostic report.

##### Syntax Analysis
- <mark class="hltr-purple">Parse</mark> tokens against the BNF rules of the language
- Semantic analysis, checks for meaning in statements
	-  e.g. closing brackets exist / semi-colons.

<mark class="hltr-purple">Parse = Going through</mark>

Any errors found are listed in the same error diagnostic report as mentioned in lexical analysis.

_Any errors in the error report, stops compilation at the end of the syntax analysis stage_
