 Structured query language - 5th generation, high-level, declarative programming paradigm.

Used to CREATE and QUERY (search) databases

<mark class="hltr-cyan">SELECT</mark> ProductName, Price 
FROM PRODUCTS;

<mark class="hltr-cyan">SELECT</mark> *
FROM PRODUCTS;

<mark class="hltr-cyan">SELECT</mark> ProductName, Price
FROM PRODUCTS
WHERE BBD < '01/01/2024';

<mark class="hltr-cyan">SELECT</mark> ProductName, Price
FROM PRODUCTS
WHERE BBD < '01/01/2024' AND ........;
ODER BY Price DESC;


CREATE TABLE - create a blank table (fields, data types, key fields set, any other constraints)

ALTER TABLE - Add another field to an existing table
ADD

INSERT INTO - Place a tuple (data) into a table
VALUES

DELETE FROM - Remove a tuple from a table
WHERE

UPDATE 
SET
WHERE

## Key words:
SELECT
FROM 
WHERE
ORDER BY
GROUP BY
Inner join: ON
CREATE DATABASE

---------------

SELECT ProductName, Price
FROM PRODUCTS
WHERE BBD < '01/01/2024'
ORDER BY Price DESC
GROUP BY Supplier ID;

| <mark class="hltr-blue">ProductName</mark>    | Price  | SupplierID* | BBD      |
| -------------- | ------ | ---------- | -------- |
| Baked Beans    | 1.20   | 2          | 04/12/23 |
| Tuna           | 2.49   | 1          | 4/11/23  |
| Himalayan Salt | 9.00   | 2          | 04/12/24 |
| Tractors       | 9999.0 | 1          | 04/12/23 |
| Pen            | 1.50   | 2          | 04/12/23 |

SELECT ProductName, Price
FROM PRODUCTS
WHERE BBD < '01/01/2024';

|             |        |
| ----------- | ------ |
| Baked Beans | 1.20   |
| Tuna        | 2.49   |
| Tractors    | 9999.0 |
| Pen         | 1.50   | 

SELECT ProductName, Price
FROM PRODUCTS
WHERE BBD < '01/01/2024'
<mark class="hltr-orange">ORDER BY Price DESC</mark>;

**The above table, flipped in order of price - Pen, Tractors, Tuna, Baked Beans (and their prices)

SELECT ProductName, Price
FROM PRODUCTS
WHERE BBD < '01/01/2024'
ORDER BY Price DESC
<mark class="hltr-orange">GROUP BY Supplier ID</mark>

|             |        |
| ----------- | ------ |
| <mark class="hltr-red">Tractors</mark>    | <mark class="hltr-red">9999.0</mark> |
| <mark class="hltr-red">Tuna</mark>        | <mark class="hltr-red">2.49</mark>   |
| <mark class="hltr-green">Pen</mark>         | <mark class="hltr-green">1.50</mark>   |
| <mark class="hltr-green">Baked Beans</mark> | <mark class="hltr-green">1.20</mark>       |


-----


### Extracting data from two tables

**Products**

| <u>ProductName</u> | Price   | SupplierID* |
| ----------- | ------- | ----------- |
| Tractors    | 9999.00 | 1           |
| Tuna        | 2.49    | 1           |
| Pen         |         | 2           |
| Baked Beans | 1.20    | 2            |


**Suppliers**

| <u>SupplierID</u> | SupplierName | Email          |
| ---------- | ------------ | -------------- |
| 1          | Fred         | fred@gmail.com |
| 2          | Bob          | Bob@yahoo.net  | 
_Not real e-mails_

- 1 Supplier - many products
- 1 Product, one supplier

Show the product name, price and name of the supplier of all products costing more than $2

SELECT PRODUCTS.ProductName, PRODUCTS.Price, SUPPLIERS.SupplierName
<mark class="hltr-purple">FROM PRODUCTS <u>INNER JOIN</u> SUPPLIERS</mark>
<mark class="hltr-purple"><u>ON</u> PRODUCTS.SupplierID = SUPPLIERS.SupplierID</mark>
WHERE PRODUCTS.Price > 2;

------
### Aggregate Functions
- <mark class="hltr-green">COUNT()</mark>
- <mark class="hltr-grey">SUM()</mark> - Numeric fields only
- <mark class="hltr-pink">AVG()</mark> - Numeric fields only

SELECT<mark class="hltr-green"> COUNT($*$)</mark>
FROM PRODUCTS;

//return 4
//counts how many tuples are in a table. Ignores <mark class="hltr-yellow">NULL</mark> values


SELECT <mark class="hltr-green">COUNT(Price)</mark>
FROM PRODUCTS;

//return3
//counts how many tuples in the table have a price


SELECT <mark class="hltr-grey">SUM(Price)</mark>
FROM PRODUCTS;

//Total all non-null values in the Price field


SELECT <mark class="hltr-pink">AVG(Price)</mark>
FROM PRODUCTS;

//Returns the average price of all products with non-null values


<mark class="hltr-yellow">NULL</mark> - Any field that has no entry. **A field with a zero in it is a non-null value**


