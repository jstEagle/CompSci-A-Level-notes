### During data entry
##### Visual check
Human looks at screen to check if data entry has the correct spelling, correct textbox etc.

##### Double entry
Data is input twice, two entries compared. e.g. password verification.


### During data transmission
##### Parity
2 types of parity - odd parity and even parity (number of ones)

2 approaches - parity (bit) or parity block (byte)


###### <mark class="hltr-cyan">Parity bit</mark> check
- Each byte has a <mark class="hltr-cyan">parity bit</mark> added to it
- 0 or 1 - to make the total number of 1s odd or even

<u>Even parity</u>
X 0 1 1 0 1 1 0 X - The <mark class="hltr-cyan">parity bit</mark> would be 0
X 1 1 0 1 1 0 1 X - The <mark class="hltr-cyan">parity bit</mark> would be 1
X 0 1 0 1 1 1 0 X - The <mark class="hltr-cyan">parity bit</mark> would be 0

7 - bits is the data

X - <mark class="hltr-cyan">parity bit</mark> - can be on the left or right but not both

- The parity bit is sent with the data (byte)
- Receiver - counts the number oof 1s in the received byte (including parity bit) - odd? or even?
- If even parity was used and an odd number of 1s is received, something went wrong during transmission.
- BUT - if an even number of bits are at fault, parity is still passed.

###### Parity Block (Byte) Check
- multiple byes are sent together
- each byte has its own parity bit
- an extra parity byte sent wit the block of data

<u>Even parity</u> - sent
<mark class="hltr-cyan">0</mark> 0 1 1 0 1 1 0 
<mark class="hltr-cyan">1</mark> 0 1 1 1 1 0 1
<mark class="hltr-cyan">0</mark> 0 1 0 1 1 1 0
<mark class="hltr-cyan">0</mark> 1 1 0 0 0 0 0
<mark class="hltr-cyan">1 0 0 0 0 1 0 0</mark>

<mark class="hltr-cyan">Parity bits</mark> - are set to 1 to make a row or column have an even number of 1s

<u>Even parity</u> - sent
<mark class="hltr-cyan">0</mark> 0 1 1 0 1 1 0 
<mark class="hltr-cyan">1</mark> 0 1 1 0 1 0 0
<mark class="hltr-cyan">0</mark> <mark class="hltr-red">1 0</mark> 0 0 1 1 0
<mark class="hltr-cyan">0</mark> 1 1 0 0 0 0 0
<mark class="hltr-cyan">1 0 0 0 0 1 0 0</mark>

1) Count number of 1s in each byte
2) Count number of 1s in each column
3) Faulty bit found at intersection
##### Checksum
<mark class="hltr-red">Hashing algorithm</mark> - data to send is input, output is a hash value (<mark class="hltr-red">checksum</mark>); receiver repeats the process on the received data - <u>2 <mark class="hltr-red">checksums</mark> are compared</u>, if they are different then something happened during transmission.

<mark class="hltr-red">Checksum</mark> is <u>sent with the data</u> (e.g. checksum is included in the trailer of each data packet)

