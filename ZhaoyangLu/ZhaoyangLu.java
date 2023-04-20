
public class ZhaoyangLu {
	private String firstName = "Zhaoyang";
	private String lastName = "Lu";

	public String getFullName() {
		return this.firstName+" "+this.lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getUCInetID() {
		return "zhaoyal5";
	}
	
	public int getStudentNumber() {
		return 30735594;
	}
	
	public String getRotatedFullName(int shift) {
		String fullname = this.firstName+" "+this.lastName;
		int len = fullname.length();
	    int effectiveShift = shift % len; // Handle wrap-around
	    
	    if (effectiveShift < 0) {
	        effectiveShift += len; // Handle negative shift values
	    }
	    
	    return fullname.substring(effectiveShift) + fullname.substring(0, effectiveShift);
		
	}
	
}
