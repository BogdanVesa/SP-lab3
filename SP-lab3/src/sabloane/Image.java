package sabloane;


public class Image implements Element{
    String imageName;
    Element parent;

    public Image(String imageName)
    {
        this.imageName = imageName;
    }
    public void print()
    {
        System.out.println("Image: "+imageName);
    }


}
