/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        /* TODO: your code goes here */
        int hashtagCount = 0;
        for (int x = 0; x == post.length(); x++) {
            if(post.contentEquals("#")){
                hashtagCount = hashtagCount + 1;
            }
        }
        for (int y = 0; y == hashtagCount; y++){
            int beginning = post.indexOf("#");
            int end = post.indexOf(" ");
            String HashPost = post.substring(beginning, end);
            System.out.println("Hashtag: " + HashPost);
        }


    }

}
