import com.codility.demo.arrays.SmallestPositiveInt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestPositiveIntTest {

    @Test
    void solution() {
        int [] A = {1, 3, 6, 4, 1, 2};
        SmallestPositiveInt smallestPositiveInt = new SmallestPositiveInt();
        int missingPositiveInt = smallestPositiveInt.solution(A);
        assertEquals(5, missingPositiveInt);
    }

    @Test
    void solution_1() {
        int [] A = {1, 2, 3};
        SmallestPositiveInt smallestPositiveInt = new SmallestPositiveInt();
        int missingPositiveInt = smallestPositiveInt.solution(A);
        assertEquals(4, missingPositiveInt);
    }

    @Test
    void solution_2() {
        int [] A = {1, 3, 2};
        SmallestPositiveInt smallestPositiveInt = new SmallestPositiveInt();
        int missingPositiveInt = smallestPositiveInt.solution(A);
        assertEquals(4, missingPositiveInt);
    }
    @Test
    void solution_3() {
        int [] A = {-1, -3};
        SmallestPositiveInt smallestPositiveInt = new SmallestPositiveInt();
        int missingPositiveInt = smallestPositiveInt.solution(A);
        assertEquals(1, missingPositiveInt);
    }

}