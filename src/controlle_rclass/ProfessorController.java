/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlle_rclass;

import mapeamento_class.Professor;
import model_dao_class.ProfessorModelo;

/**
 *
 * @author laboratorio
 */
public class ProfessorController {

    public void cadastrar(Professor prof) {
        ProfessorModelo profmod = new ProfessorModelo();
        profmod.cadastrar(prof);
        
    }
}
