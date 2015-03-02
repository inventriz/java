package com.tridib.firealarm;

public class Sprinkler {
	
	private Room room;
	private boolean onSprinkler;
	
	public Sprinkler(Room room) {
		super();
		this.room = room;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public boolean isOnSprinkler() {
		return onSprinkler;
	}
	public void setOnSprinkler(boolean onSprinkler) {
		this.onSprinkler = onSprinkler;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (onSprinkler ? 1231 : 1237);
		result = prime * result + ((room == null) ? 0 : room.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sprinkler other = (Sprinkler) obj;
		if (onSprinkler != other.onSprinkler)
			return false;
		if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Sprinkler [room=" + room.getRoomName() + " = " + onSprinkler + "]";
	}
	
	

}
