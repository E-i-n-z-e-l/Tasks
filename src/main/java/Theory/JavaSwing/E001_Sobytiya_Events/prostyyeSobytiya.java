package Theory.JavaSwing.E001_Sobytiya_Events;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Наблюдение за основными низкоуровневыми событиями. <p></p>
 * В этом примере мы создаем окно, добавляем в центр текстовое поле, а в нижнюю часть окна помещаем
 * простую кнопку JButton, которая и будет служить источником событий. Далее к кнопке присоединяются
 * слушатели разнообразных событий. Интерфейсы слушателей реализованы в классе OurListener.
 *  <p></p>
 * В примере этот класс реализует обязанности сразу пяти слушателей, так что методов в нем довольно много.
 * Каждый из этих методов просто выводит информацию о происшедшем событии в текстовое окно.
 */
public class prostyyeSobytiya extends JFrame {
    // Сюда мы будем выводить информацию. Объявляем приватное поле.
    private JTextArea out;

    public prostyyeSobytiya() {
        super("Простые события"); // Устанавливаем заголовок окна;
        // при закрытии окна - выход
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Призакрытии окна закрываем приложение;
        // добавим текстовое поле
        add(new JScrollPane(out = new JTextArea()));
        // и кнопку
        JButton button = new JButton("Источник событий");
        add(button, "South"); // Помещаем кнопку вниз окна;
        // Регистрируем нащего слушателя;
        OurListener ol = new OurListener();
        button.addKeyListener(ol); // Для обработки событий клавиатуры;
        button.addMouseListener(ol); // Для обработки событий мыши;
        button.addMouseMotionListener(ol); // Для обработки движения мыши;
        button.addMouseWheelListener(ol); // Для обработки прокрутки мыши;
        button.addFocusListener(ol); // Для обработки событий фокуса;
        // Выводим окно на экран.
        setSize(600, 400);
        setVisible(true);
    }

    /**
     * Создается экземпляр внутреннего класса OurListener, который реализует несколько интерфейсов
     * слушателей событий (MouseListener, KeyListener, MouseMotionListener, MouseWheelListener, FocusListener).
     */
    class OurListener implements MouseListener, KeyListener,
            MouseMotionListener, MouseWheelListener,
            FocusListener {
        public void mouseClicked(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        public void mousePressed(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        public void mouseReleased(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        public void mouseEntered(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        public void mouseExited(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        public void keyTyped(KeyEvent e) {
            out.append(e.toString() + "\n");
        }

        public void keyPressed(KeyEvent e) {
            out.append(e.toString() + "\n");
        }

        public void keyReleased(KeyEvent e) {
            out.append(e.toString() + "\n");
        }

        public void mouseDragged(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        public void mouseMoved(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        public void focusGained(FocusEvent e) {
            out.append(e.toString() + "\n");
        }

        public void focusLost(FocusEvent e) {
            out.append(e.toString() + "\n");
        }

        public void mouseWheelMoved(MouseWheelEvent e) {
            out.append(e.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        /*В методе main() используется SwingUtilities.invokeLater() для создания
        и отображения главного окна в потоке событий Swing. */
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        new prostyyeSobytiya();
                    }
                });
    }
}
