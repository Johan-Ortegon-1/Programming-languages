package co.edu.javeriana.car.interprete;

import java.util.Map;

public class Println implements ASTNode {
private ASTNode data;


	public Println(ASTNode data) {
	super();
	this.data = data;
}


	@Override
	public Object execute(Map<String, Object> symbolTable) {
		System.out.println((float)data.execute(symbolTable));
		return null;
	}

}
