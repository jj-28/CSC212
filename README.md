# CSC212
Code from my Introduction to Programming course (Fall 2016)

# Assignments
## Assignment 1 - Solve for Y and Y'
### Purpose
Math calculators give you nice tools for graphing quadratic equations, but, for us, the quadratic equations give us just a good example for getting input from the user, making some calculations, and then producing some basic output; no graphs. This first assignment also gives us a chance to see how we guard against bad input.
 
### Problem
You are going to write a program that computes Y and Y' (y prime). The quadratic equation  and the formula for its derivative  are the two basic calculations you will be expected you perform. Y = ax 2  + bx + c  and Y' = 2 ax + b In these equations, a, b, and c are considered constants, and given an X value, you can solve for Y and Y’. If you want to learn more about quadratic equations, there are plenty of resources online on them. Most of you also know these based on your algebra and trig course work in high school.
 
### Input
The values for   X  and the coefficients   a  and   b and the constant term   c  are provided interactively in your program (prompt for each, and store what the user types in a variable).  The expected value for a, b, and c are integer value (i.e. int) and the expected value for x is a double value (i.e. double). It is perfectly ok for the program to “blow up” (i.e. abort) if incorrect type of values are entered. You will notice that in the template provided, we also guard against a zero value for   a  as in order for the equation to be quadratic (not linear), this coefficient a can’t be zero.
### Process
Your program needs to use the formula’s given above to calculate Y and Y'. Note that in Java and for that matter most programing languages Y' can't be valid variable, be sure to use a name like Y_Prime instead.
 
### Output
The output need to be in the form  of the example shown below:
 
For X, a, b, and c values: 10.5, 12, 15, and 19 respectively, the Y value is 1499.5
For X, a, and b value: 10.5, 12, and 15 respectively, the Y' value is 267.0
 
### Template to copy from
The template   equation.java     should be used and the sections needed filled in.
Programming Challenge (Extra Credit)
Continue to ask for input for the variable   a  until a value that is not equal to zero is entered for it.
Hint: Learn about do/while loops.


## Assignment 2 - Marathon Race
### Purpose
### Learning to write programs that process significant amounts of data is part of the process for understanding why learning programming is so important. Programming offers so much promise in performing tasks efficiently and accurately. Most of us can perform a series of steps a few times and just make a few mistakes along the way, but can any of us perform a set of steps thousands of times without errors? I don’t think so and we don’t have to, because that’s what programming affords us. If you know what needs to be done to a series of input data, then we can easily write a program for it where those steps are repeated as many times as we need them to be.
 
### Problem
We want an application developed to process data from a marathon race. We need to produce who won and who came in last.   This program will take in data on individual runners for a race and tells us once they are all processed, not only who the fastest runner was, but also who the slowest was.
 
### Input
This will be the first assignment where you will process data stored in a file. The reason for this is simple, when we need to process a substantial amount of data, it simply is easier to have data in a file than it is to type each individual entry in one at a time when prompted for it by the program. Just think about the process of debugging a program where each time you make a small correction/change, you would then run the program again and within seconds see if your changes or corrections did what you expected.
In this data file, in each line of it, we put in four pieces of information. The individual runner’s number which you can assume to be unique to that runner, the time the runner ran the marathon, in hours, minutes, and seconds. Runner’s number, the hours and minutes are going to be integer values and seconds is going to be a double.
So, here is an example:
109 2   15   9.5
112 3   55 10.4
211 4    1   56.5
 
The first number on each line is the runner’s number, the 2 nd number is the hours, 3 rd is the minutes, and the last number is the seconds. 
### Algorithm
Your program needs to follow a basic algorithm:
Open the file with runner data
Instantiate Runner variables for fastest and slowest runners.  The time for fastest needs to be a very big number (e.g., 100 hours). The time for slowest needs to be zero.
While there is data {
Read information for a runner
If this runner is faster than the fastest
                       Replace fastest with the runner just read
             End-If
             If this runner is slower than the slowest runner
                      Replace slowest with the runner just read
             End-If
 }
Output the fastest and slowest
 
### Helper Class
Develop the Runner helper class that allows us to track a runner’s number, and time.  This helper class allows us to encapsulate the information we wish to maintain for each runner so that we can easily compare runners’ times and output their information.

Here is the basic template for Runner:

public class Runner {

    int number, hours, minutes;

    double seconds;

    double total_time;

   

    /* set runner's number, hours, minutes, and seconds. Calculate total

       time in seconds and store in total_time.

    */

