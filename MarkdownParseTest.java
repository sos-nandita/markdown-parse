import static org.junit.Assert.*;
import org.junit.*;

import java.beans.Transient;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testGetLinks() throws IOException {
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals("https://something.com", links.get(0));
        assertEquals("some-page.html", links.get(1));

    }

    @Test
    public void testGetLinks2() throws IOException {
        Path fileName = Path.of("ms.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        // Expected output
        ArrayList<String> expectedoutput = new ArrayList<>();
        assertEquals(links, expectedoutput);

    }
    @Test
    public void testGetLinks3() throws IOException {
        Path fileName = Path.of("cs1.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        // Expected output
        ArrayList<String> expectedoutput = new ArrayList<>();
        assertEquals(links, expectedoutput);

    }
    @Test
    public void testGetLinks4() throws IOException {
        Path fileName = Path.of("woohoo.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        // Expected output
        ArrayList<String> expectedoutput = new ArrayList<>();
        assertEquals(links, expectedoutput);
    }
}





