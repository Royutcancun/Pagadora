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
public class Comercial extends Empleado{
    double comision;

    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nSu comision fue de: " + comision;
    }
    

    @Override
    public boolean plus() {
        if(super.getEdad() > 30 && this.comision > 200){
        double sueldazo;
        sueldazo = super.getSalario()+super.PLUS;
        super.setSalario(sueldazo);
            System.err.println("Este vendedor sí alcanzó bono");
        return true;
        }else{
        }
        System.out.println("Este vendedor no alcanzó bono");
        return false;
    }
    
    
}
