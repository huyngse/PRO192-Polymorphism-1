package asm.p;

public class Administration extends Staff{
    private int allowance;

    public Administration() {
    }

    public Administration(int allowance, String name, String id, int salary, byte seniority) {
        super(name, id, salary, seniority);
        this.allowance = allowance;
    }

    public void setAllowance() {
        this.allowance = MyLib.inputPossitiveInt("Allowance: ");
    }

    public int getAllowance() {
        return allowance;
    }

    @Override
    public void calSalary() {
        super.setFood(getBaseSalary() * getCoefficient() + allowance);
        System.out.println("Salary: " + super.getFood());
    }

    @Override
    public void input() {
        super.input(); 
        setAllowance();
    }
    
    @Override
    public void output() {
        super.output(); 
        System.out.println("Allowance: " + allowance);
    }
    
    @Override
    public String getJob() {
        return "Administration";
    }
    
}
