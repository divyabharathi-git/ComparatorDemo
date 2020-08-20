import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Divya", 28,1);
		Employee e2 = new Employee(102, "Suji", 24,2);
		Employee e3 = new Employee(103, "Arun", 22,3);
		
		List<Employee> emplist = new ArrayList<>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		
		Collections.sort(emplist);
		Collections.sort(emplist, new AgeComparator());
		Collections.sort(emplist, new RankingComparator());
		
		
		for(Employee e : emplist) {
			System.out.println("name = "+e.getName()+" age ="+e.getAge()+" id="+e.getId()+" rating="+e.getRating());
		}
		
		

	}

}
