/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class SobreCarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Cantidad;
        double Total = 0;
        double ComputadorValor;
        double IVA = 0;
        double Domicilio;
        double Instalacion;
        int Opiva = 0;
        int opcion = 0;
        
        Scanner leer = new Scanner(System.in);
        
        Calcular Producto = new Calcular();
        
        System.out.println("Cual es el Valor: ");
        ComputadorValor = leer.nextDouble();
        
        System.out.println("Cual es la cantidad: ");
        Cantidad = leer.nextInt();
        
        while(opcion !=7)
        {
            System.out.println("que desea calcular");
            System.out.println("1. Valor Total");
            System.out.println("2. Valor Total con IVA");
            System.out.println("3. Valor Total con IVA e Instalacion");
            System.out.println("4. Valor Total con Instalacion");
            System.out.println("5. Valor Total con Instalacion y Domicilio");
            System.out.println("6. Valor total con Domicilio");
            opcion = leer.nextInt();
            
            switch(opcion)
            {
                case 1: Total = Producto.calculo(ComputadorValor, Cantidad);
                        
                    break;
                
                case 2: while(Opiva != 3)
                        {
                        System.out.println("Cual es el IVA: ");
                        System.out.println("1. 19%");
                        System.out.println("2. 10%");
                        System.out.println("3. No tiene");
                        Opiva = leer.nextInt();
                           
                         switch (Opiva) 
                         {
                                case 1:
                                    IVA = 19;
                                    Total =Producto.calculo(ComputadorValor, Cantidad, IVA);
                                    break;
                                case 2:
                                    IVA = 10;
                                    Total =Producto.calculo(ComputadorValor, Cantidad, IVA);
                                    break;
                                case 3:
                                    IVA = 0;
                                    Total =Producto.calculo(ComputadorValor, Cantidad, IVA);
                                    break;
                                   
                        }
                         break;   
                        //Total =Producto.calculo(ComputadorValor, Cantidad, IVA);
                        }
                    break;
                    
                case 3: while(Opiva != 3)
                        {
                            System.out.println("Cual es el IVA: ");
                            System.out.println("1. 19%");
                            System.out.println("2. 10%");
                            System.out.println("3. No tiene");
                            Opiva = leer.nextInt();
                           
                            switch (Opiva) 
                            {
                                case 1:
                                    System.out.println("ingrese el valor de la instalacion: ");
                                    IVA = 19;
                                    Instalacion = leer.nextDouble();
                                    Total =Producto.calculo(ComputadorValor, Cantidad, IVA, Instalacion);
                                    break;
                                case 2:
                                    System.out.println("ingrese el valor de la instalacion: ");
                                    IVA = 10;
                                    Instalacion = leer.nextDouble();
                                    Total =Producto.calculo(ComputadorValor, Cantidad, IVA, Instalacion);
                                    break;
                                case 3:
                                    System.out.println("ingrese el valor de la instalacion: ");
                                    IVA = 0;
                                    Instalacion = leer.nextDouble();
                                    Total =Producto.calculo(ComputadorValor, Cantidad, IVA, Instalacion);
                                    break;
                                   
                            }
                            break;   
                        
                        }
                    break;
                    
                case 4: System.out.println("ingrese el valor de la instalacion");
                        Instalacion = leer.nextDouble();
                        Total = Producto.calculo(ComputadorValor, Instalacion, Cantidad);
                    break;
                
                case 5: System.out.println("ingrese el valor de la instalacion");
                        Instalacion = leer.nextDouble();
                        System.out.println("ingrese el valor del domicilio");
                        Domicilio = leer.nextDouble();
                        Total = Producto.calculo(Cantidad, ComputadorValor, Instalacion, Domicilio);
                    break;
                
                case 6: System.out.println("ingrese el valor del domicilio");
                        Domicilio = leer.nextDouble();
                        Total = Producto.calculo(Cantidad, ComputadorValor, Domicilio);
            }
            System.out.println("Total es : " + Total);
        }
        
    }
    
}
