### Backus-Naur form
Named after John Backus and Peter Naur

They are a set of rules that describe the syntax of a programming language
- Assignment statement
- Operators
- Declaration statements
- Data types
- Selection: IF, SWITCH-CASE
- iteration: FOR, WHILE, REPEAT
- etc.

______
The standard structure of a BNF (Backus-Naur Form) rule statement consists of a non-terminal symbol, followed by the "::=" symbol, and then the right-hand side expression. The right-hand side expression defines the production rules for the non-terminal symbol.

Here is an example of a BNF rule statement:

```
<non-terminal> ::= <expression>
```

In this structure:

- `<non-terminal>` represents a non-terminal symbol, which is a placeholder for a syntactic category or a rule.
- `::=` is the "is defined as" symbol, indicating that the non-terminal on the left-hand side is defined by the expression on the right-hand side.
- `<expression>` represents the right-hand side expression, which can consist of terminals (literals or tokens) and non-terminals.

The right-hand side expression can include various elements, such as terminals enclosed in quotes, non-terminals enclosed in angle brackets, and special symbols like "|" for alternatives, `[` and `]` for optional elements, and `{` and `}` for repetition.

Here is an example of a BNF rule statement with multiple alternatives and optional elements:

```
<expression> ::= <term> "+" <expression>
               | <term> "-" <expression>
               | <term>
```

In this example, `<expression>` can be defined as `<term> + <expression>`, `<term> - <expression>`, or just `<term>`. The vertical bar "|" separates the alternatives, and the absence of "|" at the end indicates the default option.
_____
##### <u>Example</u>
```BNF
<assignement statement> ::= <variable> = <variable> | <variable> = <number>
```

```BNF
<number> ::= <digit> | <digit><digit> | <digit><number>

<digit> ::= 0 | 1 | 2 | 3

<variable> ::= <letter> | <letter><number> | <letter><variable>

<letter> ::= a | b | c
```

According to the rules above you could declare a variable with a single letter, or a letter and a number. Or any combination of the defined letters and numbers. <mark class="hltr-green">If instead of numbers it was </mark>`<digit>` <mark class="hltr-green">in the rule. Then the declaration could only ever be a digit followed by a letter. Not multiple digits.</mark>

Also in the example above no declaration is allowed to start with a digit.

_____
### Declaration rules in Java
```BNF
<declaration statement> ::= <data type><variable>;
						| <data type><variable> = <variable>;
						| <data type><variable> = <number>;
						| <data type><variable> = <letter>;
```


