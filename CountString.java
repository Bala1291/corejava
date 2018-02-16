import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class CountString {
	public static void main(String[] args) {
		String textars="india is one of the famous country in the world and is powerfull country too";
		String textars1=textars.toLowerCase();
		String String2[]=textars1.split("{(''),-}");
		HashMap<String,Integer> uniques=new HashMap<String,Integer>();
		for(String word:String2)
		{
			if(word.length()<=2)
			{
				continue;
			}
			Integer existingCount=uniques.get(word);
			uniques.put(word,(existingCount==null?1:(existingCount+1)));
		}
		Set<Map.Entry<String,Integer>> uniqueSet=uniques.entrySet();
		for(Map.Entry<String,Integer>entry:uniqueSet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+""+entry.getValue());
			}
		}
		
		

	}
	
}
