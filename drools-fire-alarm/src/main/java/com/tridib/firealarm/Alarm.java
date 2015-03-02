package com.tridib.firealarm;

public class Alarm {
	
	private boolean onAlarm;

	public boolean isOnAlarm() {
		return onAlarm;
	}

	public void setOnAlarm(boolean onAlarm) {
		this.onAlarm = onAlarm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (onAlarm ? 1231 : 1237);
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
		Alarm other = (Alarm) obj;
		if (onAlarm != other.onAlarm)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alarm [" + onAlarm + "]";
	}

}
