import com.codility.countingelements.FrogOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogOneTest {

    @Test
    void solution() {
        int [] A = { 1, 3, 1, 4, 2, 3, 5, 4 };
        FrogOne frogOne = new FrogOne();
        int val = frogOne.solution(5 , A);
        assertEquals(6, val);
    }

    @Test
    void solution_1() {
        int [] A = { 2, 2, 2, 2, 2 };
        FrogOne frogOne = new FrogOne();
        int val = frogOne.solution(2 , A);
        assertEquals(-1, val);
    }


    @Test
    void solution_2() {
        int [] a = { 1, 3, 1, 3, 2, 1, 3 };
        FrogOne frogOne = new FrogOne();
        int val = frogOne.solution(3 , a);
        assertEquals(4, val);
    }
}