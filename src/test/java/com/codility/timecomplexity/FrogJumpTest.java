import com.codility.timecomplexity.FrogJump;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJumpTest {

    @Test
    void solution_1() {
        FrogJump frogJump = new FrogJump();
        int act = frogJump.solution(10, 85, 30);
        assertEquals(3, act);
    }

    @Test
    void solution_2() {
        FrogJump frogJump = new FrogJump();
        int act = frogJump.solution(0, 85, 30);
        assertEquals(3, act);
    }

    @Test
    void solution_3() {
        FrogJump frogJump = new FrogJump();
        int act = frogJump.solution(5, 85, 20);
        assertEquals(4, act);
    }

    @Test
    void solution_4() {
        FrogJump frogJump = new FrogJump();
        int act = frogJump.solution(85, 85, 20);
        assertEquals(0, act);
    }

    @Test
    void solution_5() {
        FrogJump frogJump = new FrogJump();
        int act = frogJump.solution(5, 105, 3);
        assertEquals(34, act);
    }

}