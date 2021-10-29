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
        String inputFileName= "filename.txt";
        int length=2;
        ParkingLotFileWriter fileWriter = new ParkingLotFileWriter("filename2.txt");
        InputWithTextFile fileReader=new InputWithTextFile(inputFileName,length,fileWriter);
        fileReader.inputFromTextFile();
        File outputFileName=new File("filename2.txt");
        Assertions.assertEquals(0,outputFileName.length());

    }
}
