package poo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TesteEmail {

    @Test
    public void testarAddEma(){

        Email e = new Email();
        assertTrue("erro addEma", e.addEma("Roberto Silveira", "r.silveira@gmail.com"));

        e = new Email();
        assertTrue("erro addEma", e.addEma("Roberto Silveira", "robertosilveira@hotmail.com"));

    }

    @Test
    public void testarUpdateTel(){

        Email e = new Email();
        e.addEma("Roberto Silveira", "r.silveira@gmail.com");
        assertTrue("erro updateEma", e.updateEma("Roberto Silveira", "robertosilveira@hotmail.com"));

    }

}
