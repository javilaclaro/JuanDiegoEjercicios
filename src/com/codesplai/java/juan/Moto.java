package com.codesplai.java.juan;

public class Moto {
    String marca;
    String modelo;
    int cc;
    int cv;

    Moto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.cc = cc;
        this.cv = cv;

    }

    @Override
    public String toString() {
        return "Moto; " + this.modelo + " (" + this.marca + ")"; // Sc00py /HONDA
    }
}