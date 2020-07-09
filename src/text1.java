import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;



public class text1  {
	 
		public static void main(String[] args)   {

	SeasonInfo[] seasons = SeasonInfo.values();
	for(SeasonInfo season:seasons) {
		System.out.println(season.name());
	}
	
	}
	}
	