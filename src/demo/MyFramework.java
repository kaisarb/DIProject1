package demo;

public class MyFramework {
    public static void main(String[] args) {
        Task t = new Task("Task #1");
        // Phper и Javaer являются Coder и могут быть назначены
        Coder owner = new Phper("lee4");
        //Coder owner = new Javaer("Wang5");
        t.setOwner(owner);
        t.start();
    }
}
