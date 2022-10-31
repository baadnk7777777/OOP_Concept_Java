public class Monthly_Payment implements IPayment {
    int Rental;
    int Electricity;
    int Internet_Access;

    public Monthly_Payment(int Rental_rate, int unitOfuse, int rate, int internet_Access) {
        Rental = Rental_rate;
        Electricity = unitOfuse * rate;
        Internet_Access = internet_Access;
    }

    @Override
    public int getSalary() {
        return 0;
    }

    public int getRental() {
        return Rental;
    }

    public void setRental(int Rental_rate) {
        Rental = Rental_rate;
    }

    public int getElectricity() {
        return Electricity;
    }

    public void setElectricity(int unitOfuse, int rate) {
        Electricity = unitOfuse * rate;
    }

    public int getInternet_Access() {
        return Internet_Access;
    }

    public void setInternet_Access(int internet_Access) {
        Internet_Access = internet_Access;
    }

    @Override
    public String getName() {
        return "Monthly_Payment";
    }

    @Override
    public int getPayment() {
        return (this.Rental) + (this.Electricity) + (this.Internet_Access);
    }
}
