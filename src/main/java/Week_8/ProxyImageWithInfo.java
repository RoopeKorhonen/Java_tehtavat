package Week_8;
// ProxyImageWithInfo class implementing the ImageWithInfo interface
class ProxyImageWithInfo extends ProxyImage implements ImageWithInfo {
    private final String filename;

    public ProxyImageWithInfo(String filename) {
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
