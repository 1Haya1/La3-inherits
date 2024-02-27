public class Media {

    private String title;
    private String auteur;
    private String ISBN;
    private double price;

    public Media(String title, String auteur, String ISBN, double price){
        this.title = title;
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }





    public String getMediaType() {// book,music,movie
        return "Media";
    }



    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", auteur='" + auteur + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", price=" + price +
                '}';
    }


    public void purchase(User user) {
        if (this instanceof Book) {
            Book book = (Book) this;
            book.purchase(user); // إتمام عملية الشراء للكتب
        } else if (this instanceof Music) {
            Music music = (Music) this;
            music.listen(user); // تشغيل الموسيقى
        } else if (this instanceof Movie) {
            Movie movie = (Movie) this;
            movie.watch(user); // مشاهدة الفيلم
        } else {
            System.out.println("Unsupported media type for purchase: " + this.getMediaType());
        }
    }









}
