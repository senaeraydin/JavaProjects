
public class Main {

	public static void main(String[] args) {
		String message = "Today the weather is so good.";
				
	    System.out.println(message);
		
		System.out.println("Character number: "+message.length());
		System.out.println("5. eleman : "+message.charAt(4));
		System.out.println(message.concat(" heeey!"));
		System.out.println(message.startsWith("B"));
		System.out.println(message.endsWith("."));
		char[] characters = new char[5];
		message.getChars(0, 4, characters, 0);
		System.out.println(characters);		
		
		System.out.println(message.indexOf('a'));
		System.out.println(message.lastIndexOf("e"));
		
		
		String newMessage = message.replace(' ', '-')
		System.out.println(newMessage);
		
		System.out.println(message.substring(2));
		System.out.println(message.substring(2, 5));
		
		for(String word: message.split(" ")) {
			System.out.println(newMessage);
		}
		
		
		System.out.println(message.toLowerCase());

	}

}
