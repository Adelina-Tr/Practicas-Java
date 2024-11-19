package com.practicajava.model;

public class Automovil {
    //Definición de Variables de Instancia (Atributos)
    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private double precio;
    private boolean isAsegurado;
    

    public Automovil() {
    }

    public Automovil(int id, String placa, String marca, String modelo, int año, String color, double precio,
            boolean isAsegurado) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.precio = precio;
        this.isAsegurado = isAsegurado;
    }
    
}

