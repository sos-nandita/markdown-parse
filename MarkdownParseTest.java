import static org.junit.Assert.*;
import org.junit.*;
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
   public void getLinks(){
       try{
            String file = Files.readString(filePath);

       }
       catch (Exception e){

       }
   }
}
