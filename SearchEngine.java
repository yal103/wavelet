import java.io.IOException;
import java.net.URI;

class StringHandler implements URLHandler {

    String str = "";
    String[] arrStr = new String[999999999];
    int num = 0;

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("List of Words: \n%s", str);
        }
        else if (url.getPath().contains("/add")){
            System.out.println("Path: " + url.getPath());
            String[] parameters1 = url.getQuery().split("=");
            if (parameters1[0].equals("s") && num < 999999999) {
                str = str + parameters1[1] + "\n";
                arrStr[num] = parameters1[1];
                num++;
                return parameters1[1] + " has been added.";
            }
        }
        else if (url.getPath().contains("/search")) {
            System.out.println("Path: " + url.getPath());
            String[] parameters2 = url.getQuery().split("=");
            if (parameters2[0].equals("s")) {
                String returnStr = "The added words containing " + "\"" + parameters2[1] + "\" are: \n";
                for (String string: arrStr) {
                    if (string != null) {
                        if (string.contains(parameters2[1])) {
                            returnStr += (string + "\n");
                        }
                    }
                    
                }
                return returnStr;
            }
        }
        return "404 Not Found!";
        
        
    }

}


class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new StringHandler());
    }
}