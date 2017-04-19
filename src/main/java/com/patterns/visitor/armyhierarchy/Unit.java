package com.patterns.visitor.armyhierarchy;

/**
 * 
 * Interface for the nodes in hierarchy.
 * 
 */
public abstract class Unit {

	protected Unit[] children;

	public Unit(Unit... children) {
		this.children = children;
	}

	/**
	 * Accept visitor
	 */
	public void accept(UnitVisitor visitor) {
		System.out.println("Unit accept: Do nothing here");
	}

	public void childrenAccept(UnitVisitor visitor) {
		System.out.println("Unit children accept: Do nothing here");
	}
}
