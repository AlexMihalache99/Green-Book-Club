/*
 * Design a method to find the frequency of occurences of any given word
 * in a book.
 * */
public class WordFrequency {
     
	public static int getFrequency(String [] book, String word) {
		
		word =  word.trim().toLowerCase();
		int count = 0;
		for (String w: book) {
			if(w.trim().toLowerCase().equals(word)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String [] book= {"book", "book1", "book", "book", "book1"};
		String word = "book";
	    
		System.out.print(getFrequency(book, word));
	}

}
