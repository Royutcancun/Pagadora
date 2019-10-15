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
public class PagadorApp {
    public static void main(String[] args) {
        
        Comercial elVentas = new Comercial("Ruben Dedor", 33, 10550, 500);
        elVentas.plus();
        System.out.println(elVentas);
        
        Repartidor elMotoneto = new Repartidor("Mortaliko", 22, 5400, "Zona 3");
        elMotoneto.plus();
        System.out.println(elMotoneto);
        elMotoneto.getSalario();
    }
    
}
