import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LogicController {

    public HashMap<String, String> answers = new HashMap<>();

    public String getAnswersValue(String key) {
        return this.answers.get(key);
    }

    public String[] a1;

    public LogicController() {
    }

    public List<String> getAnswers() {
        List<String> lista = new ArrayList<>();
        try {
            FileService fileService = new FileService("a.txt");
            for (String x : fileService.getListOfAnswers()
            ) {
                lista.add(x);
                a1 = x.split(";");
                answers.put(a1[0], a1[1]);
            }
            fileService.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

}
