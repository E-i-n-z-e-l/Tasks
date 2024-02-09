package Theory.A05_PostroyeniyeInterfeysov.F001_ProstoyPrimer;

public class EmployPay implements InterfaceEmploy {
    private final String name;
    private double salary;
    public EmployPay(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        salary += raise;
    }
    @Override
    public void seeSalary(EmployPay[] staff) {
        for (EmployPay e : staff) {
            System.out.println("Name: " + e.getName() + " Salary: " + e.getSalary());
        }
    }
}
