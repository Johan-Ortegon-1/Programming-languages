package co.edu.javeriana.car.interprete;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Function2 implements ASTNode {

	private List<String> argumentos;
	private List<ASTNode> pasos;
	private String funcion;
	
	
	public Function2(List<String> argumentos, List<ASTNode> pasos, String funcion) {
		super();
		this.argumentos = argumentos;
		this.pasos = pasos;
		this.funcion = funcion;
	}
	

	public String getFuncion() {
		return funcion;
	}


	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public List<String> getArgumentos() {
		return argumentos;
	}


	public void setArgumentos(List<String> argumentos) {
		this.argumentos = argumentos;
	}

	
	public List<ASTNode> getPasos() {
		return pasos;
	}


	public void setPasos(List<ASTNode> pasos) {
		this.pasos = pasos;
	}


	@Override
	public Object execute(Map<String, Object> symbolTable) {	
		symbolTable.put(this.funcion, this);
		
		return null; 
	}
}

