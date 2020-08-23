package co.edu.javeriana.car.interprete;

import java.util.Map;

public class EQ implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;

	public EQ(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		
	
			if(operand1.execute(symbolTable).equals(operand2.execute(symbolTable))== true) {
				
				return true;
			}
		else {
			return false;
		}
	}
}

