/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 *
 * @author akggupta
 */
 public class Test3 {
    public static void main(String[] args) {
        System.out.println("Akshay Gupta".indexOf("sh"));
        System.out.println("Akshay Gupta".substring(0,"Akshay Gupta".indexOf("sh")));
        System.out.println("Akshay Gupta".substring("Akshay Gupta".indexOf("sh")));
        System.out.println("     ".trim().equals(""));/*akshay*/
        System.out.println("akshayguptaisaakshaygu".indexOf("sha", 3));
        String code = "private Vector/*<ResultAttr>*/ m_ResultAttrs = new Vector();";
        String partialFiltered = deleteComments(code);
        System.out.println(partialFiltered);
          
          }
    public static String deleteComments(String myString) {
    String newString = "";

    if (myString.contains("\"")) {
        if (myString.indexOf("\"") != 0) {

            String[] stringParts = myString.split("\"");

            for (int i = 0; i < stringParts.length; i++) {

                if ((i & 1) == 0) {
                    Pattern commentaryPattern = Pattern.compile("(/\\*((.|\n)*?)\\*/)|//.*");

                    Matcher m = commentaryPattern.matcher(stringParts[i]);

                    newString += m.replaceAll("");
                } else {
                    newString += "\"" + stringParts[i] + "\"";
                }
            }
        }
    } else {
        Pattern commentaryPattern = Pattern.compile("(/\\*((.|\n)*?)\\*/)|//.*");

        Matcher m = commentaryPattern.matcher(myString);

        newString += m.replaceAll("");
    }


    return newString;
}
}
