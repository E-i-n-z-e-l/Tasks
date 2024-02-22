package Theory.A05_PostroyeniyeInterfeysov.F001_ProstoyPrimer;

import java.time.LocalDate;

public interface InterfaceEmploy {
    public String getName();
    public double getSalary();
    public void raiseSalary(double byPercent);
    public void seeSalary(EmployPay[] staff);
}
