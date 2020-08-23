package co.edu.javeriana.car.interprete;

import java.util.Map;

import co.edu.javeriana.car.Car;

public class Move_bk implements ASTNode {
	private ASTNode movimiento; 
	private Car carrito;
	
	
	
	

	public Move_bk(ASTNode movimiento, Car carrito) {
		super();
		this.movimiento = movimiento;
		this.carrito = carrito;
	}


	@Override
	public Object execute(Map<String, Object> symbolTable) {
		carrito.backwards((float)movimiento.execute(symbolTable));
		return null;
	}

}