    public Runner (int n, int h, int m, double s){

       

    }

    /* write the methods that return number, hours, minutes,

       seconds, and total_time

    */

 }

### Output
The output needs to be in the form of the example shown below:
 
The fastest runner is XXXXX with the time XX:XX:XX.X
The slowest runner is XXXXX with the time XX:XX:XX.X
 
### Template
You’ll begin this assignment with the standard NetBeans project template. Obviously, you can copy any code section from our labs or class exercises at this point. For example, we have code that we have already written that you can just use for opening a file and reading data from it.
Be sure to add standard documentation to you program, your name, date, program description, etc.
 
You’ll need the data file  runner.txt. Be sure that it is stored in the assignment 2’s project folder. Please keep in mind that runner. txt does not test for all possible scenarios, so, feel free to change it to test various conditions.
### Extra Credit
Keep track of the top two runners and bottom two runners, keeping in mind that if there is only one runner in the race, you don’t have a 2 nd best runner or a 2 nd worst runner and should not attempt to display the 2 nd best or the 2 nd worst runners’ data.


## Programming Assignment #3 – An ATM
### Purpose
You will be learning to write programs with better design strategies using OO principles. Another feature of this assignment is that you are going to solve this problem in two stages which is an important design and implementation strategy. You'll learn to develop classes, use arrays, and use them in an application that you develop.

### Problem

This program will have two parts that will need to be completed in sequence. In the first part, you will implement the concept of an account, where a user’s name, their pin, and account balance are represented. You will also build another class that enable to read all accounts’ information and store them using an array as part of this part 1.  In part 2, you will develop the ATM interface that will permit the user to perform some transactions such deposit money, withdraw money, and check balance.

Part 1 Due Friday, October 7 2016
First you will develop a class Account.  The signature of this class is provided in the template linked to here.  You will need to add the variables and the code for the methods and the constructor for this class. Submit the .zip file for a project that includes this class and the main application that tests it.

The method authorize () let’s us check to make sure a pin that is expected to be entered by a user indeed matching the pin for the account.

The method withdraw () enables to take money out of the account (reduce account balance by the amount identified).  Obviously, the method must safeguard against attempt to overdraft.

The method deposit () let us add money to the account’s balance based on the amount provided. 

The other methods, balance (), pin (), and name () are simply designed to return the values stored in the object.

Part 2 Due Friday, October 21 2016
Develop the class allAccounts, the signature is also in the template, that will permit us to maintain all bank accounts.  The functionality provided here involve loading user account data into an array and providing the ability to locate a bank account.  It is important to point out that the array and the size of the are static variables in this class which means in our project we only just have one set of accounts to maintain.

The method load () is designed to load data from a data file into an array of Account objects.  The method locate () searches for an Account in the array based on the account holder’s name and returns the account found.

The template provided below is for Part2, note that it includes three java source files as well as a test data file.  There is of course one .java file here for each of the two classes that you are responsible in developing, Account.java (you developed this in part 2; so, the version in the template needs to be replaced here by what you developed in Part 1) and allAccounts.java.  Also, the BankAccountProject.java file should be used to test allAccounts classes that you are expected to develop. I have put a couple of lines to for testing as examples, but you are expected to do more to make sure all methods operate correctly. It is a good idea, for example to add code that display all accounts stored in allAccounts after the load () method is called. In a format like:

NAME    PIN     BALANCE     

xxxxx      xxxx    x,xxx,xxx.xx   

x here is the representative for a digit.

 

### Part 3 Due Friday, October 28 2016
Develop an application that uses both of these classes developed in Part 1 and 2. You will need to provide the user with a menu-driven interface that first enable the user to self-identify and then receive authorization by providing a pin number. Then, the user will be provided with the ability to check their balance, deposit an amount, or withdraw an amount.

The program has validation requirements to adhere to. If the user does not identify a valid account, the user needs to see an error message and then be asked to provide a different account name.

Once the user has identified a valid account, the user must then provide the appropriate pin number associated with that account, the user can only pass this stage by providing a valid pin number.

Once the user has received authorization (entered the correct pin), the three options are provided for the user, balance check, perform a deposit, and perform a withdrawal. 

The withdrawal request requires validation as well; it can only be executed if there is adequate balance in the account.

This application will need to permit the user select other transactions: deposit, withdrawal, or balance check until he or she has concluded all transactions they like to have.  The application can then terminate.  

 

### Programming Challenge

Have the program replace the old accounts.txt file with an updated one so that changes in an account's balance based on deposit or withdrawals the user transacted are reflected in the data file.

 

