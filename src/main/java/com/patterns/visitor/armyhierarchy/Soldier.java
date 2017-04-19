package com.patterns.visitor.armyhierarchy;

/**
 * 
 * Soldier
 *
 */
public class Soldier extends Unit {

	private String name;

	public Soldier(String name, Unit... children) {
		super(children);
		this.name = name;
	}

	@Override
	public void accept(UnitVisitor visitor) {
		visitor.visitSoldier(this);
	}

	@Override
	public void childrenAccept(UnitVisitor visitor) {
		for (Unit child : children) {
			child.accept(visitor);
		}
	}

	@Override
	public String toString() {
		return "soldier " + name;
	}
}
