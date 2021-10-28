import com.company.InputWithTextFile;
import com.company.Main;
import com.company.ParkingLotFileWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class InputWithTextFileTest {
    @Test
    public void inputFromTextFileTest() throws FileNotFoundException {
        String textfile= "filename.txt";
        new InputWithTextFile(textfile,2,new ParkingLotFileWriter("filename2.txt"));
        InputWithTextFile.inputFromTextFile();
        File newfile=new File("filename2.txt");

        Assertions.assertEquals(0,newfile.length());
    }
}
