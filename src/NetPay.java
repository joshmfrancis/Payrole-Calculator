// Author:          Joshua Francis
// Class:           CSC 135
// Project Name:    NetPay.java
//This program prints a payroll statement for an employee using the information inputted.

import java.util.Scanner;                                                       // Imports scanner 

public class NetPay {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);                                  // Creates Scanner
        
        // Variables for the user to input 
        
        String employee;                                                        
        double hoursWorked;
        double payRate;
        double federalTax;
        double stateTax;
        
        // Variables for the program to calculate
        double grossPay;
        double totalFederalTax;
        double totalStateTax;
        double totalDeduction;
        double netPay;
        
        System.out.println("Enter employee's full name: ");                     // Asks for name and next program line scans
        employee = scan.nextLine();
        
        System.out.println("Enter the number of hours worked in a week: ");     // Asks for number of hours and next program line scans
        hoursWorked = scan.nextDouble();
        
        System.out.println("Enter hourly pay rate in dollars and cents: ");     // Asks for hourly pay rate and next program line scans
        payRate = scan.nextDouble();
        
        System.out.println("Enter the federal tax withholding rate (ex. 10% would be entered as 0.10): "); // Asks for federal tax rate and next program line scans
        federalTax = scan.nextDouble();
        
        System.out.println("Enter the state tax withholding rate (ex. 5% would be entered as 0.05): "); // Asks for state tax rate and next program line scans
        stateTax = scan.nextDouble();
        
        grossPay = payRate * hoursWorked;                                       // Calculates gross pay
        totalFederalTax = grossPay * federalTax;                                // Calculates federal tax withheld
        totalStateTax = grossPay * stateTax;                                    // Calculates state tax withheld
        totalDeduction = totalFederalTax + totalStateTax;                       // Calculates the total deducted from state and federal
        netPay = grossPay - totalDeduction;                                     // Calculates net pay
        
        
        // Print statements to display the information in the math above
        System.out.println("************************************");             
        System.out.println("Employee: " + employee);
        System.out.println("Gross pay: " + grossPay);
        System.out.println("Federal withholding: " + totalFederalTax);
        System.out.println("State withholding: " + totalStateTax);
        System.out.println("Total deduction: " + totalDeduction);
        System.out.println("Net pay: " + netPay);
        System.out.println("************************************");
    }
    
}
