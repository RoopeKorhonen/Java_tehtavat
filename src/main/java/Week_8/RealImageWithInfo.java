package Week_8;
// RealImageWithInfo class implementing the ImageWithInfo interface
class RealImageWithInfo extends RealImage implements ImageWithInfo {
    private final String filename;

    public RealImageWithInfo(String filename) {
        super(filename);
        this.filename = filename;
    }

    @Override
    public void showData() {
        System.out.println("Image name: " + getFilename());
    }

    public String getFilename() {
        return filename;
    }
}
