### 1NF
- A single cell must not hold more than one value
- Atomic data
- There must be a primary key for identification
- No duplicated rows or columns
- No repeating data

### 2NF
- Already in 1NF
- Has no partial dependencies. That is, all non-key attributes are fully dependent on the primary key

### 3NF
Non - prime attribute (an attribute that is not part of the candidate's key) is dependent on another non-prime attribute. This is what the third normal form (3NF) eliminates.

- Already in 2NF
- Have no transitive partial dependency - A non-key field is not derived from another non-key field


## Examples of 1NF, 2NF, and 3NF

Database normalization is quite technical, but we will illustrate each of the normal forms with examples.

Imagine we're building a restaurant management application. That application needs to store data about the company's employees and it starts out by creating the following table of employees:

|EMPLOYEE_ID|NAME|JOB_CODE|JOB|STATE_CODE|HOME_STATE|
|---|---|---|---|---|---|
|E001|Alice|J01|Chef|26|Michigan|
|E001|Alice|J02|Waiter|26|Michigan|
|E002|Bob|J02|Waiter|56|Wyoming|
|E002|Bob|J03|Bartender|56|Wyoming|
|E003|Alice|J01|Chef|56|Wyoming|

All the entries are atomic and there is a composite primary key (employee_id, job_code) so the table is in the **first normal form (1NF)**.

But even if you only know someone's `employee_id`, then you can determine their `name`, `home_state`, and `state_code` (because they should be the same person). This means `name`, `home_state`, and `state_code` are dependent on `employee_id` (a part of primary composite key). So, the table is not in **2NF**. We should separate them to a different table to make it 2NF.

### Example of Second Normal Form (2NF)

#### `employee_roles` Table

|EMPLOYEE_ID|JOB_CODE|
|---|---|
|E001|J01|
|E001|J02|
|E002|J02|
|E002|J03|
|E003|J01|

#### `employees` Table

|EMPLOYEE_ID|NAME|STATE_CODE|HOME_STATE|
|---|---|---|---|
|E001|Alice|26|Michigan|
|E002|Bob|56|Wyoming|
|E003|Alice|56|Wyoming|

#### `jobs` table

|JOB_CODE|JOB|
|---|---|
|J01|Chef|
|J02|Waiter|
|J03|Bartender|

`home_state` is now dependent on `state_code`. So, if you know the `state_code`, then you can find the `home_state` value.

To take this a step further, we should separate them again to a different table to make it 3NF.

### Example of Third Normal Form (3NF)

#### `employee_roles` Table

|EMPLOYEE_ID|JOB_CODE|
|---|---|
|E001|J01|
|E001|J02|
|E002|J02|
|E002|J03|
|E003|J01|

#### `employees` Table

|EMPLOYEE_ID|NAME|STATE_CODE|
|---|---|---|
|E001|Alice|26|
|E002|Bob|56|
|E003|Alice|56|

#### `jobs` Table

|JOB_CODE|JOB|
|---|---|
|J01|Chef|
|J02|Waiter|
|J03|Bartender|

#### `states` Table

|STATE_CODE|HOME_STATE|
|---|---|
|26|Michigan|
|56|Wyoming|

Now our database is in 3NF.