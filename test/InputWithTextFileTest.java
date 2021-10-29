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
//        Given
        String inputFileName= "filename.txt";
        int length=2;
        ParkingLotFileWriter fileWriter = new ParkingLotFileWriter("filename2.txt");
        new InputWithTextFile(inputFileName,length,fileWriter);

//        When
        boolean result= InputWithTextFile.inputFromTextFile();

//        Then
        Assertions.assertEquals(false,result);

    }
}
