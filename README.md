
# HR System Project

## Author
Makarand Patil

## Description
The Employee Management System is a Java program that models employees, sales representatives, and sales managers. It provides functionalities to calculate various employee-related metrics such as time to retirement, vacation time left, bonus, and commission.

## Features

1] Employee Class

The `Employee` class represents a general employee with attributes like first name, last name, registration number, age, days worked, vacation days taken, years worked, and salary. It includes methods to calculate time to retirement, vacation time left, and bonus.

2] SalesRep Class

The SalesRep class extends the Employee class and adds a salesMade attribute. It includes a method to calculate commission based on sales made.

3] SalesManager Class

The SalesManager class extends the SalesRep class and includes a salesTeam attribute, which is a HashMap of registration numbers to sales representatives.

## Installation
1. Make sure you have Java installed on your machine.
2. Clone this repository:
   ```bash
   git clone https://github.com/Makarand41/Hr_System.git
3. Compile the Java files:
    ```bash
    javac Main.java Employee.java SalesManager.java salary.java

4. Run the program:
    ```bash
    java Main.


## How to run the project
1. You only need to run Main.java class.



## Note for Users
1. There is extra Main2.java file in the folder ; This file is only if you want to work with Employee class . Here we can add employee , find employee etc . So no need to look for it
