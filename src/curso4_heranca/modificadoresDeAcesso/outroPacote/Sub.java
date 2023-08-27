package curso4_heranca.modificadoresDeAcesso.outroPacote;

import curso4_heranca.modificadoresDeAcesso.pacote.Referencia;

public class Sub extends Referencia {
    public void testeAcesso(){
        modificadorPublico = 0;
        // modificadorDefault = 0;
        modificadorProtegido = 0;
        // modificadorPrivado = 0;

    }
}
