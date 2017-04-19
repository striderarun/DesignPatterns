package com.patterns.visitor.armyhierarchy;

/**
 * 
 * Commander
 *
 */
public class Commander extends Unit {

	private String name;

	public Commander(String name, Unit... children) {
		super(children);
		this.name = name;
	}

	@Override
	public void accept(UnitVisitor visitor) {
		visitor.visitCommander(this);
	}

	@Override
	public void childrenAccept(UnitVisitor visitor) {
		for (Unit child : children) {
			child.accept(visitor);
		}
	}

	@Override
	public String toString() {
		return "commander " + name;
	}
}
