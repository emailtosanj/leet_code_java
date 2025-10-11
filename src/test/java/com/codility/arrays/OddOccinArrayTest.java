import com.codility.arrays.OddOccinArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOccinArrayTest {

    @Test
    void solution() {
        int [] a = {9, 3, 9, 3, 9, 7, 9};
        OddOccinArray oddOccinArray = new OddOccinArray();
        assertEquals(oddOccinArray.solution(a), 7);
    }

    @Test
    void solution_1() {
        int [] a = {9, 3, 9, 3, 9, 7, 9, 8, 8};
        OddOccinArray oddOccinArray = new OddOccinArray();
        assertEquals(oddOccinArray.solution(a), 7);
    }

}