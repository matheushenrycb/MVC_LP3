/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_Dao;

import Mapeamento.Aluno;
import Mapeamento.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author laboratorio
 */
public class AlunoModelo {
    public void cadastrar(Aluno aluMod){
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session secao = sf.openSession();
        Transaction tr = secao.beginTransaction();// abrir transação
        secao.save(aluMod);// salvar o objeto   
        tr.commit();// ira executar o que pediu
        secao.close();
        sf.close();
        
    }
}
