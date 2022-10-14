import javax.swing.*;
import java.awt.event.*;
import java.util.List;

public class Aplikacja extends JFrame implements ActionListener {
    LogicController logicController = new LogicController();
    String[] current_answers;
    String panstwo = "";
    int i = 0;
    int punkty = 0;

    public Aplikacja() {
        List<String> panstwa_stolice;
        try {
            FileService fileService = new FileService("a.txt");
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

            menu1.add(menuItem11);
            menu1.add(menuItem12);
            menu1.add(menuItem13);
            menu1.add(menuItem14);
            menu1.add(menuItem15);
            menu1.add(menuItem16);

//        panstwa_stolice = fileService.getListOfAnswers();
            panstwa_stolice = logicController.getAnswers();
            String[] a;
            for (int i = 0; i < 10; i++) {
                a = panstwa_stolice.get(i).split(";");
                menu2.add(new JMenuItem(a[0]));
                menu2.getItem(i).addActionListener(this);
                menu3.add(new JMenuItem(a[1]));
                menu3.getItem(i).addActionListener(this);
            }
            menuBar.add(menu1);
            menuBar.add(menu2);
            menuBar.add(menu3);
            setJMenuBar(menuBar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        setSize(320, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        current_answers = new String[2];
        String cmd = e.getActionCommand();
        current_answers[i] = cmd;
        System.out.println(current_answers[i]);
        System.out.println(cmd);
        System.out.println(i);
        System.out.println(current_answers[0]);
        panstwo = current_answers[0];
        System.out.println(panstwo);
        if (i % 2 == 1){

            System.out.println("STOLICA : "+current_answers[1]+ "HASHMAPA KEY TO V " + logicController.getAnswersValue(current_answers[0]) + " panstwo " + current_answers[0] + "panstwo 2 : " + panstwo);
            if (current_answers[1].equals(logicController.getAnswersValue(current_answers[0]))) {
                punkty++;
            } else {
                System.out.println("Zła odpowiedz");
            }
            i = 0;
            System.out.println("Punkty : " + punkty);
        }
        i++;
//        if ("Zamknij".equals(cmd)) {
//            dispose();
//        }
    }
//    public void sprpunk(ActionEvent e){
//        String cmd = e.getActionCommand();
//        current_answers[i] = cmd;
//        if(i%2==0) {
//            if(current_answers[0].equals(current_answers[1])){
//                punkty++;
//            } else {
//                System.out.println("Zła odpowiedz");
//            }
//            System.out.println(punkty);
//        }
//        i++;
//    }
}