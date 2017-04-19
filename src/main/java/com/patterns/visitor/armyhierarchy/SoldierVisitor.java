package com.patterns.visitor.armyhierarchy;

/**
 * 
 * SoldierVisitor
 *
 */
public class SoldierVisitor implements UnitVisitor {

	@Override
	public void visitUnit(Unit unit) {
		unit.childrenAccept(this);
	}

	@Override
	public void visitSoldier(Soldier soldier) {
		System.out.println("Hello " + soldier);
		visitUnit((Unit) soldier);
	}

	@Override
	public void visitSergeant(Sergeant sergeant) {
		visitUnit((Unit) sergeant);
	}

	@Override
	public void visitCommander(Commander commander) {
		visitUnit((Unit) commander);
	}
}
