
package asm.p;


public class Main {

    public static void main(String[] args) {
        StaffManager manager = new StaffManager();
        byte choice;
        do {            
            System.out.println("");
            System.out.println("====== STAFF MANAGER ======");
            System.out.println("1) Add a new staff");
            System.out.println("2) Show staff memebers");
            System.out.println("3) Show staff with highest salary");
            System.out.println("4) Show average salary of all staff");
            System.out.println("#) Quit");
            System.out.println("============================");
            System.out.print("$ ");
            choice = MyLib.inputByte();
            
            switch (choice) {
                case 1: {
                    manager.inputStaff();
                    break;
                }
                case 2: {
                    manager.outputStaff();
                    break;
                }
                case 3: {
                    manager.highSalary();
                    break;
                }
                case 4: {
                    System.out.println("Average salary: " + manager.averageSalary());
                    break;
                }
            }
        } while (choice > 0 && choice < 5);
    }
    
}
