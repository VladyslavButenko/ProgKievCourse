package params;


public class Main {
    public static void main(String[] args) {
        String url = "pa5ram1=value1&param2=va8lue2&param3=value3";
        String[] paramsAndValues = url.split("&");
        for (String str : paramsAndValues) {
            if (!str.matches("[A-z0-9]+[0-9]=[A-z0-9]+[0-9](&|$)")) {
                try {
                    throw new Exception("Wrong pattern!");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
            System.out.println(str);

        }
    }
}
