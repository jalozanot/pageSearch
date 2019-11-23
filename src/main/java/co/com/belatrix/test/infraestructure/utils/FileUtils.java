package co.com.belatrix.test.infraestructure.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public final class FileUtils {

	public static Optional<Stream<String>> getStreamFromDirectory(String directionFile) {
		try {
			Path pathFile = Paths.get(directionFile);
			return Optional.of(Files.lines(pathFile));
		} catch (IOException e) {
			// TODO : implementar log y cambiarlo por el print
			e.printStackTrace();
		}
		return Optional.empty();
	}

}