import com.codility.timecomplexity.PermMissingElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElementTest {

    @Test
    void solution() {
        int [] A = { 2, 3, 1, 5 };
        PermMissingElement permMissingElement = new PermMissingElement();
        int missing = permMissingElement.solution(A);
        assertEquals(4, missing);
    }
}