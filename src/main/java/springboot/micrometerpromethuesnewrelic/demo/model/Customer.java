package springboot.micrometerpromethuesnewrelic.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

	private String empName;
	private String empID;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	@Override
	public String toString() {
		return "Customer [empName=" + empName + ", empID=" + empID + "]";
	}

}
