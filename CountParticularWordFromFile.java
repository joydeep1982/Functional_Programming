package functional.programming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CountParticularWordFromFile {

    public long countWordFunctionalStyle(String path, String searchWord) throws IOException {
        return Files.lines(Paths.get(path))
            .filter(line -> line.contains(searchWord))
            .count();
    }

	public long countWordImperativeStyle(String path, String searchWord) throws IOException {
		long count = 0;
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		
		String line;
		while((line = bufferedReader.readLine()) != null) {
			if (line.contains(searchWord)) {
				count++;
			}
		}
		bufferedReader.close();
		return count;
	}
}
