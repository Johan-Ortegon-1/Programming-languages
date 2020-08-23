package co.edu.javeriana.car.interprete;

import java.util.Map;

public class Println2 implements ASTNode {
private ASTNode data;


	public Println2(ASTNode data) {
	super();
	this.data = data;
}


	@Override
	public Object execute(Map<String, Object> symbolTable) {
		System.out.println(data.execute(symbolTable));
		return null;
	}

}
