/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlle_rclass;

import mapeamento_class.Aluno;
import model_dao_class.AlunoModelo;

/**
 *
 * @author laboratorio
 */
public class AlunoController {
// metodo para formuladio de alunos

    public void cadastrar(Aluno aluno) {
        AlunoModelo alm = new AlunoModelo();
        alm.cadastrar(aluno);

    }

}
