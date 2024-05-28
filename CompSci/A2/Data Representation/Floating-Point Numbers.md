
- Signed ([[Two's Complement]] - positive or negative)
- Unsigned (positive number only)
- whole numbers (integer only)
- BCD ([[Binary Coded Decimals]])
- Addition ([[Binary Addition]])
- Subtraction 


### Format
### <mark class="hltr-blue">0<mark class="hltr-red">.</mark>0000000</mark><mark class="hltr-green">0000</mark>

<mark class="hltr-red">. </mark>- Binary point
<mark class="hltr-blue">00000000</mark> - Mantissa
<mark class="hltr-green">0000</mark> - Exponent

**Mantissa** - The fractional part of the real number (i.e. the number being stored)

**Exponent** - By how much to the power of 2 the mantissa is multiplied, a two's complement integer

**Register** - The total number of bits used to store a real number. In the example above the register is 12. 8 bits mantissa and 4 bits exponent

_Mantissa and exponent are both two's complement_


### Converting a floating-point binary number to denary
1) Identify the exponent <u>in denary</u>
2) show how the exponent affects the mantissa - show the new position of the binary point
3) Final answer

| 32  | 16  | 8   | 4   | 2   | 1   |     | $\frac12$ | $\frac14$ | $\frac18$ |
| --- | --- | --- | --- | --- | --- | --- | --------- | --------- | --------- |

##### Binary to Denary
8 bits mantissa
4 bits exponent

00110000|0010
Exponent = $2_{10}$
Mantissa = 0.0110000 $\rightarrow$ Move 2 right $\rightarrow$ 001.10000

$$
1 + \frac12
$$
$$= 1.5\ /\ 1\frac12$$

##### Denary to Binary
Also **normalizing the mantissa**
_The two MSB of the mantissa are different_

$$ -3.5_{10}$$
$$3.5_{10} = 11.1\ Fixed\ point,\ unsigned$$
$$ = 0.1110000_2$$
$$= 10001111\ \ \ One's\ complement$$
$$10010000\ \ \ Two's\ complement$$

$$= 2_{10}\ exponent$$
$$-3.5_{10} = 10010000\ 0010$$
$$Normalized$$


### Normalization
When floating-point numbers are not normalized, it means they are represented in a format where the leading bit of the significand (also known as mantissa) is not guaranteed to be 1. In normalized floating-point representation, the leading bit is always 1, which allows for efficient storage and arithmetic operations.

When numbers are not normalized, it can lead to several issues:

1. **Loss of precision**: Normalization ensures that the most significant digit of the significand is always 1, maximizing the precision of the representation. When numbers are not normalized, the precision of the representation can decrease, leading to rounding errors and loss of precision in calculations.

2. **Reduced efficiency**: Normalized floating-point representations allow for more efficient arithmetic operations because the positions of the radix point are consistent across different numbers. When numbers are not normalized, arithmetic operations may require additional steps to align the radix points, resulting in reduced efficiency.

3. **Compatibility issues**: Non-normalized floating-point representations may not be compatible with standard floating-point formats used in hardware and software libraries. This can lead to interoperability issues when exchanging data between systems that use different floating-point representations.

In summary, normalization is an essential aspect of floating-point representation that ensures precision, efficiency, and compatibility in numerical computations. When floating-point numbers are not normalized, it can introduce various problems related to precision, complexity, efficiency, and compatibility.
