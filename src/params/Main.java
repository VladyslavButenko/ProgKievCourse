package params;


public class Main {
    public static void main(String[] args) {
        String url = "param1=value1&param2=value2&param3=value3";
        String[] paramsAndValues = url.split("&");
        for (String str : paramsAndValues) {
            if (!str.matches("[A-z]+[0-9]=[A-z]+[0-9](&|$)")) {
                try {
                    throw new Exception("Wrong pattern!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(str);

        }
    }
}
