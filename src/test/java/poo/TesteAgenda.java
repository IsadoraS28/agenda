package poo;

import java.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TesteAgenda {

    @Test
    public void testarRemoveEma(){

        LocalDate data = LocalDate.of(1985,2,10);
        Pessoas p = new Pessoas("Roberto", "Silveira", data);

        Agenda a = new Agenda();
        assertTrue("erro addPessoas", a.removePessoas("Roberto", "Silveira"));

    }

}
