
package asm.p;

import java.util.Scanner;

public class StaffManager {
    private Staff list[];
    private short nStaff;

    public StaffManager() {
        list = new Staff[100];
        nStaff = 0;
    }
    
    public void inputStaff() {
        byte choice = 0;
        Scanner scanner = new Scanner(System.in);
        do {       
            System.out.println("[Adding new staff]");
            System.out.println("   1. Marketing staff");
            System.out.println("   2. Administrative staff");
            System.out.println("   3. Back");
            System.out.print("$ ");
            choice = MyLib.inputByte();
            switch(choice) {
                case 1: {
                    System.out.println("=====================");
                    System.out.println("New marketing staff");
                    Marketing staff = new Marketing();
                    staff.input();
                    list[nStaff++] = staff;
                    System.out.println("A new staff added!");
                    System.out.println("=====================");
                    break;
                }
                case 2: {
                    System.out.println("=====================");
                    System.out.println("New administrative staff");
                    Administration staff = new Administration();
                    staff.input();
                    list[nStaff++] = staff;
                    System.out.println("A new staff added!");
                    System.out.println("=====================");
                    break;
                }
            }
            
        } while (choice > 0 && choice < 3);
    }
    
    public void outputStaff() {
        if (nStaff <= 0) {
            System.out.println("There is no staff.");
            return;
        }
        System.out.println("____________________________________");
        System.out.println("STAFF MEMBERS LIST");
        Staff staff ;
        for (int i = 0; i < nStaff; i++) {
            System.out.println();
            staff = list[i];
            staff.output();
        }
    }
    
    public void highSalary() {
         if (nStaff <= 0) {
            System.out.println("There is no staff.");
            return;
        }
        Staff highStaff = list[0];
        int maxSalary = highStaff.getFood();
        for (int i = 1; i < nStaff; i++) {
            if (list[i].getFood() > maxSalary) {
                highStaff = list[i];
                maxSalary = highStaff.getFood();
            }
        }
        System.out.println("____________________________________");
        System.out.println("STAFF WITH HIGHEST SALARY");
        highStaff.output();
    }
    
    public int averageSalary() {
        float average = 0;
        for (int i = 0; i < nStaff; i++) {
            average += list[i].getFood();
        }
        return (int) (average / nStaff);
    }
}
