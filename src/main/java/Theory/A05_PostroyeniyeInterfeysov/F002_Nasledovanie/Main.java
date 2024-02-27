package Theory.A05_PostroyeniyeInterfeysov.F002_Nasledovanie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rabotnik> workers = new ArrayList<Rabotnik>();

        Rabotnik rab01 = new Rabotnik("NameOne", 20, 2, 10000);
        Rabotnik rab02 = new Rabotnik("NameTwo", 21, 3, 10000);
        Rabotnik rab03 = new Rabotnik("NameTree", 22, 4, 10000);
        Rabotnik rab04 = new Rabotnik("NameFour", 23, 5, 10000);
        Boss boss01 = new Boss("BossOne", 40, 22, 10000, 0);

        boss01.setPrize(10000);

        workers.add(rab01);
        workers.add(rab02);
        workers.add(rab03);
        workers.add(rab04);
        workers.add(boss01);

        System.out.println(workers);

    }
}
