package com.patterns.visitor.armyhierarchy;

/**
 * 
 * Sergeant
 *
 */
public class Sergeant extends Unit {

	private String name;

	public Sergeant(String name, Unit... children) {
		super(children);
		this.name = name;
	}

	@Override
	public void accept(UnitVisitor visitor) {
		visitor.visitSergeant(this);
	}

	@Override
	public void childrenAccept(UnitVisitor visitor) {
		for (Unit child : children) {
			child.accept(visitor);
		}
	}

	@Override
	public String toString() {
		return "sergeant " + name;
	}
}
