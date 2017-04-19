package com.patterns.visitor.armyhierarchy;

/**
 * 
 * Visitor interface.
 * 
 */
public interface UnitVisitor {

	void visitUnit(Unit unit);

	void visitSoldier(Soldier soldier);

	void visitSergeant(Sergeant sergeant);

	void visitCommander(Commander commander);

}
