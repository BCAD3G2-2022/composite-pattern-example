import java.util.ArrayList;

public class Composite  implements IComponent 
{
    String part;

    public Composite(String part)
    {
        this.part = part;
    }

    ArrayList<IComponent> components = new ArrayList<IComponent>();

    public void addComponent(IComponent component)
    {
        components.add(component);
    }

    @Override
    public void getPart() {
        System.out.println(part);
        for (IComponent iComponent : components) 
        {
            iComponent.getPart();
            
        }
        
    }
    
}
