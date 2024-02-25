package modulo_13;

import java.util.Date;

public class Post {
	private String title;
	private String content;
	private Date moment;
	private Integer likes;
	
	public Post() {
		
	}
	public Post(String title, String content, Date moment, Integer likes) {
		this.title = title;
		this.content = content;
		this.moment = moment;
		this.likes = likes;
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
	
	
	
}
