package graficaint;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class BufferReader {
	
	public void titolo () throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("titolo.txt"));
        String line = reader.readLine();
        while(line!=null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    }
}
