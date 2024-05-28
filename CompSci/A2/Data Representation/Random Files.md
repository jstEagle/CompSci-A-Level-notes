- Record contain a <mark class="hltr-blue">record key</mark> (think ID/Key field/primary key equivalent)
- Records are placed into a random file by hashing the record key to a specific memory address.
- Random files support direct access to data -> to access that data, the record's key is rehashed using the same algorithm to tell the processor where to find the required record.

### Hashing algorithm
An algorithm that takes an input (record key), performs some form of math/arithmetic on the input and produces a <mark class="hltr-green">hash value</mark>.

<mark class="hltr-green">This hash value is a memory address</mark>

##### Hashing algorithm example
_Record key is an integer value_
Divide the record key by 10 using modulo division. Store the address at the remainder of this calculation.

| Record Key | Hash / Address |
| ---------- | -------------- |
| 10007      | 7              |
| 10005      | 5              |
| 20007      | 7              |
##### Problem:
2 or more records can <mark class="hltr-red">clash</mark>(hash) to the same address.

##### Solutions:
1) Overflow table
2) Chaining

1) There is a reserved space in RAM for an Overflow Table which can store clashed records.
![[Pasted image 20240229184429.png]]

2) If a clash occurs. Then the new data that is clashing with the already existing data gets moved onto the next free memory location.


```Pseudocode
DECLARE Address : INTEGER
DECLARE Record : STRING
DECLARE NewRecord : STRING

OPENFILE "Data.dat" FOR RANDOM

Address <- Hash(12345)

SEEK "Data.dat", Address

// Reading
GETRECORD "Data.dat", Record

// Writing
PUTRECORD "Data.dat", NewRecord

CLOSEFILE "Data.dat"
```

