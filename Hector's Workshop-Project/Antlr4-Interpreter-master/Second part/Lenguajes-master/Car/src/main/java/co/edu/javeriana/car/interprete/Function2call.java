package co.edu.javeriana.car.interprete;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Function2call implements ASTNode {
	
	private String variable; 
	private List<ASTNode> parametros;
	
	
	
	public Function2call(String variable, List<ASTNode> parametros) {
		super();
		this.variable = variable;
		this.parametros = parametros;
	}



	@Override
	public Object execute(Map<String, Object> symbolTable) {
		
		Function2 nueva = (Function2) symbolTable.get(this.variable);
		List<String> argumentos = nueva.getArgumentos();
		List<ASTNode> body = nueva.getPasos();
		
		for(int i = 0; i < argumentos.size();i++) {
			
			symbolTable.put(argumentos.get(i), (this.parametros.get(i).execute(symbolTable)));
		}
		for (ASTNode n : body)
		{
			n.execute(symbolTable);		
		}
		
		return null;
	}

}
