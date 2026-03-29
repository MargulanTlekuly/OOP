package pr5.io.util;
                                              /* Problem 2 */
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyAnalyzer {
    public static void main(String[] args){

        Map<String, Integer> wordCounts = new HashMap<>();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt"), "UTF-8"))){
            String line;
            while((line = reader.readLine()) != null){
                String[] words = line.toLowerCase().split("[^a-zA-Zа-яА-Я0-9]+");
                for(String word:words){
                    if(!word.isEmpty()){
                        wordCounts.put(word,wordCounts.getOrDefault(word,0) + 1);
                    }
                }
            }
        }catch (IOException e){
            System.out.println("Error reading file input.txt: " + e.getMessage());
            return;
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCounts.entrySet());
        list.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        try(PrintWriter writer = new PrintWriter(new FileWriter("report.txt"))){
            for(Map.Entry<String, Integer> entry:list){
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("Analysis complete! Results saved in report.txt");
        }catch (IOException e){
            System.out.println("Error writing file report.txt: " + e.getMessage());
        }
    }
}
