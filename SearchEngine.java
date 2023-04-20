// import java.io.IOException;
// import java.net.URI;
// import java.security.cert.PKIXBuilderParameters;

// class SearchEngine implements URLHandler{
    
//     String[] strArr = new String[];

//     public String handleRequest(URI url) {
//         if (url.getPath().equals("/")) {
//             return str;
//         }
//         else if (url.getPath().contains("/add")){
//             System.out.println("Path: " + url.getPath());
//             String[] parameters = url.getQuery().split("=");
//             if (parameters[0].equals("s")) {
//                 str = str + parameters[1] + "\n";
//                 return parameters[1] + "has been added.";
//             }
//         else if (url.getPath().contains("/search")) {
//             System.out.println("Path: " + url.getPath());
//             String[] parameters = url.getQuery().split("=");
//             if (parameters[0].equals("s")) {
                
//             }
//         }

//             // System.out.println("Path: " + url.getPath());
//             // if (url.getPath().contains("/add")) {
//             //     String[] parameters = url.getQuery().split("=");
//             //     if (parameters[0].equals("count")) {
//             //         num += Integer.parseInt(parameters[1]);
//             //         return String.format("Number increased by %s! It's now %d", parameters[1], num);
//             //     }
//             // }
//         }
//     }
// }
