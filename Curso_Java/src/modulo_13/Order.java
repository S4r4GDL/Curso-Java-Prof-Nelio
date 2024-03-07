package modulo_13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date moment;
	private String status;
	private List<OrderItem> orderItemsList;
	private Client client;
	
	public Order() {
		this.moment = new Date();
		this.orderItemsList = new ArrayList<OrderItem>();
	}
	public Order(String status, Client client) {
		this.moment = new Date();
		this.status = status;
		this.orderItemsList = new ArrayList<OrderItem>();
		this.client = client;
	}
	public Date getMoment() {
		return moment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void addItem(OrderItem item) {
		if(orderItemsList.contains(item))
			orderItemsList.get(orderItemsList.indexOf(item)).addQuantity(item.getQuantity());
		else
			orderItemsList.add(item);
	}
	public void removeItem(OrderItem item) {
		if(orderItemsList.contains(item))
			orderItemsList.remove(item);
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
}
