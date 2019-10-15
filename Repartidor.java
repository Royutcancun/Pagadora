/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pagadora;

/**
 *
 * @author Supervisor
 */
public class Repartidor extends Empleado{
    String zona;

    public Repartidor(String nombre, int edad, double salario, String zona ) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "El nombre del empleado es: " + nombre + "\n" 
                + "Su edad es de : " + edad + " años\n"
                + "El salario que percibe es de: " + salario +
                "Este repartidor labora en la : " + zona;
    }
    

    @Override
    public boolean plus() {
        if(super.getEdad() <= 25 && this.zona.equals("Zona 3")){
            double sueldazo;
            sueldazo = super.getSalario()+super.PLUS;
            super.setSalario(sueldazo);
        return true;    
        }else{
        return false;
        }
    }
}
