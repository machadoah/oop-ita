package curso4_heranca.entendendoHeranca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    public void deposita(){
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(200);
        assertEquals(200,cc.saldo);
    }

    @Test
    public void saque(){
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(200);
        cc.sacar(100);
        assertEquals(100,cc.saldo);
    }

    @Test
    public void saqueMaiorQueSaldo(){
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(200);
        cc.sacar(300);
        assertEquals(200,cc.saldo);
    }



}