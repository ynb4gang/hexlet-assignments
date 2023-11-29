package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void take_ReturnEmptyList_WhenOriginalListIsEmpty() {
        List<Integer> emptyList = Arrays.asList();
        List<Integer> result = App.take(emptyList, 2);

        assertThat(result).isEqualTo(emptyList);
    }

    @Test
    void take_ReturnOriginalList_whenOriginalListIsEqual() {
        List<Integer> smth = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = App.take(smth, 4);

        assertThat(result).isEqualTo(smth);
    }

    @Test
    void take_ReturnCorrectList_whenOriginalListIsSmaller() {
        List<Integer> smth = Arrays.asList(3, 7, 10);
        List<Integer> result = App.take(smth, 10);

        assertThat(result).isEqualTo(smth);
    }

    @Test
    void take_ReturnCorrectList_WhenOriginalListIsBigger() {
        List<Integer> smth = Arrays.asList(5, 9, 7, 6, 1);
        List<Integer> result = App.take(smth, 3);

        assertThat(result).isEqualTo(Arrays.asList(5, 9, 7));
    }
}