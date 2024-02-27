//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Store store = new Store();

                // Create some media items
        Book book1 = new Book("Book1", "Author1", "123456789", 19.99, 10);
        Music music1 = new Music("Music1", "Artist1", "234567890", 9.99,"mohammed");
        Movie movie1 = new Movie("Movie1", "Director1", "345678901", 29.99, 120);

                // Add media items to the store
        store.addMedia(book1);
        store.addMedia(music1);
        store.addMedia(movie1);

            //1    // Display available media in the store
        System.out.println("Available Media in the Store:");
        store.displayMedias();

                // Create a user
        User user1 = new User("haya", "hayaao010@gmail.com");

                // Add items to the user's shopping cart
        user1.addToCart(book1);
        user1.addToCart(music1);

                // Remove an item from the shopping cart
        user1.removeFromCart(music1);

                // Display the user's shopping cart
        System.out.println("haya Shopping Cart:");
        for (Media media : user1.getShoppingCart()) {
            System.out.println(media.getTitle());
                }


                // Display purchased media by the user
        System.out.println("haya Purchased Media:");
        for (Media media : user1.getPurchasedMedia()) {
            System.out.println(media.getTitle());
                }


                // Add reviews for the book
        Review review1 = new Review("haya", 4.5, "Great book!");
        Review review2 = new Review("jana", 5.0, "Excellent read!");

        book1.addReview(review1);
        book1.addReview(review2);

                // Calculate and display the average rating for the book
        System.out.println("Average Rating for Book1: " + book1.getAverageRating());


        // Users Listen to music
        Music music = new Music("Alan-Song", "hadi", "123", 9.99, "hadi");
        User user = new User("haya", "haya@gmail.com");

        music.listen(user);



       // Novel
        Novel novel = new Novel("The Great life", "M. Fahad", "996-05-43273-565", 10.99, 10, "Classic");
        System.out.println(novel.toString());
        System.out.println(novel.getMediaType());
        Review newReview = new Review("haya", 5.0, "the best novel!");
        novel.addReview(newReview);
        System.out.println("Average Rating for Novel: " + novel.getAverageRating());


        // Complete the purchase
        user1.checkout();

    }
        }
















