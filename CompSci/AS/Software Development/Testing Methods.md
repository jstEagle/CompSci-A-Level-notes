### Black box testing
- Only concerned with the functionality of the program
- Does not look at the source code at all
- Uses test data as the known inputs
- Compares the expected outputs with the actual outputs

| Test Data (inputs) | Type of Test Data | Expected output        | Actual Output                |
| ------------------ | ----------------- | ---------------------- | ---------------------------- |
| abc123Q!           | Extreme           | Accepted - min 8 chars | Accepted - next screen       |
| abc123Q            | Invalid           | Rejected - < 8 chars   | Accepted - next screen ERROR | 


### White box testing
- Focuses on the code
- Uses test data to examine all possible pathways through code
- e.g. Checks that all branches of an IF statement or CASE structure can potentially run, checks that all pre-condition (WHILE) loops run under at least some inputs. Checks that the other types of loops all run the correct number of iterations


### Stub testing
- Performed whilst the source is being written
- Writing a header/footer of a module with a test output (procedure) or test return value (function), so that another module can continue to be written
- The program will come back to this 'stub' module at a later time to write its code


### Integration testing
- Combining completed (and independently testing) modules to create the whole program
- May raise issues with global variables with the same identifier being used for different purposes and/or data types
- May also highlight issues with parameter values, text files, array data that has been changed in module A when module B was expected older data, for example.


### Dry-run
- Used to locate an error in the source code
- Using a trace table to identify where a bug is occurring in a section of code/algorithm
- Also known as a 'walk-through' because you are examining the contents of variables line by line


### Walkthrough
- See 'dry-run'


### Alpha testing
- In-house testing of the almost completed program
- Often done by other developers in the same company (rather than the developers who wrote the source code)
- Users are relatively 'techy'
- You know the exact specifications of their computers (e.g. OS, GPU, CPU etc.)


### Beta testing
- Getting people outside of the developers' company to run the completed software on their own machines
- Caveat is that the program is not fully tested and may still have major bugs to be discovered or fixed
- Users agree to share their computer specs and provide detailed feedback of their experiences (positive or negative)


### Acceptance testing
- The final sign-off by the client, agreeing that the completed and delivered software meets all of the user requirements that were specified at the beginning of the software development process
- If agreed, the programmers get paid... due to fulfilling their contract accurately

