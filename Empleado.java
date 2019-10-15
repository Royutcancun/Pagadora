/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pagadora;

/**
 *
 * @author RoyOh
 */
public abstract class Empleado {
    
    public String nombre;
    int edad;
    public double salario;
    public double PLUS = 300;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "El nombre del empleado es: " + nombre + "\n" 
                + "Su edad es de : " + edad + " años\n"
                + "El salario que percibe es de: " + salario;
    }
    
    public abstract boolean plus();
    
}
