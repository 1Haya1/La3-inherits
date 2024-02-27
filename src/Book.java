import java.util.ArrayList;
import java.util.List;

public class Book extends Media{

    private int quantityInStock;
    private List<Review> reviews;

    public Book(String title, String auteur, String ISBN, double price, int quantityInStock) {
        super(title, auteur, ISBN, price);
        this.quantityInStock = quantityInStock;
        reviews = new ArrayList<>();
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }



    // Method to add a review to the book's list التقييمات
    public void addReview(Review review) {
        reviews.add(review);
    }

    // Method to calculate and return the average rating
    public double getAverageRating() {
        if (reviews.isEmpty()) {
            return 0.0;
        }
        double totalRating = 0.0;
        for (Review review : reviews) {
            totalRating += review.getRating();
        }

        return totalRating / reviews.size();
    }

    // Method to purchase a book
    public void purchase(User user) {
        if (quantityInStock > 0) {
            user.addToCart(this);
            quantityInStock--;
            System.out.println("Book purchased: " + getTitle());
        } else {
            System.out.println("Sorry, this book is out of stock.");
        }
    }


    // Method to check if the book is a bestseller
    public boolean isBestseller() {
        return getAverageRating() >= 4.5;
    }


    // Method to restock a book اعاده تخزين كتاب عن طريق زياده كميته في المخزون ويطبع رساله للابلاغ عن اعاده التخزين
    public void restock(int quantity) {
        quantityInStock += quantity;
        System.out.println("Restocked " + getTitle() + ". New quantity in stock: " + quantityInStock);
    }


    @Override
    public String getMediaType() {
        if (isBestseller()) {
            return "Bestselling Book";
        } else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", auteur='" + getAuteur() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                ", quantityInStock=" + quantityInStock +
                ", reviews=" + reviews +
                '}';
    }





}
