package Session_1;

public class SocialMedia {

	String userName, postFormat, commentText;
	int userAge, userID, postID, postLikes, commentLikes;
	char userGender;
	
	public static void main(String[] args) {
		
		// Creating an instance of the class 'SocialMedia'
		SocialMedia sm1 = new SocialMedia();
		
		// Assigning values to the data members
		sm1.userName = "Devvrat";
		sm1.userAge = 19;
		sm1.userID = 1;
		sm1.userGender = 'M';
		sm1.postID = 1;
		sm1.postFormat = "Video";
		sm1.postLikes = 2;
		sm1.commentText = "Big Fan";
		sm1.commentLikes = 2;
		
		// Printing the values of the data members
		System.out.println("User Name: " + sm1.userName);
		System.out.println("User Age: " + sm1.userAge);
		System.out.println("User ID: " + sm1.userID);
		System.out.println("User Gender: " + sm1.userGender);
		System.out.println("Post ID: " + sm1.postID);
		System.out.println("Post Format: " + sm1.postFormat);
		System.out.println("Post Likes: " + sm1.postLikes);
		System.out.println("Comment Text: " + sm1.commentText);
		System.out.println("Comment Likes: " + sm1.commentLikes);
	}
}
