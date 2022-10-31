public class Cleanner implements IPayment {

    private int DayOfWork;
    private int rate;
    private String name = "Cleanner";

    @Override
    public int getSalary() {
        return 0;
    }

    public Cleanner(int dayOfWork, int rate) {
        DayOfWork = dayOfWork;
        this.rate = rate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPayment() {
        return this.DayOfWork * this.rate; // Calculate formular
    }
}
