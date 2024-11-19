package com.practicajava.services;

import com.practicajava.model.Automovil;

public class automovilService implements interfazAutomovil{

    @Override
    public void agregarAutomovil(Automovil automovil) {
        System.out.println(automovil.getPlaca() + "Automovil agregado");
    }

}
