public class Driver implements IPayment {

    private int NoOfTrip;
    private int rate;
    private String name = "Driver";

    @Override
    public int getSalary() {
        return 0;
    }

    public Driver(int noOfTrip, int rate) {
        NoOfTrip = noOfTrip;
        this.rate = rate;
    }

    @Override
    public String getName() {
        return this.name;
    }



    @Override
    public int getPayment() {
        return this.NoOfTrip * this.rate; // Calculate formular
    }
}
