import org.jsoup.nodes.Document;

import java.io.IOException;

import org.jsoup.Jsoup;

public class Main {
	public static void main (String [] args) throws IOException {
		
		Document doc = Jsoup.connect("https://dicionariocriativo.com.br/analogico/dor/substantivo/dor ").get();

		System.out.println(doc.getElementById("contentList"));
		

	}
}