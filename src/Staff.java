public abstract class Staff implements  IPayment
{
    protected int salary;
    protected String name;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Staff(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int GetTax(int Tax) {
        return this.salary * (Tax / 100);

    };

    public abstract int getPayment(

    );
}
