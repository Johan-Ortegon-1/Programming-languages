package co.edu.javeriana.car.interprete;

import java.util.Map;

import co.edu.javeriana.car.Car;

public class Turn_lt implements ASTNode {
	private ASTNode movimiento; 
	private Car carrito;
	
	
	
	

	public Turn_lt(ASTNode movimiento, Car carrito) {
		super();
		this.movimiento = movimiento;
		this.carrito = carrito;
	}


	@Override
	public Object execute(Map<String, Object> symbolTable) {
		carrito.left((float)movimiento.execute(symbolTable));
		return null;
	}

}
