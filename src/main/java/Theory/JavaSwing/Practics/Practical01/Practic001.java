package Theory.JavaSwing.Practics.Practical01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practic001 extends JFrame {
    JButton btnStart = new JButton("Сервер запущен");
    JButton btnNotPress = new JButton("Сервер остановлен");
    JTextArea logTextArea = new JTextArea(); // Создаем поле лога в котором выводится текст;
    JPanel mainPanel = new JPanel(new CardLayout()); // Создаем панель, на которой будут размещаться компоненты;
    private boolean isServerWorking;
    public Practic001() {
        super("Practic001"); // Название окошка;

        setDefaultCloseOperation(EXIT_ON_CLOSE); // Закрывая окошко, закрываешь программу;

        setSize(800, 600); // Размеры окошка;
        setLocation(600, 200); // Расположение окна на экране;

        mainPanel.setLayout(new GridLayout(1, 2)); // Задаем GridLayout для основной панели;

        isServerWorking = false;
        logTextArea.setEditable(false); // Запрещаем писать в поле лога;

        // Создаем слушателя событий для кнопки btnStart:
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isServerWorking) {
                    logTextArea.append("Сервер уже запущен\n");
                } else {
                    isServerWorking = true;
                    logTextArea.append("Сервер запущен\n");
                }

            }
        });

        // Создаем слушателя событий для кнопки btnNotPress:
        btnNotPress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isServerWorking) {
                    isServerWorking = false;
                    logTextArea.append("Сервер остановлен\n");
                } else {
                    logTextArea.append("Сервер не был запущен\n");
                }
            }
        });

        // Добавляем компоненты на основную панель:
        mainPanel.add(btnStart, "buttons");
        mainPanel.add(btnNotPress, "buttons");

        JPanel logPanel = new JPanel(new BorderLayout()); // Создаем панель для поля лога;
        logPanel.add(new JScrollPane(logTextArea), BorderLayout.CENTER); // Добавляем поле лога с прокруткой;

        getContentPane().add(mainPanel, BorderLayout.SOUTH); // Добавляем основную панель в верхнюю часть окна;
        getContentPane().add(logPanel, BorderLayout.CENTER); // Добавляем панель с полем лога в центр окна;

        setVisible(true); // Делаем окошко видимым;
    }
}
