/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_class;

/**
 *
 * @author laboratorio
 */
public class MVC_LP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlunoView alv = new AlunoView();
        alv.cadastrarAl();
        ProfessorView profv = new ProfessorView();
        profv.cadastroProf();
    }

}
