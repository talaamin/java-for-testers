package com.serenitydojo.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class FileLoader {
    public String readHelloWorld() throws IOException {       
       String fileContents = Files.readString(Paths.get("src/main/resources/hello.txt"));
        return fileContents;
    }

    public Boolean fileContainsText(String filename, String expectedText)  {
    	try {
    		String path = "src/main/resources/" + filename;       	
        	return (Files.readString(Paths.get(path)).contains(expectedText));   		
    	}
    	catch(IOException io) {
    		return false;
    		
    	}
    	
    }

    public Boolean fileHasText(String filename, String expectedText) {
        String path = "src/main/resources/" + filename;
        try {
        	return  (Files.readString(Paths.get(path)).contains(expectedText));
        }
        catch (IOException io) {
        	throw new MissingWelcomeFileException("No matching file name " + filename, io);
        }
     
        
   
    }
}
