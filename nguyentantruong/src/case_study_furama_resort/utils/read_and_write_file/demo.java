package case_study_furama_resort.utils.read_and_write_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class demo {
    public static void main(String[] args) {
        filess("src/case_study_furama_resort/utils/read_and_write_file/file.csv","nhớ e");
    }
    public static void filess(String filesd, String data){
        File file=new File(filesd);

        try {
           FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("nhpaj chưa đúng file");
        }

    }
}
