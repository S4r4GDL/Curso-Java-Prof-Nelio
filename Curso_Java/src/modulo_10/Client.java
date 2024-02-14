package modulo_10;

public class Client extends Person {
	private int room;

	public Client(int room, String name, String email) {
		this.room = room;
		setName(name);
		setEmail(email);
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}
	
	public String toString() {
		return room + ": " + getName() + ", " + getEmail();
	}
}
