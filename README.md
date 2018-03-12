
# Objective : To mimic a basic ATM Machine's software that runs from the terminal. 

### ANALYSIS 

As specified in the objective of this document, the main purpose of this ATM Machine application is to mimic the 
basic functions of a regular ATM Machine in where the user can deposit money, withdraw money, transfer money and check account 
information, all from a previous opened bank account.  The programming language to be used to code the machine is JAVA and this
version corresponds to the first delivery of the code only with the basic functionality of an ATM machine. At its early stage the program 
won't be flexible enough to take care of multi threads, advanced security features or handle exceptions. It will be enhanced as the 
Bank makes more requirements and after the information collected from the testing users’ input. 

* USERS 

This application is designed for users of Bank X to make monetary transactions from and to their Bank Accounts.  
Demographics of the users aren’t relevant to the application itself since the only requirement for a user to be able to use the system is its ownership of a Bank Account at Bank X.  Users are required to know their Bank Account number and a “Unique Key” generated for the system (this password system will change in future versions) as well.  

User’s interaction with the application

To interact with the application, the user will access it by matching both, Account number and Unique Key. He/She then will select the preferred option (deposit, withdraw, transfer, check account info or quit) and follow a set of questions/instructions to perform the required action. The data feeding the operations is provided by the bank and the user, making it a two ways interaction application. 

* PRODUCT FEATURES

As stated in the introduction, this is the first version of the ATM Machine application (Version 1.0).  It provides the very basic functions of an ATM Machine with little or null flexibility and it is meant to test basic operations. Future versions of the application will include the following features:  

	Advanced security 
	Multi threading 
	Advanced Exception Handling
	A GIU 
	More flexibility and stronger relationship to the bank’s data system 

* LIMITATIONS

The current version of the application is limited to only provide basic transactions of virtual money from a temporary bank account created by the application itself and, an additional supporting bank account (to allow testing the transferring option of the machine).  It does not work yet with the Bank’s database, nor allows multiple users to perform multiple transactions.  
