package sabloane;


public class Content implements Element{
    String content;
    Element parent;
    
    public Content(String content){
        this.content=content;
    }
    public void print()
    {
        System.out.print("table of contents:"+content);
    }

        
}
