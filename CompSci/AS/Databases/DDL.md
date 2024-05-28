ALE- [[DML]]

- Change table structure (ALTER TABLE)
- Add tuple to table (INSERT INTO... VALUES)
- Remove a tuple form a table (DELETE FROM)
- Change the value of a field in a single tuple (UPDATE.... SET.... WHERE)

CREATE TABLE Products(
	ProductID CHAR(8), PRIMARY KEY NOT NULL  //Must be 8 characters, not more not less
	ProductName VARCHAR(100) //can be 0 - 100 characters
	Quantity INT NOT NULL
)

NOT NULL - Always goes with primary key but can also be used with other fields. Means that the field cannot be left empty.

| ProductID | ProductName | Quantity |
----

CHAR is a fixed-length string
VARCHAR is a variable-length string

ALTER TABLE Products
ADD Price CURRENCY;

| ProductID | ProductName | Quantity | Price |
----

INSERT INTO Products(ProductID, ProductName, Price, Quantity)
VALUES('12345678', 'Apples', 12.00, 5),
			('23534543', 'Tractors', 1.75, 12),
			('88888888', 'Chopsticks', 2.50, 50);

| ProductID | ProductName | Quantity | Price |
| --------- | ----------- | -------- | ----- |
| 12345678  | Apples      | 5        | 12.00 |
| 23534543  | Tractors    | 12       | 1.75  |
| 88888888  | Chopsticks  | 50       | 2.50  |

DELETE FROM Products
WHERE ProductID = '23534543';

| ProductID | ProductName | Quantity | Price |
| --------- | ----------- | -------- | ----- |
| 12345678  | Apples      | 5        | 12.00 |
| 88888888  | Chopsticks  | 50       | 2.50  |


UPDATE Products
SET ProductName = 'Japanese Chopsticks'
WHERE ProductID = '88888888';

UPDATE Products
SET Price = 189.99
WHERE ProductID = '88888888';

| ProductID | ProductName | Quantity | Price |
| --------- | ----------- | -------- | ----- |
| 12345678  | Apples      | 5        | 12.00 |
| 88888888  | Japanese Chopsticks  | 50       | 189.99  |




CREATE TABLE Suppliers(
	SupplierName VARCHAR(100),
	SupplierID VARCHAR(5)
	NextShipmentDate DATE
);

CREATE TABLE Products(
	ProductID CHAR(8) PRIMARY KEY NOT NULL,
	ProductName VARCHAR(100).
	Quantity INT NOT NULL,
	FOREIGN KEY (SupplierID) REFERENCES Suppliers(SupplierID)
);


![[Pasted image 20230731190057.png]]

_Suppliers(<mark class="hltr-cyan">SupplierID</mark>, SupplierName, NextShipmentDate)_
_Products(ProductID, ProductName, Quantity, <mark class="hltr-green">SupplierID</mark>)_

In Suppliers Table, SupplierID is the <mark class="hltr-cyan">Primary Key</mark>. In Products Table, SupplierID is the <mark class="hltr-green">Foreign Key.</mark>
