package images;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display(){
        System.out.println(fileName + " is displayed");
    }

    public void loadFromDisk(){
        System.out.println("Loading");
    }
}
