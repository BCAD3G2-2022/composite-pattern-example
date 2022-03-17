public class App {
    public static void main(String[] args) throws Exception {
        

        IComponent wheat = new Leaf("wheat is an ingredient of bun");
        IComponent  sesame = new Leaf("sesame is an ingredient of bun");

        IComponent soy = new Leaf("Soy is an ingredient in Patty");
        IComponent herbs = new Leaf("Herbs is an ingredeint in Patty");



        Composite bun = new Composite("bun");

        bun.addComponent(wheat);
        bun.addComponent(sesame);

        bun.getPart();

        Composite patty = new Composite("patty");

        patty.addComponent(soy);
        patty.addComponent(herbs);

        Composite burger = new Composite("burger");

        burger.addComponent(bun);
        burger.addComponent(patty);

        burger.getPart();

        

    }
}
