import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Exercicio1Test {

    private final Exercicio1 calculator = new Exercicio1();

    @Test
    void addition() {
        assertEquals(2, calculator.soma(1, 1));
    }

}