import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    MyFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("Panstwa i Miasta");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(600,600);
        frame.setVisible(true);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Plik");
        JMenu menu2 = new JMenu("Panstwa");
        JMenu menu3 = new JMenu("Miasta");
        JMenuItem menuItem11 = new JMenuItem("Zamknij");
        menuItem11.addActionListener(this);
        menu1.add(menuItem11);
        JMenuItem menuItem21 = new JMenuItem("Pozycja 2 1");
        JMenuItem menuItem22 = new JMenuItem("Pozycja 2 2");
        menuItem21.addActionListener(this);
        menuItem22.addActionListener(this);
        menu2.add(menuItem21);
        menu2.add(menuItem22);
        JMenuItem menuItem31 = new JMenuItem("Pozycja 3 1");
        JMenuItem menuItem32 = new JMenuItem("Pozycja 3 2");
        JMenuItem menuItem33 = new JMenuItem("Pozycja 3 3");
        menuItem31.addActionListener(this);
        menuItem32.addActionListener(this);
        menuItem33.addActionListener(this);
        menu3.add(menuItem31);
        menu3.add(menuItem32);
        menu3.add(menuItem33);
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        setJMenuBar(menuBar);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        System.out.println(cmd);
        if ("Zamknij".equals(cmd)){
            dispose();
        }
    }
}
