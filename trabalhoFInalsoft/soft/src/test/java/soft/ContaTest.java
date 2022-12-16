package soft;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContaTest {
    @Test
    //Apos inicializar a conta, a localizacao tem que ser falsa.
    void localizacaoFalsa() {
        Usuario usuario = new Usuario();
        Conta conta = new Conta("Brasil", usuario);
        assertFalse(conta.getCompartilharLocalizacao());
    }

    @Test
    //Apos inicilizar a conta, a opcao de compartilhar a localizacao selecionada tem que ser falsa.
    void compartilharLocalizacao() {
        Usuario usuario = new Usuario();
        Conta conta = new Conta("Brasil", usuario);
        assertFalse(conta.localizacao(""));
    }

    @Test
    //Apos inicilizar conta compartilhar localizacao tem que ser falso e variavel compartilharLocalizacao tambem
    void compartilharLocalizacao2() {
        Usuario usuario = new Usuario();
        Conta conta = new Conta("Brasil", usuario);
        conta.localizacao("");
        assertFalse(conta.getCompartilharLocalizacao());
    }

    @Test
    void VincularSistema() {
        Usuario usuario = new Usuario("1", 124, "banana@gmail.com", "123");
        Conta conta = new Conta("Brasil", usuario);
        assertTrue(conta.vincularSistema("1", 124, "123"));
    }
    
}
