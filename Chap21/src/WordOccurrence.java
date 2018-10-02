import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordOccurrence implements Comparable<WordOccurrence>{
	private String word = "";
	private int count = 0;
	
	public WordOccurrence(String word) {
		this.word = word;
		count ++;
	}
	
	public String getWord() {
		return word;
	}
	 
	public void setWord(String word) {
		this.word = word;
	}
	
	public int getCount () {
		return count;
	}
	
	public void setCount (int count) {
		this.count = count;
	}

	@Override
	public int compareTo(WordOccurrence o) {
		if ( this.getCount() > o.getCount())
			return 1;
		else if (this.getCount() < o.getCount())
			return -1;
		else 
			return 0;
	}
	
	
	public static void main(String args[]) throws FileNotFoundException {
		String[] words = {"apple","apple","banana","banana","pear","pear","coffee","coffee","coffee"};
		ArrayList<WordOccurrence> list = new ArrayList<>();
		boolean contains = false;
		for ( int i = 0 ; i < words.length ; i ++) {
			contains =false;
			for ( int j = 0 ; j < list.size() ; j ++ ) {
				if(list.get(j).getWord() == words[i]) {
					int value = list.get(j).getCount();
					value ++ ;
					list.get(j).setCount(value);
					contains = true;
					break;
				}
			}
			
			if (!contains) {
				list.add(new WordOccurrence(words[i]));
			}
		}
		
		for ( int i = 0 ; i < list.size() ;i ++) {
			System.out.println(list.get(i).getWord()+":"+list.get(i).getCount());
		}
	}

}
