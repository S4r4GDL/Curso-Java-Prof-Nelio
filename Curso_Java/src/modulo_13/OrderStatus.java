package modulo_13;

public enum OrderStatus {
	PENDING_PAYMENT(0),
	PROCESSING(1),
	SHIPPED(2),
	DELIVERED(3);
	
	private int value;
	
	private OrderStatus(int value){  

		this.value=value;  

	}  
	
	
}
