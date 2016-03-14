package test;

import java.util.ArrayList;
import java.util.List;


public class Recursion {

	public static void main(String[] args) {
		List<Comp> l1 = new ArrayList<>();
		List<Comp> l2 = new ArrayList<>();
		List<Comp> l3 = new ArrayList<>();
		l3.add(new Comp("Third1"));
		l3.add(new Comp("Third2"));
		l2.add(new Comp("Second1",l3));
		l2.add(new Comp("Second2"));
		l1.add(new Comp("First1", l2));
		l1.add(new Comp("First2"));
		Comp c1 = new Comp("First", l1);
		rec(c1);
		

	}
	public static void rec(Comp c){
		System.out.println(c.getName());
		if (c.getChildren() != null && c.getChildren().size() > 0){
			for (Comp i : c.getChildren()) {
				rec(i);
			}
		}
	}

}
