package co.com.belatrix.test.infraestructure.utils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Optional;
import java.util.stream.Stream;

public final class FileUtils {

	/**
	 * read file from path
	 */
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

	/**
	 * write stream in document
	 */
	public static void writeStreamToDirectory( final String fileName, Stream<String> contentFileStream) {
	      Path path = Paths.get(fileName);
	      try (BufferedWriter br = Files.newBufferedWriter(path, Charset.defaultCharset(), StandardOpenOption.CREATE)) {
	    	  contentFileStream.forEach((file) -> {
	            try {
	               br.write(file);
	               br.newLine();
	            } catch (IOException e) {
	               throw new UncheckedIOException(e);
	            }
	         });
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	}
}