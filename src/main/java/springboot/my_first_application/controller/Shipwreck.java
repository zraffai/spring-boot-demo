package springboot.my_first_application.controller;

public class Shipwreck {

	  Long id;

	  String name;

	  String project;

	  String empId;

	  String  phoneNo;
	  
	  String  location;

	  public Shipwreck() { }

	  public Shipwreck(Long id,String empId, String name, String project, String phoneNo,String location) {

	    this.id = id;

	    this.name = name;

	    this.project = project;

	    this.empId = empId;

	    this.phoneNo=phoneNo;
	    
	    this.location=location;
	   

	  }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	  
	}
