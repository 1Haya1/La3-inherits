import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User {

    private String username;
    private String email;
    private List<Media> purchasedMedia;
    private List<Media> shoppingCart;


    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchasedMedia = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Media> getPurchasedMedia() {
        return purchasedMedia;
    }

    public void setPurchasedMedia(List<Media> purchasedMedia) {
        this.purchasedMedia = purchasedMedia;
    }

    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }





    // Method to add media to the user's shopping cart
    public void addToCart(Media media) {
        shoppingCart.add(media);
        System.out.println(media.getTitle() + " added to cart.");
    }


    // Method to remove media from the shopping cart
    public void removeFromCart(Media media) {
        if (shoppingCart.remove(media)) {
            System.out.println(media.getTitle() + " removed from cart.");
        } else {
            System.out.println(media.getTitle() + " is not in the cart.");
        }
    }





    //checkout(): يكمل عملية الشراء والتحديثات التي تم شراؤها قائمة الوسائط والمخزون
    public void checkout() {
        System.out.println("Checkout started...");
        List<Media> cartCopy = new ArrayList<>(shoppingCart); // إنشاء نسخة من سلة التسوق

        for (Media media : cartCopy) {
            media.purchase(this); // شراء الوسائط
            shoppingCart.remove(media); // إزالة العنصر من سلة التسوق الأصلية
        }

        purchasedMedia.addAll(cartCopy); // إضافة الوسائط المشتراة إلى قائمة الوسائط المشتراة للمستخدم
        cartCopy.clear(); // مسح النسخة بعد الشراء
        System.out.println("Checkout completed.");
    }




}
