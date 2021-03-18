/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author Andres
 */
public class Plantas {
    private String nombre;
    private  int edad;
    private String tipo;
    private float promediovida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPromediovida() {
        return promediovida;
    }

    public void setPromediovida(float promediovida) {
        this.promediovida = promediovida;
    }

    @Override
    public String toString() {
        return "Plantas{" + "nombre=" + nombre + ", edad=" + edad + ", tipo=" + tipo + ", promediovida=" + promediovida + '}';
    }
    
    
}
