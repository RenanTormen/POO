/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empregado;

public class Professor extends EmpregadoUniversidade {
    
    private double horasAula;

    public double getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(double horasAula) {
        this.horasAula = horasAula;
    }
    
    @Override
    public double getSalario(){
        return super.getSalario() + (this.horasAula * 10);
    }
    
    @Override
    public String getInfo(){
        return ""+ this.horasAula;
    }
    
}
