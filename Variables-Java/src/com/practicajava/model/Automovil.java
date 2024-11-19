package com.practicajava.model;

public class Automovil {
    //Declaracion de Variables de Instancia (Atributos)
    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private double precio;
    private double kilometraje;
    private boolean isAsegurado;
    

    public Automovil() {
    }

    //Constructor: Inicializacion de Variables de Instancia
    public Automovil(int id, String placa, String marca, String modelo, int año, String color, double precio,
            double kilometraje, boolean isAsegurado) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.precio = precio;
        this.kilometraje = kilometraje;
        this.isAsegurado = isAsegurado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isAsegurado() {
        return isAsegurado;
    }

    public void setAsegurado(boolean isAsegurado) {
        this.isAsegurado = isAsegurado;
    }
    
    




    
}

