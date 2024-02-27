package Theory.A05_PostroyeniyeInterfeysov.F002_Nasledovanie;

/**
 * Создаем класс Менеджера, который наследуется от класса Работник.
 * Добавляем в класс премию для менеджера prize.
 */
public class Boss extends Rabotnik{
    private int prize;
    public Boss(String name, int age, int experience, int salary, int prize) {
        super(name, age, experience, salary);
        prize = 0;
    }

    /**
     * Переопределяем метод getSalary() для класса Менеджера, чтобы менеджер мог получить премию.
     * @return
     */
    public int getSalary() {
        int baseSalary = super.getSalary(); // Используем приставку super чтобы взять метод getSalary() из суперкласса,
                                            // а не вызывать метод getSalary() из текущего класса наследника;
        return baseSalary + prize;
    }

    /**
     * Метод, который меняет премию менеджера, изначально установленную как 0.
     * @param b
     */
    public void setPrize(int b) {
        prize = b;
    }
}
