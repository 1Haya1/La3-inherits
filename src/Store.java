import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Media> mediaList;
    private List<User> userList;


    public Store() {
        this.mediaList = new ArrayList<>();
        this.userList = new ArrayList<>();
    }


    // Method to add a user to the list of users
    public void addUser(User user) {
        userList.add(user);
    }

    // Method to display a list of registered users
    public void displayUsers() {
        System.out.println("Registered Users:");
        for (User user : userList) {
            System.out.println(user.getUsername() + " - " + user.getEmail());
        }
    }



    // Method to add media to the list of medias
    public void addMedia(Media media) {
        mediaList.add(media);
    }



    // Method to display a list of available medias
    public void displayMedias() {
        System.out.println("Available Medias:");
        for (Media media : mediaList) {
            System.out.println(media.getTitle() + " - " + media.getMediaType());
        }
    }


    // Method to search for a book by title and return it if found
    public Book searchBook(String title) {
        for (Media media : mediaList) {
            if (media instanceof Book && media.getTitle().equalsIgnoreCase(title)) {
                return (Book) media;
            }
        }
        return null;

    }



















}
