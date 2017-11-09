/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.EContaCorrente;
import persistencia.PHistoricoMovimentacao;

/**
 *
 * @author HeuberLima
 */
public class NHistoricoMovimentacao {
    
    PHistoricoMovimentacao persistencia;

    //Construtor
    public NHistoricoMovimentacao(PHistoricoMovimentacao persistencia) {
        this.persistencia = persistencia;
    }
    
    public boolean registrar(EContaCorrente conta){
        return persistencia.registrar(conta);
    }
    
}
