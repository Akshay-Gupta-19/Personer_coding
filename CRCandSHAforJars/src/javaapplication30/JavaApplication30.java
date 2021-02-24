package javaapplication30;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.util.*;
import java.util.zip.CRC32;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author akggupta
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, NoSuchAlgorithmException {
        File f = new File("C:\\Users\\USER\\Downloads\\Java_realted\\nbjavacgit\\nbjavac15002_jars");
        File jars[] = f.listFiles();
        for (int i = 0; i < jars.length; i++) {
            FileInputStream fis = new FileInputStream(jars[i]);
            byte ba[] = new byte[(int) jars[i].length()];
            fis.read(ba);
            CRC32 cr = new CRC32();
            cr.update(ba);
            long crcAns = cr.getValue();
            File extLink;
            String netbeansLoc="C:\\netbeansSource\\netbeans";
            if (i == 0) {
                extLink = new File(netbeansLoc+"\\nb\\updatecenters\\extras\\nbjavac.api\\release\\modules\\ext\\nb-javac-15.0.0.2-api.jar.external");
            } else {
                extLink = new File(netbeansLoc+"\\nb\\updatecenters\\extras\\nbjavac.impl\\release\\modules\\ext\\nb-javac-15.0.0.2-impl.jar.external");
            }
            FileWriter exW = new FileWriter(extLink);
            String fs = "CRC:" + crcAns + "\n";
            fs += "SIZE:" + jars[i].length() + "\n";
            fs += "URL:https://netbeans.osuosl.org/binaries/" + jars[i].getName()+ "\n";
            fs += "URL:https://hg.netbeans.org/binaries/" + jars[i].getName()+ "\n";
            fs += "MessageDigest: SHA-256 " + calMDig(ba, "SHA-256")+ "\n";
            fs += "MessageDigest: SHA-512 " + calMDig(ba, "SHA-512");
            exW.write(fs);
            exW.close();
            System.out.println(jars[i].length() + " For file " + jars[i].getName() + " crc " + crcAns);
            System.out.println("And sha256 " + calMDig(ba, "SHA-256"));
            System.out.println("And sha512 " + calMDig(ba, "SHA-512"));
        }
    }

    static String calMDig(byte b[], String algo) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(algo);
        byte md2by[] = md.digest(b);
        BigInteger md2bi = new BigInteger(1, md2by);
        String ms = md2bi.toString(16);
        while(ms.length()!=Integer.parseInt(algo.substring(4))/4)ms="0"+ms;
        return ms;
    }
}
