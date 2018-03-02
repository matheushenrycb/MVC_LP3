/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_class;

import controlle_rclass.AlunoController;
import mapeamento_class.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author laboratorio
 */
public class AlunoView {

    public void cadastrarAl() {
        Aluno alu = new Aluno();
        String nome = JOptionPane.showInputDialog("Insira o nome do Aluno:");
        String idade = JOptionPane.showInputDialog("Insira o Idade do Aluno:");
        String semestre = JOptionPane.showInputDialog("Insira o Semestre do Aluno:");
        String turno = JOptionPane.showInputDialog("Insira o Turno do Aluno:");
        alu.setNome(nome);
        alu.setIdade(Integer.parseInt(idade));
        alu.setSemestre(Integer.parseInt(semestre));
        alu.setTurno(turno);
        AlunoController alc = new AlunoController();
        alc.cadastrar(alu);
    }

    public void cadastroSucesso() {
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
    }

    public void cadastroErro() {
        JOptionPane.showMessageDialog(null, "Houve algum erro!!! Por favor digite novamente");
    }
}
