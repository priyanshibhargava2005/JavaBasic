import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
	public static void main(String[] args) {
		List<String> listOfWords=new ArrayList <String>();
		
		listOfWords.add("Hello");
		listOfWords.add("World");
		listOfWords.add("I");
		listOfWords.add("Am");
		listOfWords.add("Learning");
		listOfWords.add("Java");
		
		listOfWords.add(2,",");
		
		System.out.println(listOfWords.get(2));
		listOfWords.remove(2);
		
		for(String word:listOfWords) {
			System.out.println(word);
		}
	}

}
