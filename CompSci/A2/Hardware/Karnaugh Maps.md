K-Map for short.

Aim: to produce the optimal sum-of-products
_useful for larger circuits_

### Steps:
1. Sum-of-products (All possible combinations of 1 output written out in boolean algebra notation)
2. KMap and grey code (diagram)
3. Optimal sum-of-products (loop all groups of 1s, size of loop must be power of 2)
4. Simplified sum-of-products (boolean algebra - short)


### Example
![[Pasted image 20240506100553.png]]
**Boolean algebraic expression:** $\overline{(AB + \overline{C})}*\overline{D}$

##### Truth table

| A   | B   | C   | D   | AB  | NOT(C) | AB+NOT(C) | AND D | X   |
| --- | --- | --- | --- | --- | ------ | --------- | ----- | --- |
| 0   | 0   | 0   | 0   | 0   | 1      | 1         | 0     | 1   |
| 0   | 0   | 0   | 1   | 0   | 1      | 1         | 1     | 0   |
| 0   | 0   | 1   | 0   | 0   | 0      | 0         | 0     | 1   |
| 0   | 0   | 1   | 1   | 0   | 0      | 0         | 0     | 1   |
| 0   | 1   | 0   | 0   | 0   | 1      | 1         | 0     | 1   |
| 0   | 1   | 0   | 1   | 0   | 1      | 1         | 1     | 0   |
| 0   | 1   | 1   | 0   | 0   | 0      | 0         | 0     | 1   |
| 0   | 1   | 1   | 1   | 0   | 0      | 0         | 0     | 1   |
| 1   | 0   | 0   | 0   | 0   | 1      | 1         | 0     | 1   |
| 1   | 0   | 0   | 1   | 0   | 1      | 1         | 1     | 0   |
| 1   | 0   | 1   | 0   | 0   | 0      | 0         | 0     | 1   |
| 1   | 0   | 1   | 1   | 0   | 0      | 0         | 0     | 1   |
| 1   | 1   | 0   | 0   | 1   | 1      | 1         | 0     | 1   |
| 1   | 1   | 0   | 1   | 1   | 1      | 1         | 1     | 0   |
| 1   | 1   | 1   | 0   | 1   | 0      | 1         | 0     | 1   |
| 1   | 1   | 1   | 1   | 1   | 0      | 1         | 1     | 0   |

### 1. Sum-of-products
$$'A'B'C'D + 'A'BC'D + 'A'BCD + 'AB'C'D + 'ABC'D + 'ABCD + A'B'C'D + A'BC'D + A'BCD + AB'C'D+ ABC'D$$

### 2. KMap


|     | 00  | 01  | 11  | 10  |
| --- | --- | --- | --- | --- |
| 00  | 1   | 1   | 1   | 1   |
| 01  | 0   | 1   | 0   | 0   |
| 11  | 1   | 1   | 0   | 1   |
| 10  | 1   | 0   | 1   | 1   |
![[Pasted image 20240506101931.png]]

### 3. Optimal Sum-of-products
$$\bar{C}\bar{D} + \bar{A}\bar{B}C + \bar{A}BD + AC\bar{D} + A\bar{B}C$$

Already simplest form


### Example 2
![[Pasted image 20240506102235.png]]

### 1. Sum-of-products
$$\bar{A}\bar{B}C\bar{D} + \bar{A}\bar{B}CD + \bar{A}BCD + A\bar{B}\bar{C}D + AB\bar{C}\bar{D} + AB\bar{C}D + ABCD$$

### 2. KMap
![[Pasted image 20240506102444.png]]

### 3. Optimal sum-of-products
$$AB\bar{C} + A\bar{C}D + CD\bar{B} + \bar{A}\bar{B}C$$
Already in simplest form
