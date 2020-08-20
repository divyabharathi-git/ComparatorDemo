
public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private int age;
	private int rating;
	
	public Employee(int id, String name, int age, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public int compareTo(Employee o) {
		if(age==o.age)
			return 0;
		else if(age>o.age)
			return 1;
		else
			return -1;
	}
	
	
}
