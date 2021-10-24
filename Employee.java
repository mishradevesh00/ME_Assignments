package project1;

//Such class known as Bean/Model/POJO(Plain old java object): 
//Here we don't have anything other than the attributes and the methods to write and read into attributes.
// i.e. It has no business logic over here.

public class Employee 
{
	// Defining Attributes
	int eid;
	String name;
	String address;
	
	// Methods
	public Employee(){
		
	}
	
	public Employee(int eid, String name, String address) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
		
	}
	
	// Getter and Setter methods
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//generate toString Method:

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
  
	
	

	

	// This is traditional approach and Its hard coding.
	
	
}
