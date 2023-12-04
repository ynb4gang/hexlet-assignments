package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void testEnlargeArrayImage() {

        String[][] image1 = {
            {"*", "*", "*", "*"},
            {"*", " ", " ", "*"},
            {"*", " ", " ", "*"},
            {"*", "*", "*", "*"},
        };

        String[][] enlargedImage1 = {
            {"*", "*", "*", "*", "*", "*", "*", "*"},
            {"*", "*", "*", "*", "*", "*", "*", "*"},
            {"*", "*", " ", " ", " ", " ", "*", "*"},
            {"*", "*", " ", " ", " ", " ", "*", "*"},
            {"*", "*", " ", " ", " ", " ", "*", "*"},
            {"*", "*", " ", " ", " ", " ", "*", "*"},
            {"*", "*", "*", "*", "*", "*", "*", "*"},
            {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        String[][] actual1 = App.enlargeArrayImage(image1);
        assertThat(actual1).isDeepEqualTo(enlargedImage1);

        String[][] image2 = {
            {" ", " ", "*", " ", " "},
            {" ", "*", " ", "*", " "},
            {" ", "*", " ", "*", " "},
            {"*", " ", " ", " ", "*"},
            {"*", " ", " ", " ", "*"},
            {" ", "*", " ", "*", " "},
            {" ", "*", " ", "*", " "},
            {" ", " ", "*", " ", " "},
        };

        String[][] enlargedImage2 = {
            {" ", " ", " ", " ", "*", "*", " ", " ", " ", " "},
            {" ", " ", " ", " ", "*", "*", " ", " ", " ", " "},
            {" ", " ", "*", "*", " ", " ", "*", "*", " ", " "},
            {" ", " ", "*", "*", " ", " ", "*", "*", " ", " "},
            {" ", " ", "*", "*", " ", " ", "*", "*", " ", " "},
            {" ", " ", "*", "*", " ", " ", "*", "*", " ", " "},
            {"*", "*", " ", " ", " ", " ", " ", " ", "*", "*"},
            {"*", "*", " ", " ", " ", " ", " ", " ", "*", "*"},
            {"*", "*", " ", " ", " ", " ", " ", " ", "*", "*"},
            {"*", "*", " ", " ", " ", " ", " ", " ", "*", "*"},
            {" ", " ", "*", "*", " ", " ", "*", "*", " ", " "},
            {" ", " ", "*", "*", " ", " ", "*", "*", " ", " "},
            {" ", " ", "*", "*", " ", " ", "*", "*", " ", " "},
            {" ", " ", "*", "*", " ", " ", "*", "*", " ", " "},
            {" ", " ", " ", " ", "*", "*", " ", " ", " ", " "},
            {" ", " ", " ", " ", "*", "*", " ", " ", " ", " "},
        };

        String[][] actual2 = App.enlargeArrayImage(image2);
        assertThat(actual2).isDeepEqualTo(enlargedImage2);

        String[][] image3 = {
            {"@", "@"},
            {"@", "|"},
            {"—", "|"},
            {"@", "|"},
            {"@", "@"},
        };

        String[][] enlargedImage3 = {
            {"@", "@", "@", "@"},
            {"@", "@", "@", "@"},
            {"@", "@", "|", "|"},
            {"@", "@", "|", "|"},
            {"—", "—", "|", "|"},
            {"—", "—", "|", "|"},
            {"@", "@", "|", "|"},
            {"@", "@", "|", "|"},
            {"@", "@", "@", "@"},
            {"@", "@", "@", "@"},
        };

        String[][] actual3 = App.enlargeArrayImage(image3);
        assertThat(actual3).isDeepEqualTo(enlargedImage3);
    }
}
