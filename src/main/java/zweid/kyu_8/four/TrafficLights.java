package zweid.kyu_8.four;

public class TrafficLights {
    public static String updateLight(String current) {

         switch (current) {
            case "red" : return "green";
            case "green" : return "yellow";
        }
         return "red";
    }

}
