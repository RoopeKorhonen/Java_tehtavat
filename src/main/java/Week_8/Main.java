package Week_8;
import java.util.ArrayList;
import java.util.List;

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a list to hold images (proxies)
        List<ImageWithInfo> photoAlbum = new ArrayList<>();

        // Add images to the photo album (proxies)
        photoAlbum.add(new ProxyImageWithInfo("photo1.jpg"));
        photoAlbum.add(new ProxyImageWithInfo("photo2.jpg"));
        photoAlbum.add(new ProxyImageWithInfo("photo3.jpg"));

        // Display information about the images (without loading them)
        for (ImageWithInfo image : photoAlbum) {
            image.showData();
        }

        // Display images from the photo album (load them if not already loaded)
        for (ImageWithInfo image : photoAlbum) {
            image.display();
        }
    }
}