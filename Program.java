//import stuff here

//Your code here
public class Program8{
    public static void main(String[]args){
        int num1 = 13;
        int num2 = 20;
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        double avg = (num1 + num2)/2.0;
        
        int absolute1 = num1 - num2;
        int answer1;
        answer1 = Math.abs(absolute1);
        
        int absolute2 = num1 + num2;
        int answer2;
        answer2 = Math.abs(absolute2);
        
        int max = (answer1 + num1 + num2)/2;
        int min = (answer2 - answer1)/2;
        
        System.out.println("Enter number 1:" + " " + num1);
        System.out.println("Enter number 2:" + " " + num2);
        System.out.println("Original numbers are" + " " + num1 + " " + "and" + " " + num2);
        System.out.println("Sum =" + " " + sum);
        System.out.println("Difference =" + " " + diff);
        System.out.println("Product =" + " " + product);
        System.out.println("Average =" + " " + avg);
        System.out.println("Absolute value =" + " " + answer1);
        System.out.println("Maximum =" + " " + max);
        System.out.println("Minimum =" + " " + min);
        
        
    }
}
//Paste console output below:
/*
Enter number 1: 13
Enter number 2: 20
Original numbers are 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute value = 7
Maximum = 20
Minimum = 13
*/
