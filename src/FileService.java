import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author FF
 */
public class FileService {
    Scanner scanner;
    public FileService(String fileName) throws IOException {
        this.scanner = new Scanner(new File(fileName));
    }

    public void close() {
        scanner.close();
    }

    public List<String> getListOfAnswers(){
        List<String> lista = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lista.add(scanner.nextLine());
        }
        return lista;
    }
//    public void setFileName(String fileName){
//        try {
//            this.scanner = new Scanner(new File(fileName));
//        }
//        catch(FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

}
