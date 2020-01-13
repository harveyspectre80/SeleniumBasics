package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

    public static void main(String[] args) throws IOException {
        File file = new File("/home/admin1/selenium1/src/main/resources/abc.xlsx");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("hi");
        bufferedWriter.newLine();
        bufferedWriter.write("laxman");
        bufferedWriter.close();
    }
}
