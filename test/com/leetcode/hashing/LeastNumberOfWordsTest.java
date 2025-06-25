package com.leetcode.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeastNumberOfWordsTest {


    void maxNumberOfBalloons_1() {
        LeastNumberOfWords leastNumberOfWords = new LeastNumberOfWords();
        String text = "nlaebolko";
        assertEquals(1, leastNumberOfWords.maxNumberOfBalloons(text));
    }

    @Test
    void maxNumberOfBalloons_2() {
        LeastNumberOfWords leastNumberOfWords = new LeastNumberOfWords();
        String text = "loonbalxballpoon";
        assertEquals(2, leastNumberOfWords.maxNumberOfBalloons(text));
    }

    @Test
    void maxNumberOfBalloons_3() {
        LeastNumberOfWords leastNumberOfWords = new LeastNumberOfWords();
        String text = "leetcode";
        assertEquals(0, leastNumberOfWords.maxNumberOfBalloons(text));
    }


    @Test
    void maxNumberOfBalloons_4() {
        LeastNumberOfWords leastNumberOfWords = new LeastNumberOfWords();
        String text = "balon";
        assertEquals(0, leastNumberOfWords.maxNumberOfBalloons(text));
    }

    @Test
    void maxNumberOfBalloons_5() {
        LeastNumberOfWords leastNumberOfWords = new LeastNumberOfWords();
        String text = "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";
        assertEquals(10, leastNumberOfWords.maxNumberOfBalloons(text));


    }



}