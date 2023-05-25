/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package umlclass;

/**
 *
 * @author usuario
 */
public class UMLclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente1, paciente2, paciente3;
        paciente1 = new Paciente( 71216723, "Keila", 25);
        paciente2 = new Paciente( 21471481, "Gabriel", 40);
        paciente3 = new Paciente( 12832178, "Nicolas", 17);
        
        Psicologo psicologo1 = new Psicologo("Joelma", 123456789, 12.000);
        
        Consultorio consultorio1 = new Consultorio("Sala5");
        consultorio1.adicionarPaciente(paciente1);
        consultorio1.adicionarPaciente(paciente2);
        consultorio1.adicionarPaciente(paciente3);
        
        consultorio1.imprimirConsultorio();
    }
    
}
