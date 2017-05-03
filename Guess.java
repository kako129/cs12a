//Guess.java
//Kathleen Ko
//kako
//pa2
//Play a guessing game. You are given three chances to guess a number between 1-10. 

import java.util.Scanner;
class Guess{
public static void main ( String [] args) {
Scanner sc = new Scanner(System.in);
int x, y, z;  
//int x,y,z = 1st, 2nd, 3rd user inputed guess


System.out.println("I'm thinking of an interger in a range 1 to 10. You have three guesses.");

//int n is the computer generated number
int n;             
n = (int) (Math.random() * 10+1);
System.out.print("Enter your first guess: ");
x = sc.nextInt();
//first user input guess
if (x > n) {
System.out.println("Your guess is too high!");
}
else if (x < n) {
System.out.println("Your guess is too low!");
}
else {
System.out.println("You win!");
System.exit(0);
}


System.out.print("Enter your second guess: ");
y = sc.nextInt();
//2nd user input guess
if (y > n) {
System.out.println("Your guess is too high!");
}
else if (y < n) {
System.out.println("Your guess is too low!");
}
else {
System.out.println("You win!");
System.exit(0);
}


System.out.print("Enter your third guess: ");
//3rd user input guess
z = sc.nextInt();
if (z > n) {
System.out.println("Your guess is too high!");
}
else if (z < n) {
System.out.println("Your guess is too low!");
}
else {
System.out.println("You win!");
System.exit(0);
}
System.out.println("You lose. The number was "+n);
}
}
