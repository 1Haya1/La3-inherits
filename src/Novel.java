public class Novel extends Book{

    private String genre;


    public Novel(String title, String auteur, String ISBN, double price, int quantityInStock, String genre) {
        super(title, auteur, ISBN, price, quantityInStock);
        this.genre = genre;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }




    @Override
    public String getMediaType() {
        if (getAverageRating() >= 4.5) {
            return "Bestselling Novel";
        } else {
            return "Novel";
        }
    }


    @Override
    public String toString() {
        return "Novel{" +
                "title='" + getTitle() + '\'' +
                ", auteur='" + getAuteur() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                ", quantityInStock=" + getQuantityInStock() +
                ", genre='" + genre + '\'' +
                '}';
    }














}
