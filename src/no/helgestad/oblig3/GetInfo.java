package no.helgestad.oblig3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import android.util.Log;
import android.widget.TextView;

public class GetInfo {
	private BufferedReader reader;

	public void getData(){
		
		try {
            String urlString = "http://www.it-stud.hiof.no/android/data/randomData.php";
            System.out.println("hei");
            URL url = new URL(urlString);
            InputStream is = url.openStream();
            InputStreamReader isReader = new InputStreamReader(is);
            reader = new BufferedReader(isReader);
            System.out.println("hei");
        } catch (MalformedURLException ex) {
        } catch (IOException ex) {
        }
    }
	public String getTitle(){
		String line;
		String title = null;
		getData();
		try {
			while((line = reader.readLine()) != null){
				
				title += line;
				//title = line.split(":");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return title;
	}
}
	