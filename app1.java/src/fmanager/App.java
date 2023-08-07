package fmanager;

import java.io.IOException;

import java.util.Arrays;

import java.util.List;

public class App {
  public static void main(String[] args) {
    FileManager fm = new FileManager();
    List<String> list1 = Arrays.asList("Hello", "world", "!");
    try {
      fm.failReader("экзамен.txt");
      fm.failWriter("example.txt", list1, false);
      fm.failReader("example.txt");
      fm.failWriter("экзамен.txt", list1, true);
      fm.failReader("экзамен.txt");
      fm.failCopy("example.txt", "example2.txt");
      fm.failReader("example2.txt");
      fm.failWriter("example2.txt", list1, true);
      fm.failReader("example2.txt");
      fm.failWriter("example2.txt", list1, false);
      fm.failReader("example2.txt");
    } 
    catch (IOException | CreateException | FileNotFoundException1 e) {
        System.out.println(e.getMessage());
    }
  }
}
