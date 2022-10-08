
package asm.p;


public class Staff {
    private String name;
    private String id;
    private int baseSalary;
    private int coefficient = 1;
    private int food;
    private byte  seniority;

    public Staff() {
    }

    public Staff(String name, String id, int salary, byte seniority) {
        this.name = name;
        this.id = id;
        this.baseSalary = salary;
        this.seniority = seniority;
    }

    public int getCoefficient() {
        return 1 + (seniority / 5);
    }

    public void setFood(int food) {
        this.food = food;
    }
    

    public int getFood() {
        return food;
    }

    public void setSeniority() {
        this.seniority = (byte) MyLib.inputPossitiveInt("Seniority: ");
    }

    public byte getSeniority() {
        return seniority;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = MyLib.inputSting("Name: ");
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id =  MyLib.inputSting("ID: ");
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary() {
        this.baseSalary = MyLib.inputPossitiveInt("Base salary: ");
    }
    
    public void calSalary() {
        food = baseSalary * coefficient;
        System.out.println("Food: " + food);
    }
    public void input() {
        setName();
        setId();
        setBaseSalary();
        setSeniority();
    }
    public void output() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Base salary: " + baseSalary);
        System.out.println("Coefficient: " + coefficient);
        System.out.println("Seniority: " + seniority);
        calSalary();
    }
    
    public String getJob() {
        return "Staff";
    }
}
