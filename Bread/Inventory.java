import java.io.Serializable;
import java.util.ArrayList;

public class Inventory implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	int numBread;
	ArrayList<Bread> breadList;
	
	public Inventory(){
		numBread = 0;
		breadList = new ArrayList<Bread>();
	}
	
	public void add(Bread e){
		numBread++;
		breadList.add(e);
		
	}
}
