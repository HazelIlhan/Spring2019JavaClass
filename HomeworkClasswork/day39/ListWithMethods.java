package day39;
import java.util.*;
public class ListWithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>lst=new ArrayList<>();
		lst.add("apple");
		
		lst.add("orange");
		lst.add("banana");
		lst.add("kiwi");
		add4items(lst);
		add4items(lst);
		
	}
	public static void add4items(	List<String>strLst) {
		for (int i = 0; i <strLst.size(); i++) {
			System.out.print(strLst.get(i)+"-");
		}
		System.out.println();// iki kodu alt alta print ettik bosluk verdi 
		
		
	}
}
