/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AlunoController;
import Mapeamento.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author laboratorio
 */
public class AlunoView {

    public void Cadastrar() {
        Aluno alu = new Aluno();
        String nome = JOptionPane.showInputDialog("Insira o nome do Aluno:");
        String idade = JOptionPane.showInputDialog("Insira o Idade do Aluno:");
        String semestre = JOptionPane.showInputDialog("Insira o Semestre do Aluno:");
        String turno = JOptionPane.showInputDialog("Insira o Turno do Aluno:");
        alu.setNome(nome);
        alu.setIdade(Integer.parseInt(idade));
        alu.setSemestre(Integer.parseInt(semestre));
        alu.setTurno(turno);
        AlunoController alc=new AlunoController();
        alc.cadastrar(alu);
    }

    public void cadastroSucesso() {
        
    }

    public void cadastroErro() {

    }
}
