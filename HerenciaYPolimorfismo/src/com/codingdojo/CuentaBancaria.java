package com.codingdojo;

public class CuentaBancaria {
	private double balance;
	private String nombre;
	private int identificador;
	
	public CuentaBancaria(double balance, String nombre, int identificador) {
		this.balance = balance;
		this.nombre = nombre;
		this.identificador = identificador;
		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public void depositar( double cantidad) {
		this.balance += cantidad;
	}
	
	
	public boolean retirar( double cantidad) {
		if( cantidad <= this.balance) {
			this.balance -= cantidad;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Nombre: " + this.nombre + "\n" +
			   "Id cuenta: " + this.identificador + "\n" +
			   "balance: " + this.balance;
	
	}
	

}
