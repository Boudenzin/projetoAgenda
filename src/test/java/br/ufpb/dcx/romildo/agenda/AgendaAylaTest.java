package br.ufpb.dcx.romildo.agenda;


import java.util.Collection;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AgendaAylaTest {
    @Test
    public void testaCadastroPesquisaRemocao() {
        AgendaAyla agenda = new AgendaAyla();
        Collection<Contato> contatosAchados = agenda.pesquisaAniversariantes(20,8);
        assertTrue(contatosAchados.isEmpty());
        agenda.cadastraContato("Pedro", 30, 1);
        agenda.cadastraContato("Kauã", 4, 5);
        contatosAchados = agenda.pesquisaAniversariantes(30,1);
        assertEquals(1, contatosAchados.size());
        Contato pedro = new Contato("Pedro", 30, 1);
        assertTrue(contatosAchados.contains(pedro));
        try {
            boolean removeu = agenda.removeContato("Pedro");
            assertTrue(removeu);
        } catch (ContatoInexistenteException e) {
            fail("Lançou exceção quando não deveria");
        }
    }


}
