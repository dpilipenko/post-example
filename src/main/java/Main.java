import javax.mail.MessagingException;

import com.dpilipenko.post.Post;


public class Main {

	public static void main(String[] args) {		
	
		String to = "dimap09@gmail.com";
		String subject = "post example";
		String body = "thank you for trying out post. :-]";
		try {
			System.out.println("Post start");
			new Post().email(to, subject, body);
			System.out.println("Post sent");
		} catch (MessagingException e) {
			System.out.println("Post failed");
			e.printStackTrace();
		}

	}

}
