package package3;

public class runFacebook {

	public static void main(String[] args) {
	
		facebook user1 = new facebook("user1password"); 
		
		facebook user2= new facebook("passwordjldfjl"); 
		
		facebook user3 = new facebook("fdfasd"); 
		
		facebook.numberofUser();
		
		user1.firstName="Mike";
		
		user1.chat();
		
		System.out.println(user1.password);
		System.out.println(user2.password);

	}

}
