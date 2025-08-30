package in.inxod.model;

public class Employee {
	
	private Integer eId;
	private String eName;
	private String eCity="Hydrabad";
	private Double eSalary;
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteCity() {
		return eCity;
	}
	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
	public Double geteSalary() {
		return eSalary;
	}
	public void seteSalary(Double eSalary) {
		this.eSalary = eSalary;
	}
	public Employee(Integer eId, String eName, String eCity, Double eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eCity = eCity;
		this.eSalary = eSalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eCity=" + eCity + ", eSalary=" + eSalary + "]";
	}
	
	
}
