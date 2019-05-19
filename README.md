# Travel-Details

Create a class Person with the following private member variables

String name
char gender
int age

Include appropriate getters and setters method 
Create a class BusTicket with the following private member variables

int ticketNo
float ticketPrice
float totalAmount
Person person
Include appropriate getters and setters method 

Write the following method in the BusTicket class
void calculateTotal()—this method should calculate the total and set it based on the discount given below:

For Children whose age is less than 16, give 50% discount
For Senior citizen whose age is greater than or equal to 60 give 25% discount
For Ladies give 10% discount
No discount for remaining category. 
Based on above condition calculate total price. 
Create TestMain class which has main method and do the following input and output process .

To get the input write a method

public static BusTicket getTicketDetails() - Get the inputs relevant to BusTicket in this method and return the BusTicket object.  Call this method in the main method, using the returned object invoke the method calculateTotal and print the output accordingly  

Sample input 1:

Enter the passenger name:
vivek
Enter the gender(M or F / m or f):
M
Enter the age:
16
Enter the ticket no:
123
Enter the ticket price:
100.0

Sample Output 1

Ticket no:123
Passenger Name:vivek
Price of a ticket : 100.0
Total Amount : 100.0

Sample input 2:
Enter the passenger name:
Priya
Enter the gender(M or F / m or f):
F
Enter the age:
61
Enter the ticket no:
140
Enter the ticket price:
500.0

Sample Output 1

Ticket no:143
Passenger Name:Priya
Price of a ticket : 500.0
Total Amount : 375.0
