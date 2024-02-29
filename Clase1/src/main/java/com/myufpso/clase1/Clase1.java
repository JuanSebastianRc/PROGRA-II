
package com.myufpso.clase1;


public class Clase1 {

    public static void main(String[] args) {
        Character homero = new Character("Homero", 39, 'M' ,"A LA GRANDE LE PUSE CUCA");
        homero.saySomething();
        Character bart = new Character("Bartolomeo", 10, 'M' ,"Ayy caramba");
        bart.saySomething();
    }
    static class Character {
        String name;
        int age;
        char gender;
        String phrase;

        public Character(String name, int age, char gender, String phrase) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.phrase = phrase;
        }
        
        void saySomething() {
            System.out.println(this.phrase);
        }
    }
}
