package pack3;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class ReadTxt {


public static void main(String[] args) throws IOException {
	
    Scanner scanner = new Scanner(new FileReader("src/pack3/NewFolder/read.txt"));
    HashMap<String, String> map = new HashMap<String, String>();
    while (scanner.hasNextLine()) {
        String[] columns = scanner.nextLine().split(" ");
        map.put(columns[0], columns[1]);
    }
        System.out.println("map: " + map);
      
    Map < Integer, String  > realMap = new HashMap<>();
    for(final Map.Entry<String, String> entry : map.entrySet()){
         Integer key  = new Integer( entry.getKey());
         if( key %2 == 0 ) {
        	 realMap.put( key, entry.getValue());
        	 System.out.println("power of two key: " + key+ entry.getValue());
         }
    }

    
    
   // private void writeToFile() {
    String name = ("src/pack3/NewFolder/write.txt");
    File dictionaryFile = new File(name);
  
        BufferedWriter writer = new BufferedWriter(new FileWriter(dictionaryFile));
        try {
      
            
            Iterator<Integer> it = realMap.keySet().iterator();
            while (it.hasNext()) {
                Integer key = it.next();
                String entryLine = key + " -> " + realMap.get(key);
                writer.write(entryLine.toString());
                writer.write ("\n");

           
            }
        } catch (Exception e) {
            e.printStackTrace();       	              
        } finally {
            writer.close();
        }
    };


}  