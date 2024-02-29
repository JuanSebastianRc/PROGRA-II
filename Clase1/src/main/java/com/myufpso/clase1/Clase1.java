
package com.myufpso.clase1;

import people.Character;

public class Clase1 {

    public static void main(String[] args) {
        Character homero = new Character("Homero", 39, 'M' ,"A LA GRANDE LE PUSE CUCA");
        homero.saySomething();
        
        Character bart = new Character("Bartolomeo", 10, 'M' ,"Ayy caramba");
        bart.saySomething();
        
        Character apu = new Character();
        apu.setName("Apu");
        apu.setPhrase("Vuelvas prontos");
        
        apu.saySomething();
    }
}