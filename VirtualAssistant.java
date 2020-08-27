import java.awt.Desktop;
import java.net.URI;
import java.util.Date;
import java.util.Scanner;

public class VirtualAssistant {
	
	public static void Jarvis(String name) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		Desktop d1 = Desktop.getDesktop();
		
		
		name = sc.nextLine();
		String n = "😊";// 
		switch(name.toLowerCase()) {
			case"hi jarvis":
				try {
					System.out.println("Thinking....");
					Thread.sleep(3000);
				}catch(Exception e) {}
				System.out.println("Its my way of saying I get you "+n);
			break;
			case"hey jarvis":
				try {
					System.out.println("Thinking....");
					Thread.sleep(3000);
				}catch(Exception e) {}
		     	System.out.println("Great! I here to help you if you need anything else"+n);
		    break;
			case"what are you doing":
				try {
					System.out.println("Thinking....");
					Thread.sleep(3000);
				}catch(Exception e) {}
				System.out.println("Wating for you ask me anything.");
				System.out.println("So, go for it 😜.");
			break;
			case"bye jarvis":try {
				System.out.println("Sir it was very bad....");
				Thread.sleep(3000);
			}catch(Exception e) {}
				System.out.println("See you later, sir 😭.");
			break;
			case"bye":
				try {
					System.out.println("Thinking....");
					Thread.sleep(3000);
				}catch(Exception e) {}
				System.out.println("GoodBye .");
			break;
			case"hi":
				try {
					System.out.println("Thinking....");
					Thread.sleep(3000);
				}catch(Exception e) {}
				System.out.println("How may Help you, sir.");
			break;
			case"date":
				try {
					System.out.println("What date today....");
					Thread.sleep(2000);
				}catch(Exception e) {}
				Date d = new Date();
				System.out.println(d);
			break;
			case"open google":
				try {
					System.out.println("Opening google....");
					Thread.sleep(2000);
				}catch(Exception e) {}
				d1.browse(new URI("https://www.google.com/"));
		    break;
 			case"open gmail":
				try {
					System.out.println("Opening gmail....");
					Thread.sleep(2000);
				}catch(Exception e) {}
				d1.browse(new URI("https://mail.google.com/mail/u/0/#inbox"));
		    break;
			case"open youtube":
				try {
					System.out.println("Opening youtube....");
					Thread.sleep(2000);
				}catch(Exception e) {}
				d1.browse(new URI("https://www.youtube.com/"));
		    break;
			case"wikipedia":
				
				System.out.println("Enter first name withotu spaces");
			    String n1 = sc.nextLine();				
			    System.out.println("Enter second name withotu spaces");
			    String n2 = sc.nextLine();
			    
				try {
					System.out.println("You find the "+n1+" "+n2+" wikipedia....");			
					Thread.sleep(2000);
				}catch(Exception e) {}  
			    d1.browse(new URI("https://en.wikipedia.org/wiki/"+n1+"_"+n2));
		    break;
		    case"open java":
		    	try {
		    		System.out.println("Opening java course....");
		    		Thread.sleep(2000);
		    	}catch(Exception e) {}
		    	d1.browse(new URI("https://www.youtube.com/watch?v=lxja8wBwN0k&list=PLKKfKV1b9e8ps6dD3QA5KFfHdiWj9cB1s&index=1"));
		}
		
	}
//---------------------------------------------------------------------	
	public static void ma(String n) throws Exception {
		
		for(;;) {
			System.out.println("You want to quit");
			Scanner sc = new Scanner(System.in);
			n = sc.nextLine();
			boolean an = false;
			
			switch(n.toLowerCase()) {
			case"no":
				System.out.println("Ok, sir");
				System.out.println("Ask question");
			break;
			case"n":
				System.out.println("Ok, sir");
				System.out.println("So, Ask question");
			break;
			case"yes":
				System.out.println("Ok, sir");
				System.out.println("Bye have a good day.");
				an = true;
			break;
			case"y":
				System.out.println("Ok, sir");
				System.out.println("Bye have a good day.");
				an = true;
			break;
			case"":
				System.out.println("Ok, sir");
				System.out.println("So, Ask question");
			break;
			}
			if(an==true)break;
			Jarvis("");
			System.out.println();
		}
	}
	public static void main(String[]a) throws Exception {
		ma("");
	}
	
}