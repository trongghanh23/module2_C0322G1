package case_study_furama_resort.utils.read_and_write_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class WriteFile {
    //    public static void main(String[] args) {
//        writeFile("src/_16_text_file/practice/file.csv","hello co3");
//    }
    public static void writeFile(String pathFile, String data) {
        File file = new File(pathFile);


        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("không tim tháy file");
        }

    }
}
