package curso4_heranca.entendendoHeranca;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ContaEspecialTest extends ContaCorrenteTest{

    ContaEspecial especial;

    @BeforeEach
    public void inicializaConta(){
        especial = new ContaEspecial(100);
        especial.depositar(200);
    }

}