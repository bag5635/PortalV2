package org.example;

import java.io.*;

public class EditFile {
    Editsetget changes = new Editsetget();


    EditFile(String pharm, String add, String insur){

        changes.setPharmacy(pharm);
        changes.setAddress(add);
        changes.setInsurance(insur);

        System.out.println(pharm + " "+ add +" "+ insur +" ");



    }

    public void copy() throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        String pharm = changes.getPharmacy();
        System.out.println(pharm);

        try {
            inputStream = new BufferedReader(new FileReader("src/UserA.txt"));
            outputStream = new PrintWriter(new FileWriter(
                    "src/tem.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

}
