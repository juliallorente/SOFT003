package soft;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsuarioTest {
    @Test
    void emailIncorreto() {
        Usuario usuario = new Usuario("1", 124, "banana@gmail.com", "123");
        Exception thrown = assertThrows(Exception.class, () -> {usuario.fazerLogin("banana1@gmail.com", "senha123");});
        assertTrue(thrown.getMessage().contentEquals("Email incorreto."));
    }

    @Test
    void senhaIncorreta() {
        Usuario usuario = new Usuario("1", 124, "banana@gmail.com", "123");
        Exception thrown = assertThrows(Exception.class, () -> {usuario.fazerLogin("banana@gmail.com", "senha12");});
        assertTrue(thrown.getMessage().contentEquals("Senha incorreta."));
    }

}
