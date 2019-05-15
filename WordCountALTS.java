import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class WordCountALTS {

    public static void main(String[] args)
    {

        String linesRead = " ";
        ArrayList<String> aldata = new ArrayList<String>();
        TreeSet<String> tsdata = new TreeSet<>();
        String tokens[];
        ArrayList<Integer> wordcounts = new ArrayList<>();

        try {
            FileReader fr = new FileReader("E:\\wordcount\\wc.txt");
            BufferedReader br = new BufferedReader(fr);

            while ((linesRead = br.readLine()) != null)
            {
                tokens = linesRead.split(" ");
                aldata.addAll(Arrays.asList(tokens));
                tsdata.addAll(Arrays.asList(tokens));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        for (String s : tsdata) {
            int num = Collections.frequency(aldata, s);
            wordcounts.add(num);

        }

        int count = 0;

        for (String s : tsdata) {
            System.out.println(s + " : " + wordcounts.get(count));

            count++;
        }

    }
}