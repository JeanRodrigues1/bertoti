/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umlclass;

/**
 *
 * @author usuario
 */
public class Psicologo {
    private String nome;
    private int rg;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRG() {
        return rg;
    }

    public void setRG(int rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Psicologo(String nome, int rg, double salario) {
        this.nome = nome;
        this.rg = rg;
        this.salario = salario;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
    
    public void imprimirPsicologo(){
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Salário: " + salario);
    }
 
}
    
    

