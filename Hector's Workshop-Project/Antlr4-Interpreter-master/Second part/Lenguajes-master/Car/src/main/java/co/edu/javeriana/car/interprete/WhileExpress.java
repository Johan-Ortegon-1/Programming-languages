package co.edu.javeriana.car.interprete;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WhileExpress implements ASTNode {

	private ASTNode compar;
	private List<ASTNode> body;
	private Map<String, Object> nuevo = new HashMap <String, Object>();

			
	public WhileExpress(ASTNode compar, List<ASTNode> body) {
		super();
		this.compar = compar;
		this.body = body;
	}
	@Override
	public Object execute(Map<String, Object> symbolTable) {
				
		this.nuevo = symbolTable;
		
		try {
			while((boolean) compar.execute(this.nuevo)){
			for(ASTNode n: body ){
				n.execute(this.nuevo);
			}
		}
		}
		catch(Exception e) {
			System.out.println(" An error has ocurred: " + e.getMessage());
		}
	return null;
}
	}

	
	
