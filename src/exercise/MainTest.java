package exercise;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.List;

class MainTest {
    @Test
    void testLunghezzaCiao() {
        assertEquals(List.of(4), Main.lunghezza().apply("ciao")); 
    }

    @Test
    void testLunghezzaParolaLunga() {
        assertEquals(List.of(33), Main.lunghezza().apply("supercalifragilistichespiralidoso"));
    }

    @Test
    void testContaY() {
        assertEquals(List.of(76, 10), Main.contaY()
                .apply("parola con y, magari pure tante y, più di una y, yyyyyy, bastano? Nah, I'd y"));
    }

    @Test
    void testContaYSenzaY() {
        assertEquals(List.of(31, 0), Main.contaY().apply("La parola non ha la lettera ..."));  
    }

    @Test
    void testInteroDaStringa() {
        assertEquals(List.of(5, 0, 12345), Main.interoDaStringa().apply("12345"));
    }

    @Test
    void testInteroDaStringa0() {
        assertEquals(List.of(1, 0, 0), Main.interoDaStringa().apply("0"));
    }

    @Test
    void testInteroDaStringaNumeroGrande() {
        assertEquals(List.of(10, 0, 1902391829), Main.interoDaStringa().apply("1902391829"));
    }

    @Test
    void testSomma() {
        assertEquals(List.of(2, 0, 11, 98), Main.somma().apply("11"));  
    }

    @Test
    void testSommaLunga() {
        assertEquals(List.of(5, 0, 12345, 255), Main.somma().apply("12345"));
    }

    @Test
    void testFinale() {
        assertEquals(List.of(5, 0, 12345, 255), Main.somma().apply("12345"));
    }
}
