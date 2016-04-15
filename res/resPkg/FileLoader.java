package resPkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
//TODO: make this work
public class FileLoader {
	private static FileLoader fl = new FileLoader();
	private static String filePath;
    private static int lines;
    private static String[] textInput;
    private static String[] file;
    private static String path;
	public static String[] getFile(String fileName){
		path = "res\\resPkg\\files\\"+fileName;
		//path = fl.getClass().getResource("files/"+fileName);
		System.out.println(path);
		try{
            setLines();
        } catch (IndexOutOfBoundsException e){
            System.err.println("caught io exception" + e.getMessage());
        }catch (IOException e) {
            System.err.println("caught io exception" + e.getMessage());
        }
        try{
            setText();
        } catch (IndexOutOfBoundsException e){
            System.err.println("caught io exception" + e.getMessage());
        }catch (IOException e) {
            System.err.println("caught io exception" + e.getMessage());
        }
        return textInput;
	}
	private static void setText() throws IOException{
        BufferedReader textReader = new BufferedReader(new FileReader(filePath));
        String[] textData = new String[lines];
        int i;
        for(i=0; i < lines; i++){
            textData[i]=textReader.readLine();
            textInput = textData;
        }
        textReader.close();
    }
	private static void setLines() throws IOException{
        BufferedReader lineCounter = new BufferedReader(new FileReader(filePath));
        String aLine;
        int numberOfLines = 0;

        while ((aLine = lineCounter.readLine()) != null)
        {
            numberOfLines++;
        }
        lineCounter.close();
        lines = numberOfLines;
    }
}
