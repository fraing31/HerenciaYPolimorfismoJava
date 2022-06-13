package com.codingdojo;

public class CuentaCredito extends CuentaBancaria {
	private double limiteCredito;
	private double interes;
	
	public CuentaCredito(double balance, String nombre, int identificador, double limiteCredito, double interes) {
		super(balance, nombre, identificador);
		this.limiteCredito = limiteCredito;
		this.interes = interes;
	}
	
	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	@Override
	public boolean retirar(double cantidad) {
		if (cantidad + getBalance() > this.limiteCredito) {
			return false;
		}
		else {
			setBalance( getBalance() + cantidad);
			return true;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" +
				"Limite de credito: " + this.limiteCredito + "\n" + 
				"Interes: " + this.interes;
	}
	
}
