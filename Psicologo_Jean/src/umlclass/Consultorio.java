/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umlclass;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Consultorio {
     private String nome;
     private List<Paciente> listaPaciente;
     private List<Psicologo> listaPsicologo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Paciente> getListaPaciente() {
        return listaPaciente;
    }

    public void setListaPaciente(List<Paciente> listaPaciente) {
        this.listaPaciente = listaPaciente;
    }

    public Consultorio(String nome) {
        this.nome = nome;
        listaPaciente = new ArrayList<>();
        listaPsicologo = new ArrayList<>();
    }

    public List<Psicologo> getListaPsicologo() {
        return listaPsicologo;
    }

    public void setListaPsicologo(List<Psicologo> listaPsicologo) {
        this.listaPsicologo = listaPsicologo;
    }

    
    public void adicionarPaciente(Paciente paciente){
        listaPaciente.add(paciente);
        
    }
    public void adicionarPsicologo(Psicologo psicologo){
        listaPsicologo.add(psicologo);
        
    }
    
    public void imprimirConsultorio(){
        System.out.println("Nome: " + nome);
        System.out.println("Psicologo");
        for(Paciente paciente : listaPaciente){
            paciente.imprimirPaciente();
        }
    }
}


   


    
    

