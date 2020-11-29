/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akggupta
 */
public class DeepFileCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f1=new File("C:\\nb-java-x_3\\archive_jars\\javac-impl");
        File f2=new File("C:\\nb-java-x_3\\new_jars\\nb-javac-14-impl");
        List<File> l1=getFilesRecursively(f1);
        List<File> l2=getFilesRecursively(f2);
        System.out.println(l1.size());
        //System.out.println("new jar"+l2.toString().replaceAll(",","\n"));
        //System.out.println("old jar"+l1);
        System.out.println("Diffs");
        for (int i = 0; i < l2.size(); i++) {
           if(!l1.get(i).getName().equals(l2.get(i).getName())) 
                System.out.println(l1.get(i)+" "+l2.get(i));
        }
    }
     static ArrayList<File> getFilesRecursively(File F) {
        ArrayList<File> currentList = new ArrayList<>();
        if(!F.isDirectory()){
            currentList.add(F);
            return currentList;
        }
        File unFiltered[] = F.listFiles();
        for (int i = 0; i < unFiltered.length; i++) {
            File currentFile = unFiltered[i];
            if (currentFile.isDirectory()) {
                ArrayList<File> chl = getFilesRecursively(currentFile);
                currentList.addAll(chl);
            } else  {
                currentList.add(unFiltered[i]);
            }
        }
        return currentList;
    }
}
