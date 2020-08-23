package co.edu.javeriana.car.interprete;

import java.util.Map;

public class Cadena implements ASTNode {

	private String value;
	
	
	
	
	public Cadena(String value) {
		super();
		this.value = value;
	}




	@Override
	public Object execute(Map<String, Object> symbolTable) {
		// TODO Auto-generated method stub
		return value;
	}
}
