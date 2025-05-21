import org.example.ParametrosConta;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrosContaTest {

    @Test
    public void deveRetornarNumeroConta() {
        ParametrosConta.getInstance().setNumeroConta("1234567890");
        assertEquals("1234567890", ParametrosConta.getInstance().getNumeroConta());
    }

    @Test
    public void deveRetornarNomeConta() {
        ParametrosConta.getInstance().setNomeConta("Dino da Silva Sauro");
        assertEquals("Dino da Silva Sauro", ParametrosConta.getInstance().getNomeConta());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        ParametrosConta.getInstance().setUsuarioLogado("Usuario1");
        assertEquals("Usuario1", ParametrosConta.getInstance().getUsuarioLogado());
    }
}
