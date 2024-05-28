Have a role over and above just storing data:

- **<mark class="hltr-green">Primary Key</mark>** - Uniquely identifies each tuple in a table. i.e. StudentID
- **<mark class="hltr-yellow">Foreign Key</mark>** - Links two tables because it contains the same data as the primary key in the table that its linking to.
- **<mark class="hltr-purple">Candidate Key</mark>** - A field that could be the primary key(i.e. uniquely identifies each tuple) is not the Primary Key. 
- **Secondary Key** - A candidate key that was not selected as the primary key.


The secondary key (or non-key field) is often used to **index** data in a data. Context will determine whether or not indexing of x fields is required.
_This speeds up queries in the field_

| <mark class="hltr-green">StudentID </mark> | FirstName | LastName | Age | <mark class="hltr-purple">DNA Sequencing</mark> |
| ------------------------------------------ | --------- | -------- | --- | -------------- |
| 01234                                      | Tim       | Stevens  | 16  |      AGT          |
| 15834                                      | Josh      | Smith    | 17  |      GTA          |
| 43854                                      | Bob       | Levine   | 15  |       APT         |
| 35839                                      | Melany    | Patricks | 16  |       VPT         |

|<mark class="hltr-yellow"> StudentID</mark> | Mark | Grade |
| --------- | ---- | ----- |
| 01234     |  25    |   D    |
| 15834     |   27   |    C   |
| 43854     |  23    |   E    |
| 35839     |  28    |   A    |


![[Pasted image 20230803122536.png]]
