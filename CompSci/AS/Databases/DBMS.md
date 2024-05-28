# Database Management Systems (DBMS)

## Introduction to DBMS

- **Definition:** A Database Management System (DBMS) is a software system that manages and organizes data in a structured way, making it easier to store, retrieve, and manipulate.

## Key Components of a DBMS

- **Data:** Information stored in the database.
- **Database:** A structured collection of data.
- **DBMS Software:** The software responsible for managing the database.
- **Users:** Individuals or applications interacting with the database.

## Types of DBMS

- **Relational DBMS (RDBMS):**
    
    - Uses tables (relations) to store data.
    - Examples: MySQL, PostgreSQL, Oracle.
- **NoSQL DBMS:**
    
    - Suitable for unstructured or semi-structured data.
    - Types: Document-based (e.g., MongoDB), Key-value (e.g., Redis), Column-family (e.g., Cassandra).

## Advantages of DBMS

- Data Integrity: Ensures data accuracy and consistency.
- Data Security: Provides user authentication and access control.
- Data Abstraction: Separates physical and logical data representations.
- Data Query Language: Allows users to retrieve data using SQL (Structured Query Language).

## Database Schema

- **Definition:** A blueprint or structure that defines how data is organized in the database.
- **Types:**
    - **Physical Schema:** Describes how data is stored on disk.
    - **Logical Schema:** Describes data relationships and attributes.
    - **View Schema:** A subset of the logical schema, visible to specific users.

## SQL (Structured Query Language)

- **Purpose:** Used for database operations like querying, updating, inserting, and deleting data.
- **Basic SQL Commands:**

|Command|Description|
|---|---|
|SELECT|Retrieve data from one or more tables.|
|INSERT INTO|Add new records to a table.|
|UPDATE|Modify existing records in a table.|
|DELETE FROM|Remove records from a table.|
|CREATE TABLE|Create a new table with specified columns and types.|
|ALTER TABLE|Modify the structure of an existing table.|
|DROP TABLE|Delete an entire table and its data.|

## Database Normalization

- **Purpose:** Organizing data to minimize redundancy and dependency issues.
- **Normal Forms:** A set of rules to achieve data normalization.
    - 1NF (First Normal Form): Eliminate duplicate rows.
    - 2NF (Second Normal Form): Remove partial dependencies.
    - 3NF (Third Normal Form): Eliminate transitive dependencies.

## ACID Properties

- **Definition:** ACID stands for Atomicity, Consistency, Isolation, and Durability, which are properties that ensure database reliability.
- **Atomicity:** Transactions are treated as a single unit, either all succeed or all fail.
- **Consistency:** The database goes from one consistent state to another.
- **Isolation:** Concurrent transactions don't interfere with each other.
- **Durability:** Once a transaction is committed, its changes are permanent.