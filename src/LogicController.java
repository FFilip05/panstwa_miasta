import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LogicController {

    private final HashMap<String, String> ANSWERS = new HashMap<>();
    private int punkty = 0;
    private int i = 0;

    public String stolica;

    public String[] a1;

    public String getAnswerValue(String key) {
        return this.ANSWERS.get(key);
    }

    public Boolean getAnswersKey(String key) {
        return ANSWERS.containsKey(key);
    }

    public LogicController() {
    }

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }


    public List<String> getAnswers() {
        List<String> lista = new ArrayList<>();
        try {
            FileService fileService = new FileService(getFileName());
            for (String x : fileService.getListOfAnswers()
            ) {
                lista.add(x);
                a1 = x.split(";");
                ANSWERS.put(a1[0], a1[1]);
            }
            fileService.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void areAnswersMatching(String ans) {

        if (getI() % 2 == 1) {

            if (ans.equals(getAnswerValue(stolica))) {
                setPunkty(getPunkty() + 1);
                System.out.println("Twoja liczba punktyow to : " + getPunkty());

            } else {
                System.out.println("Zła odpowiedz");
                setPunkty(0);
            }
        } else {
            stolica = ans;
        }
        setI(getI() + 1);
        if (getI() == 2) {
            setI(0);
        }
    }

    public String getFileName() {
        return "a.txt";
    }

}