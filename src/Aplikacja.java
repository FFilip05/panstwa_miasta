import javax.swing.*;
import java.awt.event.*;
import java.util.Collections;
import java.util.List;

public class Aplikacja extends JFrame implements ActionListener {

    private final JMenu MENU1 = new JMenu("Opcje");
    private final JMenu MENU2 = new JMenu("Panstwa");
    private final JMenu MENU3 = new JMenu("Stolice");

    public JMenu getMenu1() {
        return MENU1;
    }

    public JMenu getMenu2() {
        return MENU2;
    }

    public JMenu getMenu3() {
        return MENU3;
    }

    LogicController logicController = new LogicController();

    public Aplikacja() {

        List<String> panstwa_stolice;
        setTitle("Panstwa i Miasta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuItem menuItem11 = new JMenuItem("punkty");
        getMenu1().add(menuItem11);
        JMenuItem menuItem12 = new JMenuItem("wew");
        getMenu1().add(menuItem12);
        JMenuItem menuItem13 = new JMenuItem("zew");
        getMenu1().add(menuItem13);
        JMenuItem menuItem14 = new JMenuItem("con");
        getMenu1().add(menuItem14);
        JMenuItem menuItem15 = new JMenuItem("off");
        getMenu1().add(menuItem15);
        JMenuItem menuItem16 = new JMenuItem("wyjdz");
        getMenu1().add(menuItem16);

        for (int i = 0; i < getMenu1().getItemCount(); i++) {
            getMenu1().getItem(i).addActionListener(this);

        }
        try {
            panstwa_stolice = logicController.getAnswers();
            Collections.shuffle(panstwa_stolice);
            String[] a;
            for (int i = 0; i < 10; i++) {
                a = panstwa_stolice.get(i).split(";");
                getMenu2().add(new JMenuItem(a[0]));
                getMenu2().getItem(i).addActionListener(this);
                getMenu3().add(new JMenuItem(a[1]));
                getMenu3().getItem(i).addActionListener(this);
            }
//            Collections.shuffle(panstwa_stolice);s
        } catch (Exception e) {
            e.printStackTrace();
        }
        getMenu3().setEnabled(false);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(MENU1);
        menuBar.add(MENU2);
        menuBar.add(MENU3);
        setJMenuBar(menuBar);
        setSize(320, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        logicController.areAnswersMatching(cmd);
        hiddeOppositeMenu(cmd);
        if ("wyjdz".equals(cmd)) {
            dispose();
        }
    }

    public void hiddeOppositeMenu(String cmd) {
        if (logicController.getAnswersKey(cmd)) {
            getMenu2().setEnabled(false);
            getMenu3().setEnabled(true);
        } else {
            getMenu3().setEnabled(false);
            getMenu2().setEnabled(true);
        }
    }

}