import javax.swing.*;
import java.awt.event.*;
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

        JMenuItem menuItem21 = new JMenuItem("Pozycja 1");
        JMenuItem menuItem22 = new JMenuItem("Pozycja 2");
        JMenuItem menuItem23 = new JMenuItem("Panstwo 3" );
        JMenuItem menuItem24 = new JMenuItem("Panstwo 4" );
        JMenuItem menuItem25 = new JMenuItem("Panstwo 5" );
        JMenuItem menuItem26 = new JMenuItem("Panstwo 6" );
        JMenuItem menuItem27 = new JMenuItem("Panstwo 7" );
        JMenuItem menuItem28 = new JMenuItem("Panstwo 8" );
        JMenuItem menuItem29 = new JMenuItem("Panstwo 9" );
        JMenuItem menuItem210 = new JMenuItem("Panstwo 10" );

        menuItem21.addActionListener(this);
        menuItem22.addActionListener(this);

        menu2.add(menuItem21);
        menu2.add(menuItem22);
        menu2.add(menuItem23);
        menu2.add(menuItem24);
        menu2.add(menuItem25);
        menu2.add(menuItem26);
        menu2.add(menuItem27);
        menu2.add(menuItem28);
        menu2.add(menuItem29);
        menu2.add(menuItem210);

        JMenuItem menuItem31 = new JMenuItem("Stolica 1");
        JMenuItem menuItem32 = new JMenuItem("Stolica 2");
        JMenuItem menuItem33 = new JMenuItem("Stolica 3");
        JMenuItem menuItem34 = new JMenuItem("Stolica 4");
        JMenuItem menuItem35 = new JMenuItem("Stolica 5");
        JMenuItem menuItem36 = new JMenuItem("Stolica 6");
        JMenuItem menuItem37 = new JMenuItem("Stolica 7");
        JMenuItem menuItem38 = new JMenuItem("Stolica 8");
        JMenuItem menuItem39 = new JMenuItem("Stolica 9");
        JMenuItem menuItem310 = new JMenuItem("Stolica 10");


        menu3.add(menuItem31);
        menu3.add(menuItem32);
        menu3.add(menuItem33);
        menu3.add(menuItem34);
        menu3.add(menuItem35);
        menu3.add(menuItem36);
        menu3.add(menuItem37);
        menu3.add(menuItem38);
        menu3.add(menuItem39);
        menu3.add(menuItem310);

        menuItem31.addActionListener(this);
        menuItem32.addActionListener(this);
        menuItem33.addActionListener(this);

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