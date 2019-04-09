package poo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TesteTelefone {

    @Test
    public void testarAddTel(){

        Telefone t = new Telefone();
        assertTrue("erro addTel", t.addTel("Roberto Silveira", "999394882"));

        t = new Telefone();
        assertTrue("erro addTel", t.addTel("Roberto Silveira", "32429883"));

    }

    @Test
    public void testarUpdateTel(){

        Telefone t = new Telefone();
        t.addTel("Roberto Silveira", "999394882");
        assertTrue("erro updateTel", t.updateTel("Roberto Silveira", "32429883"));

    }

}