### Template
You’ll begin this assignment with the project template provided here. Keep in mind this needs to be imported into netBeans.  You’ll find in this project template both Account and allAcounts classes as well as the project class that does some basic testing of the other two classes.  Here is the  

bankAccountProject  template that you will need to complete.  Note that the data file (accounts.txt) is already zipped with this download.

## Assignment 4
Dictionary—working with real data

 

### Purpose

What is new in this assignment is the use of more optimal data structures for maintaining information. This is not to say arrays are not useful, as they very much are, but you will use a HashMap that provides a much more efficient data structure for this project. HashMaps are excellent for the type of application where data is stored based on a key field.  ArrayList is another class in the Java API that instances of this class act as extendable arrays and as importantly we don’t need to remember positions of cells as we could simply “add”/"remove" entries of an ArrayList object. I have also created a couple of different challenge options for you. It is important to point out that you will see most of what is expected in the challenge problems in later courses in the curriculum, but obviously you will be more prepared for them.

### Problem

You are going to write an application that will first read in words and definitions and store them in a HashMap. This application will then provide a user with options to manipulate entries into our dictionary and to lookup words. Lookups are accomplished by giving the user two options: lookup a specific word or browse the dictionary based on a partial word. With the browse option, the application would retrieve and display words and definitions where the words begin with the substring provided by the end-user. The user interface must not be case sensitive.  

### Part 1 (Due Friday, November 18, 2016)

Develop two classes and test them:

dictionaryEntry -  maintain a word and a definition; both are strings. Need a constructor that accepts parameters that provides values for these two fields (word/definition). Provides a method to get the word. Provide a method to get the definition. provide a method to replace the definition. You will also find it useful to have a toString () method for this class as well.

Dictionary - maintain a HashMap variable that holds all dictionaryEntries (word/definitions).  

Develop a load () method that given a Scanner object reads all word/definitions from a file and stores them in the HashMap object.  

Develop a Add () method that has a word and definition as a pair of parameters. If the word is not already in the HashMap object, it adds the word/definition to the HashMap object. This method returns true if successful and false of not.

Develop a Delete () method that has a word as a parameter. If the word is in the HashMap object, this method removes the dictionaryEntry. This method return true when successful and false otherwise.

Develop a method find () that has a word as a parameter. This method locates the dictionaryEntry for this word if one exists and returns it, otherwise, the method returns null.  

The method browse () has a String parameter and looks at all entries in the HashMap and return an ArrayList object with all word/definitions where the words start with the substring provided by the parameter. For example, if the parameter contains "a"; the method will return all word/definitions where the word starts with the letter "a".

 

### Part 2 (Due Friday, December 9, 2016) 

develop a user interface that interacts with user and follows the following framework:

 

### Top-level Algorithm

Create a Scanner object to read from dict.txt and perform the load () method from Dictionary.

forever loop

        Provide a menu (1. Find Word, 2. Change Definition, 3. Add Word/Definition, 4. Delete Word, 5. Browse, 6. Quit)

        switch choice

            case 1: prompt for a word.  Search for the word.  Output the definition of that word or a NOT FOUND message.

            case 2: prompt for a word. If word doesn't exist, display WORD NOT FOUND. If word exists, display old definition. Prompt and get the new definition and replace the old definition in the dictionary.

            case 3: prompt for a word. If word exist, display WORD ALREADY EXISTS. If word doesn't exists, prompt for definition and then store in dictionary.

            case 4: prompt for a word. If word doesn't exist, display WORD NOT FOUND. If word exist, display word/definition.  Delete the entry from the dictionary and inform the user.

            case 5: prompt for a partial word; find and display all word/definitions where the words start with the specified substring. 

            Case 6 break;

### Input File


There are close to 40,000 words in the data file you will be downloading. Each word and its definitions are on a separate line. Word and definition(s) are separated with a tab (\t). Here is the data file

 dict.txt
### Data Structure

You must implement a Dictionary class that will use a HashMap object to store words/definitions. You will also be required to use an ArrayList for holding partially-matched words and their definitions for browsing purposes.

 

### EXTRA CREDIT 1 (10 points)               
Write the dictionary content back to the data file when the program ends (i.e. when the user requests to quit) to ensure we don't lose the changes made to the dictionary. So, you are opening the dict.txt file for output and overwriting the content of it with the updated dictionary data.



 

### EXTRA CREDIT 2 (10 points)     
develop a GUI for the user instead of our text-based menu system shown above.
