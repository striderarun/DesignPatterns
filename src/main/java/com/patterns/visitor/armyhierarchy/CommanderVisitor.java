package com.patterns.visitor.armyhierarchy;

/**
 * 
 * CommanderVisitor
 *
 */
public class CommanderVisitor implements UnitVisitor {

	@Override
	public void visitUnit(Unit unit) {
		unit.childrenAccept(this);
	}

	@Override
	public void visitSoldier(Soldier soldier) {
		System.out.println(soldier);
		visitUnit((Unit) soldier);
	}

	@Override
	public void visitSergeant(Sergeant sergeant) {
		System.out.println(sergeant);
		visitUnit((Unit) sergeant);
	}

	@Override
	public void visitCommander(Commander commander) {
		System.out.println("Good to see you " + commander);
		visitUnit((Unit) commander);
	}

}
