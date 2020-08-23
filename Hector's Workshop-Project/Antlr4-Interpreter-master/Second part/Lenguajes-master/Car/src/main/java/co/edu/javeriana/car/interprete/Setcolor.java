package co.edu.javeriana.car.interprete;

import java.util.Map;

import co.edu.javeriana.car.Car;

public class Setcolor implements ASTNode {
	private int red;
	private int green;
	private int blue;
	private ASTNode valor; 
	private Car carrito;

	public Setcolor(int red, int green, int blue, ASTNode valor, Car carrito) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.valor = valor;
		this.carrito = carrito;
	}



	@Override
	public Object execute(Map<String, Object> symbolTable) {
		
		
		float alpha = (float)valor.execute(symbolTable);
		carrito.color((float)this.red, (float)this.green, (float)this.blue, alpha*255);
		return null;
	}

}
