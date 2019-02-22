/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author Sebastian
 */
public class Calcular {
    // 1
    public double calculo(double ComputadorValor, int Cantidad)
    {
       return  ComputadorValor* Cantidad; 
    }
    
    //2
    public double calculo(double ComputadorValor, int Cantidad, double IVA)
    {
        return (ComputadorValor * Cantidad) +(ComputadorValor * (IVA / 100));
    }
    
    // 3
    public double calculo(double ComputadorValor, int Cantidad, double IVA, double Instalacion)
    {
        return ((ComputadorValor * Cantidad )+ (ComputadorValor * (IVA / 100))) + Instalacion;
    }
    
    //4
    public double calculo(double ComputadorValor, double Instalacion, int Cantidad)
    {
        return (ComputadorValor * Cantidad) + Instalacion;
    }
    
    //5
    public double calculo(int Cantidad, double ComputadorValor, double Instalacion, double Domicilio)
    {
        return ((ComputadorValor * Cantidad) + Instalacion + Domicilio);
    }
    
    //6
    public double calculo(int Cantidad, double ComputadorValor, double Domicilio)
    {
        return (ComputadorValor * Cantidad) + Domicilio;
    }
}
