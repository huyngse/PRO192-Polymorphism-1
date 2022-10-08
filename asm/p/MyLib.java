
package asm.p;

import java.util.Scanner;


public class MyLib {
    private static final Scanner scanner = new Scanner(System.in);
    public static int inputPossitiveInt(String mess) {
        int n = 0;
        boolean isValid = false;
        do {            
            try {
                System.out.print(mess);
                n = Integer.parseInt(scanner.nextLine());
                if (n < 0) {
                    throw new Exception();
                }
                isValid =  true;
            } catch (Exception e) {
                System.out.println("Value is not valid");
            }
        } while (!isValid);
        return n;
    }
    
    public static String inputSting(String mess) {
        String s = null;
        do {            
            System.out.print(mess);
            s = scanner.nextLine();
            if (s.isEmpty()) {
                System.out.println("Value cannot be empty");
            }
        } while (s.isEmpty());
        return s;
    }
    
    public static byte inputByte(){
        byte n = 0;
        boolean isValid = false;
        do {            
            try {
                n = Byte.parseByte(scanner.nextLine());
                isValid = true;
            } catch (Exception e) {
                System.out.println("Integer is required");
            }
        } while (!isValid);
        return n;
    }
}
