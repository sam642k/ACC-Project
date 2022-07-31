package searchengine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

class keyComparatorInt implements Comparator{
	@Override
    public int compare(Object o1, Object o2) {
    	Map.Entry<?, Integer> m1 = (Map.Entry<String, Integer>) o1;
    	Map.Entry<?, Integer> m2 = (Map.Entry<String, Integer>) o2;
		if(m1.getValue() < m2.getValue()) return -1;
		if(m1.getValue() == m2.getValue()) return 0;
		else return 1;
    }
}

public class Rank {

	public static void rankFiles(Map<String, Integer> hashMap, int noOfFilesAppeared) {
		ArrayList<Map.Entry<String, Integer>> my_list = new ArrayList<>(hashMap.entrySet());
		Collections.sort(my_list, new keyComparatorInt());
		Collections.reverse(my_list);
		if (noOfFilesAppeared != 0) {
			System.out.println("The Top 5 search results");
			for(int i = 0; i < 5; i++) {
				Map.Entry<String, Integer> e = (Entry<String, Integer>) my_list.get(i);
				System.out.println("The word appeared " + e.getValue() + " times in the file " + e.getKey());
			}
		}
		
	}

}
