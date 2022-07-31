package searchengine;

import java.util.Scanner;

public class WebSearchEngine {
	
	public static void main(String[] args) {
		System.out.println("WEB SEARCH ENGINE\n");
		System.out.println("1. Web Crawl   2. Search");
		System.out.print("Enter your option: ");
		Scanner sc= new Scanner(System.in);
		String option= sc.nextLine();
		switch(option) {
		case "1":
			WebCrawler webCrawler= new WebCrawler();
			System.out.print("Enter the URl to crawl: ");
			String url= sc.nextLine();
			
			//crawls
			webCrawler.crawlPageLinks(url);
			
			HTMLToText.convertFiles();
			
			Search.searchQuery();
		case "2":
			Search.searchQuery();
		default:
			System.out.println("Wrong input");
		}
		sc.close();
	}
	
}
