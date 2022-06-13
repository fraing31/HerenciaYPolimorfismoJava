package com.codingdojo;

public class Aplicacion {
	public static void main( String arg[]) {
		CuentaBancaria cuentaIrving = new CuentaBancaria( 0.0, "Irving Cardenas", 12345);
		CuentaCredito cuentaJosue = new CuentaCredito( 0.0, "Josue Choque", 67891, 10000.0, 0.08);
		
		cuentaIrving.depositar( 1000.0);
		System.out.println(cuentaIrving.toString());
		cuentaJosue.retirar(5000.0);
		cuentaJosue.retirar(4000.0);
		cuentaJosue.retirar(3000.0);
		System.out.println(cuentaJosue.toString());
	}

}
