package org.example;

import java.io.*;

public class EditFile {
    Editsetget changes = new Editsetget();


    EditFile(String pharm, String add, String insur, String name){

        changes.setPharmacy(pharm);
        changes.setAddress(add);
        changes.setInsurance(insur);
        changes.setName(name);

        System.out.println(pharm + " "+ add +" "+ insur +" ");



    }

    public void copy() throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        String pharm = changes.getPharmacy();
        String add = changes.getAddress();
        String name = changes.getName();
        String insur = changes.getInsurance();
        System.out.println(pharm);
        if(name.equals("A")) {
            try {
                inputStream = new BufferedReader(new FileReader("src/UserA.txt"));
                outputStream = new PrintWriter(new FileWriter("src/tem.txt"));
                int i = 0;
                String l;
                while ((l = inputStream.readLine()) != null && i < 2) {
                    outputStream.println(l);
                    i++;
                }
                outputStream.println(pharm);
                outputStream.println(insur);
                outputStream.println(add);
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
            File file1 = new File("src/UserA.txt");

            File rename1 = new File("src/Tem2.txt");

            file1.renameTo(rename1);

            File file2 = new File("src/tem.txt");

            File rename2 = new File("src/UserA.txt");

            file2.renameTo(rename2);

            File file3 = new File("src/Tem2.txt");

            File rename3 = new File("src/tem.txt");

            file3.renameTo(rename3);
        }
        if(name.equals("D")) {
            try {
                inputStream = new BufferedReader(new FileReader("src/UserB.txt"));
                outputStream = new PrintWriter(new FileWriter("src/tem.txt"));
                int i = 0;
                String l;
                while ((l = inputStream.readLine()) != null && i < 2) {
                    outputStream.println(l);
                    i++;
                }
                outputStream.println(pharm);
                outputStream.println(insur);
                outputStream.println(add);
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
            File file1 = new File("src/UserB.txt");

            File rename1 = new File("src/Tem2.txt");

            file1.renameTo(rename1);

            File file2 = new File("src/tem.txt");

            File rename2 = new File("src/UserB.txt");

            file2.renameTo(rename2);

            File file3 = new File("src/Tem2.txt");

            File rename3 = new File("src/tem.txt");

            file3.renameTo(rename3);
        }
        if(name.equals("G")) {
            try {
                inputStream = new BufferedReader(new FileReader("src/UserC.txt"));
                outputStream = new PrintWriter(new FileWriter("src/tem.txt"));
                int i = 0;
                String l;
                while ((l = inputStream.readLine()) != null && i < 2) {
                    outputStream.println(l);
                    i++;
                }
                outputStream.println(pharm);
                outputStream.println(insur);
                outputStream.println(add);
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
            File file1 = new File("src/UserC.txt");

            File rename1 = new File("src/Tem2.txt");

            file1.renameTo(rename1);

            File file2 = new File("src/tem.txt");

            File rename2 = new File("src/UserC.txt");

            file2.renameTo(rename2);

            File file3 = new File("src/Tem2.txt");

            File rename3 = new File("src/tem.txt");

            file3.renameTo(rename3);
        }

    }

}
