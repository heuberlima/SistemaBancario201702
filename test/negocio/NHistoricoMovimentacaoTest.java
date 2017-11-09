/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.EContaCorrente;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import persistencia.PHistoricoMovimentacao;

/**
 *
 * @author HeuberLima
 */
public class NHistoricoMovimentacaoTest {
    
    public NHistoricoMovimentacaoTest() {
    }

    /**
     * Test of registrar method, of class NHistoricoMovimentacao.
     */
    @Test
    public void testRegistrar() {
        
        System.out.println("Teste do registro de movimentações na conta");
        
        EContaCorrente conta = new EContaCorrente();
        
        PHistoricoMovimentacao persistencia = Mockito.mock(PHistoricoMovimentacao.class);
        NHistoricoMovimentacao instance = new NHistoricoMovimentacao(persistencia);
        
        when(persistencia.registrar(conta)).thenReturn(true);
        
        boolean expResult = true;
        boolean result = instance.registrar(conta);
        
        assertEquals(expResult, result);
        
        
        
    }
    
}
