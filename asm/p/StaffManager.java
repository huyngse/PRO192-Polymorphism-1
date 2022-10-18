
package asm.p;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffManager {
    private ArrayList<Staff> list = new ArrayList<> ();

    public StaffManager() {
        
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
                    list.add(staff);
                    System.out.println("A new staff added!");
                    System.out.println("=====================");
                    break;
                }
                case 2: {
                    System.out.println("=====================");
                    System.out.println("New administrative staff");
                    Administration staff = new Administration();
                    staff.input();
                    list.add(staff);
                    System.out.println("A new staff added!");
                    System.out.println("=====================");
                    break;
                }
            }
            
        } while (choice > 0 && choice < 3);
    }
    
    public void outputStaff() {
        if (list.size() <= 0) {
            System.out.println("There is no staff.");
            return;
        }
        System.out.println("____________________________________");
        System.out.println("STAFF MEMBERS LIST");
        for (int i = 0; i < list.size(); i++) {
            System.out.println();
            list.get(i).output();
        }
    }
    
    public void highSalary() {
         if (list.size() <= 0) {
            System.out.println("There is no staff.");
            return;
        }
        Staff highStaff = list.get(0);
        int maxSalary = highStaff.getFood();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getFood() > maxSalary) {
                highStaff = list.get(i);
                maxSalary = highStaff.getFood();
            }
        }
        System.out.println("____________________________________");
        System.out.println("STAFF WITH HIGHEST SALARY");
        highStaff.output();
    }
    
    public int averageSalary() {
        float average = 0;
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i).getFood();
        }
        return (int) (average / list.size());
    }
}
