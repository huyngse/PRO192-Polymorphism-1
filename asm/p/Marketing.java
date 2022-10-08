package asm.p;

public class Marketing extends Staff {

    private int sale;
    private float commission;

    public Marketing() {
    }

    public Marketing(int sale, int comission, String name, String id, int salary, byte seniority) {
        super(name, id, salary, seniority);
        this.sale = sale;
        this.commission = comission;
    }

    public float getCommission() {
        if (sale < 5000000) {
            commission = 0;
        } else if (sale < 10000000) {
            commission = 0.05f;
        } else if (sale < 20000000) {
            commission = 0.1f ;
        } else {
            commission =  0.2f ;
        }
        return commission;
    }

    public int getSale() {
        return sale;
    }

    public void setSale() {
        boolean isValid = false;
        this.sale = MyLib.inputPossitiveInt("Sale: ");
    }

    @Override
    public void calSalary() {
        super.setFood((int) (getBaseSalary() * getCoefficient() + commission * sale));
        System.out.println("Salary: " + super.getFood());
    }

    @Override
    public void input() {
        super.input(); 
        setSale();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Sale: " + sale + "%");
        System.out.println("commission: " + getCommission());
    }

    @Override
    public String getJob() {
        return "Marketing";
    }
    
}
