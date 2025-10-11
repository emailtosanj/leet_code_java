import com.codility.timecomplexity.TapeEquilibrium;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibriumTest {

    @Test
    void solution() {

        int [] A = {3, 1, 2, 4, 3};
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int minAct = tapeEquilibrium.solution(A);
        assertEquals(1, minAct);

    }

    @Test
    void solution_1() {

        /*P = 1, difference = |3 − 9| = 6
        P = 2, difference = |4 − 8| = 4
        P = 3, difference = |5 − 7| = 2
        P = 4, difference = |9 − 3| = 6*/

        int [] A = {3, 1, 1, 4, 3};
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int minAct = tapeEquilibrium.solution(A);
        assertEquals(2, minAct);


    }

}