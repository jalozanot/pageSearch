package co.com.belatrix.test.infraestructure.utils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Optional;
import java.util.stream.Stream;

import co.com.belatrix.test.infraestructure.exception.DocumentFileException;

public final class FileUtils {

	/**
	 * read file from path
	 */
	public static Optional<Stream<String>> getStreamFromDirectory(String directionFile) {
		try {
			Path pathFile = Paths.get(directionFile);
			return Optional.of(Files.lines(pathFile));
		} catch (IOException e) {
			throw new DocumentFileException(e.getMessage());
		}
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
	    			throw new DocumentFileException(e.getMessage());
	            }
	         });
	      } catch (Exception e) {
	  			throw new DocumentFileException(e.getMessage());
	      }
	}
}