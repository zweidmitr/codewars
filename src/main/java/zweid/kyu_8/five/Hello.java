package zweid.kyu_8.five;

public class Hello {
    public String sayHello(String[] name, String city, String state) {
        return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ",name), city, state);
    }
}
