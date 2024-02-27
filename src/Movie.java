import java.time.Duration;
import java.util.List;

public class Movie extends Media{

    private int duration; // Duration in minutes


    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }




    // Method to allow users to watch the movie
    public void watch(User user) {
        user.addToCart(this);
        System.out.println("You have watched the movie: " + getTitle());
    }

    // Method to recommend similar movies based on the director (auteur)
    public void recommendSimilarMovies(List<Movie> movieCatalog) {
        System.out.println("Similar movies recommended based on director " + getAuteur() + ":");
        for (Movie movie : movieCatalog) {// تتفقد كل فيلم في الكاتالوج
            //يتم التحقق مما إذا كان مخرج الفيلم مطابقًا لمخرج الفيلم الحالي و إذا كان اسم الفيلم غير مطابق لاسم الفيلم الحالي
            if (movie.getAuteur().equals(getAuteur()) && !movie.getTitle().equals(getTitle())) {
                System.out.println(movie.getTitle());//إذا توافقت هذه الشروط، يتم طباعة اسم الفيلم الحالي كجزء من الأفلام المشابهة
            }
        }}









        @Override
        public String toString() {
            return "Movie{" +
                    "title='" + getTitle() + '\'' +
                    ", auteur='" + getAuteur() + '\'' +
                    ", ISBN='" + getISBN() + '\'' +
                    ", price=" + getPrice() +
                    ", duration=" + duration +
                    '}';
        }



    @Override
    public String getMediaType() {
        if (duration >= 120) {
            return "Long Movie";
        } else {
            return "Movie";
        }
    }}
