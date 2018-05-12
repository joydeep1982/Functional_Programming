package funcional.programming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountParticularWordFromFile {

    public int countWordFunctionalStyle(String path, String searchWord) {
        return Files.lines(Paths.get(path))
            .filter(line -> line.contains(searchWord))
            .count();
    }

	public int countWordImperativeStyle(String path, String searchWord) throws IOException {
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
