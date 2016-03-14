package test;

import java.util.List;

public class Comp {
	private String name;
	private List<Comp> children;

	public Comp() {
	}

	public Comp(String name) {
		this.name = name;
	}

	public Comp(String name, List<Comp> children) {
		this.name = name;
		this.children = children;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Comp> getChildren() {
		return children;
	}

	public void setChildren(List<Comp> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "Comp [name=" + name + ", children=" + children + "]";
	}

}
