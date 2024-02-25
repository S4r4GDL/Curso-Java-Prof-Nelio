package modulo_13;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Aplication_StringBuilder_Module_13 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		
		Post post1 = new Post("Traveling to New Zealand", "I'm going to visit this wonderful country!", format.parse("21/06/2018 13:05:44"), 12);
		
		Post post2 = new Post();
		post2.setTitle("Good night guys");
		post2.setContent("See you tomorrow");
		post2.setMoment(format.parse("28/07/2018 23:14:19"));
		post2.addLikes(5);
		
		post1.addComment(new Comment("Have a nice trip!"));
		post1.addComment(new Comment("Wow thats awesome!"));
		
		post2.addComment(new Comment("Good night"));
		post2.addComment(new Comment("May the Force be with you"));
		
		
		
		
		
	}
}
