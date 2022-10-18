import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.lang.System.setOut;
import static java.util.Collections.list;

public class Main {
     public static void main(String[] args)  {
         File file = new File("Sber.txt");
         List<String> str1 = new ArrayList<String>();
         HashSet<String> str2 = new  HashSet<String>();
         List<String> str3 = new ArrayList<String>();
         Scanner sc = null;
         int count = 0;

         try {
             sc = new Scanner(file);
             while (sc.hasNextLine()) {
                 str1.add(sc.nextLine());
             }
             for (int i = 0; i < str1.size(); i++) {
                 str3 = List.of(str1.get(i).split(";"));
                 str2.add(str3.get(2));
             }
             List list = new ArrayList<>(str2);
             for (int i = 0; i < str2.size(); i++) {
                 for (int j = 0; j < str1.size(); j++) {
                     str3 = List.of(str1.get(j).split(";"));
                     if(list.get(i).equals(str3.get(2))) {
                         count += 1;
                     }
                 }
                 City ct = new City(count, (String) list.get(i));
                 ct.Output();
                 count = 0;
             }
         }
         catch (FileNotFoundException e) {
             e.printStackTrace();
         }
         finally {
             sc.close();
         }
    }
}
