package _16_text_file.excercise.copy_file_text;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File sourceFile = new File("src/_16_text_file/excercise/copy_file_text/Source.csv");
        File targetFile = new File("src/_16_text_file/excercise/copy_file_text/Target.csv");

        if (!sourceFile.exists()) {
            System.out.println("sourceFile không tồn tại: ");

        } else if (targetFile.exists()) {
            System.out.println("targetFile đã tồn tại: ");
        } else {
            String line;

            try (FileReader fileReader = new FileReader(sourceFile);
                 BufferedReader bufferedReader = new BufferedReader(fileReader);
                 FileWriter fileWriter = new FileWriter(targetFile);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Nhập file  soruce không đúng");
            }
        }
    }
}




