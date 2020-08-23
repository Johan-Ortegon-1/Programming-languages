package co.edu.javeriana.car.interprete;

import java.util.Map;

public class GEQ implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	

	public GEQ(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}


	@Override
	public Object execute(Map<String, Object> symbolTable) {
		// TODO Auto-generated method stub
		if((Float)operand1.execute(symbolTable)>=(Float)operand2.execute(symbolTable))
		return true;
		else 
			return false;
	}


}
