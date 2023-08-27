package curso1_classe.construtores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    public void CompraAVista(){
        Compra c = new Compra(100);
        assertEquals(1, c.getNumeroParcelas());
    }

    @Test
    public void CompraAPrazo(){
        Compra c = new Compra(1000, 4);
        assertEquals(4000, c.getValorTotal());
    }

}