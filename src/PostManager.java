import java.util.*;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) {
            return 0;
        }
        int total = 0;
        for (int value : interactions) {
            total += value;
        }
        return total;
    }

    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) return "Viral";
        if (engagementScore >= 500) return "Popular";
        if (engagementScore >= 100) return "Good";
        if (engagementScore >= 50) return "Low";
        return "Poor";
    }

    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }

    public ArrayList<String> manageHashtags(String[] hashtags) {
        ArrayList<String> uniqueHashtags = new ArrayList<>();
        if (hashtags == null) return uniqueHashtags;

        HashSet<String> set = new HashSet<>();
        for (String tag : hashtags) {
            if (tag != null && !set.contains(tag)) {
                set.add(tag);
                uniqueHashtags.add(tag);
            }
        }
        return uniqueHashtags;
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        if (posts == null || postEngagement == null) return trending;

        for (String post : posts) {
            Integer score = postEngagement.get(post);
            if (score != null && score > 500) {
                trending.add(post);
            }
        }
        return trending;
    }

    public HashSet<String> getUniqueAuthors(String... authors) {
        HashSet<String> uniqueAuthors = new HashSet<>();
        if (authors != null) {
            for (String author : authors) {
                if (author != null) {
                    uniqueAuthors.add(author);
                }
            }
        }
        return uniqueAuthors;
    }

    public static void main(String[] args) {
        PostManager manager = new PostManager();

        String postTitle = "Java Programming Tips";
        int engagementScore = manager.calculateEngagement(150, 75, 25);
        String category = manager.getCategoryRating(engagementScore);

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);

        ArrayList<String> posts = new ArrayList<>();
        posts.add("Java Programming Tips");
        posts.add("Advanced Java Tutorial");
        posts.add("Spring Boot Guide");

        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Java Programming Tips", engagementScore);
        postEngagement.put("Advanced Java Tutorial", 800);
        postEngagement.put("Spring Boot Guide", 1200);

        LinkedList<String> trendingPosts = manager.findTrendingPosts(posts, postEngagement);

        HashSet<String> uniqueAuthors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");

        System.out.println("≡ Social Media Post Manager ≡\n");
        manager.displayPostStats(postTitle, engagementScore, category);
        System.out.println();
        System.out.println("Unique Hashtags: " + uniqueHashtags);
        System.out.println("Trending Posts: " + trendingPosts);
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}
