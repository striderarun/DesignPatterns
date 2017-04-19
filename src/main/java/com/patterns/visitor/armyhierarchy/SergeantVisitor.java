package com.patterns.visitor.armyhierarchy;

/**
 * 
 * SergeantVisitor
 *
 */
public class SergeantVisitor implements UnitVisitor {

	@Override
	public void visitUnit(Unit unit) {
		unit.childrenAccept(this);
	}

	@Override
	public void visitSoldier(Soldier soldier) {
		visitUnit((Unit) soldier);
	}

	@Override
	public void visitSergeant(Sergeant sergeant) {
		System.out.println("Greetings " + sergeant);
		visitUnit((Unit) sergeant);
	}

	@Override
	public void visitCommander(Commander commander) {
		visitUnit((Unit) commander);
	}
}
