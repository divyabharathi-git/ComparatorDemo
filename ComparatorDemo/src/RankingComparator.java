import java.util.Comparator;

public class RankingComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getRating()==o2.getRating())
			return 0;
		else if(o1.getRating()>o2.getRating())
			return 1;
		else
			return -1;
	}

}
