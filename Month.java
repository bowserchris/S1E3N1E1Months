package n1e1ejericioMonth;

public class Month {
	
	private String name;
	
	public Month(String month) {
		this.name = month;
	}
	
	public String getMonth() {
		return name;
	}

	public void setMonth(String month) {
		this.name = month;
	}
	
	
	//needed?
	/*public boolean equals(Month month) {
		return name.equalsIgnoreCase(month.getMonth());
	}*/
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if((obj == null) || (obj.getClass() != this.getClass()))
			return false;
		// object must be Test at this point
		Month month = (Month)obj;
		return name == month.name;
	}
	
	public int hashCode(){
		int hash = 7;
		hash = 31 * hash + (null == name ? 0 : name.hashCode());
	return hash;
	}
	
	
}
