/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage;

import controlador.ConsumidorGateway;

/**
 *
 * @author Andrea
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ConsumidorGateway cg = new ConsumidorGateway();
        
        System.out.println(cg.consultarProductos());
        
    }
    
}
