package co.edu.javeriana.car.interprete;

import java.util.Map;

public interface ASTNode {
	public Object execute(Map<String, Object> symbolTable);
}
