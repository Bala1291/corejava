

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AscendingOrder {

    public static void main(String[] args) throws IOException {

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("words.txt"));

 

        Map<String, Integer> hashMap = new HashMap<String, Integer>();

 

        // code to read the words in the text file into the hashMap

        hashMap.put(input.readObject(), 1);

        hashMap.put(input.readUTF(), 2);

        hashMap.put(input.readUTF(), 3);

        hashMap.put(input.readUTF(), 4);

        input.close();

        Map<String, Integer> treeMap = new TreeMap<String,  Integer>(hashMap);

        System.out.println("Display entries in ascending order of key");

        System.out.println(treeMap + "\n");

 

    }

}
