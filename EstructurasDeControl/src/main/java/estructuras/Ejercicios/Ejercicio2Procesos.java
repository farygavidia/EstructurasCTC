/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.Ejercicios;


public class Ejercicio2Procesos {
        double montoVendido;
    double comisionporVenta;
    double salarioBase = 300.00;
    double salarioLiquido;
    double salarioBr;
    double renta;

    public Ejercicio2Procesos() {
    }

    public Ejercicio2Procesos(double montoVendido, double comisionporVenta, double salarioLiquido, double salarioBr, double renta) {
        this.montoVendido = montoVendido;
        this.comisionporVenta = comisionporVenta;
        this.salarioLiquido = salarioLiquido;
        this.salarioBr = salarioBr;
        this.renta = renta;
    }

    public double getMontoVendido() {
        return montoVendido;
    }

    public void setMontoVendido(double montoVendido) {
        this.montoVendido = montoVendido;
    }

    public double getComisionporVenta() {
        return comisionporVenta;
    }

    public void setComisionporVenta(double comisionporVenta) {
        this.comisionporVenta = comisionporVenta;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getSalarioBr() {
        return salarioBr;
    }

    public void setSalarioBr(double salarioBr) {
        this.salarioBr = salarioBr;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }
    
     public String calcComision (Ejercicio2Procesos e){
    String comision = "";
    double venta, cantComision;
    venta = e.montoVendido;
    
    if (venta > 1 && venta <999){
    cantComision = venta * 0.05;
    comision += "Se le aplico un 5% de comision por venta";
        e.comisionporVenta += cantComision;  
    }
    else if(venta > 1000 && venta < 2999){
    cantComision = venta * 0.08;
        comision += "Se le aplico un 8% de comision por venta";
        e.comisionporVenta += cantComision;
    }
    else if (venta > 3000){
    cantComision = venta * 0.10;
    comision += "Se le aplico un 10% de comision por venta";
        e.comisionporVenta += cantComision;
    }
   
    return comision;
    }
    
      public Double calcSalarioBr (Ejercicio2Procesos e){
      double salarioBr,comisionVenta;
      comisionVenta = e.comisionporVenta;
      salarioBr = comisionVenta + e.getSalarioBase();  
      return salarioBr;
            
      }
}
