package Theory.JavaSwing.E001_Sobytiya_Events;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * В примере создается небольшое окно, к которому добавляется слушатель событий от мыши MouseListener.
 * Однако реализовывать интерфейс слушателя мы не стали, а создали новый внутренний класс MouseL,
 * унаследованный от класса адаптера MouseAdapter. Вместо того чтобы определять все методы слушателя,
 * мы переопределили только один. Здесь нас интересовало только, когда пользователь щелкает кнопками мыши
 * в окне, так что нам пригодился метод mouseClicked().
 */
public class Adaptery_Adapters extends JFrame {
    public Adaptery_Adapters() {
        super("Adapters");
        // при закрытии окна - выход
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // регистрируем слушателя
        addMouseListener(new MouseL());
        // выводим окно на экран
        setSize(600, 600);
        setVisible(true);
    }
    // наследуем от адаптера
    static class MouseL extends MouseAdapter {
        // следим за щелчками мыши в окне
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() { new Adaptery_Adapters(); } });
    }
}
