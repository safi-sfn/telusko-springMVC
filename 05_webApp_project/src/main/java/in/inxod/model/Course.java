package in.inxod.model;

public class Course {
	
	private Integer cId;
	private String cName;
	private Double cCost;
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Double getcCost() {
		return cCost;
	}
	public void setcCost(Double cCost) {
		this.cCost = cCost;
	}
	public Course(Integer cId, String cName, Double cCost) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cCost = cCost;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cCost=" + cCost + "]";
	}
	
	
}
