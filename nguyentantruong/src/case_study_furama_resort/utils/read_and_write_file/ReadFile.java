package case_study_furama_resort.utils.read_and_write_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static List<String[]> readFile(String pathFile) {
        File file = new File(pathFile);
        List<String[]> list = new ArrayList<>();
        String line = null;
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line = bufferedReader.readLine()) != null) {

                String[] arr = line.split(",");
                list.add(arr);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;

    }
}
