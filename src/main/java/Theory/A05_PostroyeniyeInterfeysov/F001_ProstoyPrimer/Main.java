package Theory.A05_PostroyeniyeInterfeysov.F001_ProstoyPrimer;


public class Main{
    public static void main(String[] args) {
        EmployPay[] staff = new EmployPay[3];

        staff[0] = new EmployPay("Carl Cracker", 75000);
        staff[1] = new EmployPay("Alex Cracker", 70000);
        staff[2] = new EmployPay("Bob Cracker", 80000);

        for(EmployPay t : staff) {
            System.out.println("Name: " + t.getName() + " Salary: " + t.getSalary());
        }

        for (EmployPay e : staff) {
            e.raiseSalary(10);
        }

        for(EmployPay t : staff) {
            System.out.println("Name: " + t.getName() + " Salary: " + t.getSalary());
        }
    }
}
