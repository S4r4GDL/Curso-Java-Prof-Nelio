package modulo_13;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private String title;
	private String content;
	private Date moment;
	private Integer likes;
	private List<Comment> commentsList; 
	private static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	
	public Post() {
		commentsList = new ArrayList<Comment>();
	}
	public Post(String title, String content, Date moment, Integer likes) {
		this.title = title;
		this.content = content;
		this.moment = moment;
		this.likes = likes;
		commentsList = new ArrayList<Comment>();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public Integer getLikes() {
		return likes;
	}
	public void addLikes(Integer likes) {
		this.likes += likes;
	}
	public void removeLikes(Integer likes) {
		this.likes -= likes;
	}
	public List<Comment> getCommentsList() {
		return commentsList;
	}
	public void addComment(Comment comment) {
		commentsList.add(comment);
	}
	public void removeComment(Comment comment) {
		commentsList.remove(comment);
	}
	
	public String toString() {
		StringBuilder strB = new StringBuilder();
		strB.append(title + "\n");
		strB.append(likes + "Likes -");
		strB.append(format.format(moment) + "\n");
		strB.append("Comments:\n");
		for (Comment comment : commentsList) {
			strB.append(comment.getText() + "\n");
		}
		return strB.toString();
	}
}
