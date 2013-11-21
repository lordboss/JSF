package com.example.jsfdemo.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Mebel {
	private String model;
	private String rodzaj;
	private double cena;
	private double dlugosc;
	private double szerokosc;
	private String nr_seryjny;


	public Mebel(String model, String rodzaj, double cena, double dlugosc, double szerokosc,String nr_seryjny) {
		super();
		this.model = model;
		this.rodzaj = rodzaj;
		this.cena = cena;
		this.dlugosc = dlugosc;
		this.szerokosc = szerokosc;
		this.nr_seryjny = nr_seryjny;
	}

	public Mebel() {
	}

	@Pattern(regexp = "[A-Z]{4}-[0-9]{3}")
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	@Size(min = 2, max = 20)
	public String getRodzaj() {
		return rodzaj;
	}

	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public double getDlugosc() {
		return dlugosc;
	}

	public void setDlugosc(double dlugosc) {
		this.dlugosc = dlugosc;
	}

	@Min(0)
	public double getSzerokosc() {
		return szerokosc;
	}

	public void setSzerokosc(double szerokosc) {
		this.szerokosc = szerokosc;
	}
	public String getNr_seryjny() {
		return nr_seryjny;
	}

	public void setNr_seryjny(String nr_seryjny) {
		this.nr_seryjny = nr_seryjny;
	}
}