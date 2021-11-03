/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 * Clase para guardar la información de un Pokemon
 * @author fran
 */
public class Pokemon {
    private String numero;
    private String nombre;
    private int altura;
    private float peso;

    /**
     * 
     * @param numero Número del Pokemon
     * @param nombre Nombre del Pokemon
     * @param altura Altura del Pokemon
     * @param peso  Peso del pokemon
     */
    public Pokemon(String numero, String nombre, int altura, float peso) {
        this.numero = numero;
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
    }

    /**
     * 
     * @return 
     */
    public String getNumero() {
        return numero;
    }

    /**
     * 
     * @param numero 
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return Devuelve la altura del pokemon
     */
    public int getAltura() {
        return altura;
    }

    /**
     * 
     * @param altura Valor al que modificamos la altura del pokemon.
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * 
     * @return 
     */
    public float getPeso() {
        return peso;
    }

    /**
     * 
     * @param peso 
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
}
