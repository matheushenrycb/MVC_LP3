/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_dao_class;

import mapeamento_class.HibernateUtil;
import mapeamento_class.Professor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author laboratorio
 */
public class ProfessorModelo {

    public void cadastrar(Professor profMod) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session secao = sf.openSession();
        Transaction tr = secao.beginTransaction();// abrir transação

        secao.save(profMod);// salvar o objeto   

        tr.commit();// ira executar o que pediu

        secao.close();

        sf.close();
    }
}
