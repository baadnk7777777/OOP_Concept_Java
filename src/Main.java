import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<IPayment> staffs = new ArrayList<IPayment>();
        Developer dev1 = new Developer("John Doe",35000, 20, 500);
        staffs.add(dev1);
        Developer dev2 = new Developer("Marry Ann",35000, 10, 300);
        staffs.add(dev2);
        CEO ceo1 = new CEO("Elon Musk", 150000, 4, 20000);
        staffs.add(ceo1);
        Marketing marketing1 = new Marketing("Sara Wong",30000,2,500);
        staffs.add(marketing1);

        // Add a driver.

        Driver driver1 = new Driver(10, 700);
        staffs.add(driver1);
        //System.out.println("Cleanner Payment: " +  driver1.getPayment());

        // Add a Cleaner.

        Cleanner cleanner1 = new Cleanner(7, 300);
        staffs.add(cleanner1);
        //System.out.println("Driver Payment: " +  cleanner1.getPayment());

        //Monthly Payment

        Monthly_Payment month1 = new Monthly_Payment(1000, 100, 5, 600 );
        staffs.add(month1);



        int totalPayment = 0;
        int tax = 0;
        int totalSalary =0;
        for (IPayment staff : staffs) {
            System.out.println(staff.getName() + " = " + staff.getPayment());
            totalPayment += staff.getPayment();
            totalSalary += staff.getSalary();
        }

        System.out.println("Total Payment: " + totalPayment);
        System.out.println("=========================");
        System.out.println("Total Salary only Staff: " + totalSalary);
        System.out.println("Total Tax 3%: " + totalSalary * 3/100);
    }
}