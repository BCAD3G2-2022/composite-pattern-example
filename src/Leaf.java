public class Leaf implements IComponent {

    String part;

    public Leaf(String part)
    {
        this.part=part;
    }

    @Override
    public void getPart() {
        // TODO Auto-generated method stub
        System.out.println(part); 
    }
    
}
