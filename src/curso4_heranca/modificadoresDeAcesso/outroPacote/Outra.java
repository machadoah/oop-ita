package curso4_heranca.modificadoresDeAcesso.outroPacote;

import curso4_heranca.modificadoresDeAcesso.pacote.Referencia;

public class Outra {

    public void testeAcesso(){
        Referencia referencia = new Referencia();
        referencia.modificadorPublico = 0;

        // referencia.modificadorDefault = 0;
        // referencia.modificadorProtegido = 0;
        // referencia.modificadorPrivado = 0;

    }
}
