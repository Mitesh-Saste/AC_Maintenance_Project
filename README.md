#AC Maintenance Records Management System

This Java-based system helps manage and query air conditioning (AC) maintenance records. It allows users to-

1. Add maintenance records with a unique service code and AC type
2. Find the number of records for a specific AC type
3. Retrieve service codes for a given AC type

The system ensures input validation using regular expressions and exception handling.

Technologies Used
1. Java
2. Collections Framework (TreeMap, HashSet)
3. Regular Expressions
4. Exception Handling
5. Scanner for user input

How to run 

1. Clone Repo

git clone https://github.com/Mitesh-Saste/AC_Maintenance_Project.git
cd AC_Maintenance_Project

2. Compile Java files

javac MaintenanceInfo.java UserInterface.java

3. Run program

java UserInterface

User Input Format

1. Adding records

Enter number of records to be added
3
Enter the records (Service code: AC Type)
A001:Split
A002:Window
A003:Split

2. Searching records

Enter the AC type to be searched
Split
The records based on Split are 2

3. Retrieving Service Codes

Enter the AC type to identify the service codes
Window
Records based on the Window are
A002

Validation Rules

1. Service records must be entered in the format:
ServiceCode:ACType  (e.g., A001:Split)

2. AC types must contains only alphabetic characters (e.g., Split, Window, Central)

3. Numeric input validation prevents invalid entries

License

This project is open source. You are free to use, modify, and distribute it. 
