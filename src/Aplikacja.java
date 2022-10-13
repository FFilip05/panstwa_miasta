import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Aplikacja extends JFrame implements ActionListener {
    public Aplikacja() {
        setTitle("Panstwa i Miasta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Opcje");
        JMenu menu2 = new JMenu("Panstwa");
        JMenu menu3 = new JMenu("Stolice");
        JMenuItem menuItem11 = new JMenuItem("punkty");
        JMenuItem menuItem12 = new JMenuItem("wew");
        JMenuItem menuItem13 = new JMenuItem("zew");
        JMenuItem menuItem14 = new JMenuItem("con");
        JMenuItem menuItem15 = new JMenuItem("off");
        JMenuItem menuItem16 = new JMenuItem("wyjdz");

        menuItem11.addActionListener(this);
        menu1.add(menuItem11);
        menuItem12.addActionListener(this);
        menu1.add(menuItem12);
        menuItem13.addActionListener(this);
        menu1.add(menuItem13);
        menuItem14.addActionListener(this);
        menu1.add(menuItem14);
        menuItem15.addActionListener(this);
        menu1.add(menuItem15);
        menuItem16.addActionListener(this);
        menu1.add(menuItem16);

        for(int i = 1 ; i < 11 ; i++){
            menu1
            menu2.add(new JMenuItem("Panstwo "+i));
            menu2.getItem(i-1).addActionListener(this);
            menu3.add(new JMenuItem("Stolica "+i));
        }

        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        setJMenuBar(menuBar);
        setSize(320, 200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        System.out.println(cmd);
        if ("Zamknij".equals(cmd)){
            dispose();
        }
    }
}