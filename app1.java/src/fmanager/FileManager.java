package fmanager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    List<String> lists;

    public void failReader(String file) throws IOException, FileNotFoundException1 {
        File file1 = new File(file);
        this.lists = new ArrayList<>();
        if (file1.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    this.lists.add(line);
                    System.out.println(line);
                }
                System.out.println();
            }
        } else {
            throw new FileNotFoundException1("File not found");
        }
    }

    public void failWriter(String file, List<String> list1, boolean t) throws IOException, CreateException {
        File file1 = new File(file);
        if (!file1.exists()) {
            if (!file1.createNewFile()) {
                throw new CreateException("File not created");
            }
        }
        try (FileWriter fw = new FileWriter(file1, t)) {
            for (String str : list1) {
                fw.write(str);
                fw.write(" ");
            }
            fw.flush();
        }
    }

    public void failCopy(String file1, String file2) throws IOException, CreateException, FileNotFoundException1 {
        failReader(file1);
        failWriter(file2, this.lists, false);
    }
}
