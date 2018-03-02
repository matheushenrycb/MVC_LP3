/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_class;

import controlle_rclass.ProfessorController;
import mapeamento_class.Professor;
import javax.swing.JOptionPane;

/**
 *
 * @author laboratorio
 */
public class ProfessorView {

    public void cadastroProf() {
        Professor prof = new Professor(); //criando objetos
        String nome = JOptionPane.showInputDialog("Insira o nome do professor:");
        String idade = JOptionPane.showInputDialog("Insira a idade do professor:");
        String salario = JOptionPane.showInputDialog("Insira o salario do professor:");
        String materia = JOptionPane.showInputDialog("Insira a materia do professor:");

        prof.setNome(nome);
        prof.setIdade(Integer.parseInt(idade));
        prof.setSalario(Float.parseFloat(salario));
        prof.setMateria(materia);
        ProfessorController profc = new ProfessorController();
        profc.cadastrar(prof);
    }

    public void sucessoProf() {
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
    }

    public void erroProf() {
        JOptionPane.showMessageDialog(null, "Houve algum erro!!! Por favor digite novamente");
    }
}
