package poo;

import java.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestePessoas {

    @Test
    public void testarCriaPessoas(){

        LocalDate data = LocalDate.of(1985,2,10);
        Pessoas p = new Pessoas("Roberto", "Silveira", data);
        assertEquals("erro criar pessoa", "Nome: Roberto, sobrenome: Silveira, data de nascimento: 1985/2/10, telefone: 32429883, email: robertosilveira@hotmail.com", p.toString());

    }

}
