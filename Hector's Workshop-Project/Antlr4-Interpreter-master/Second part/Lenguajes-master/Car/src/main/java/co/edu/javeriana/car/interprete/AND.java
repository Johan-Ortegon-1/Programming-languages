package co.edu.javeriana.car.interprete;

import java.util.Map;

public class AND implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	public AND(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Object execute( Map<String, Object> symbolTable) {
		// TODO Auto-generated method stub
		if((boolean)operand1.execute(symbolTable)&&(boolean)operand2.execute(symbolTable))
		return true;
		else 
			return false;
	}
}
