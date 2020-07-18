package com.aresix.blogbackend.util;

import java.io.File;
import java.io.IOException;

public class openDirectory {
    public static void open_directory(String folder) {
        File file = new File(folder);
        if (file.exists()) {
            Runtime runtime = null;
            try {
                runtime = Runtime.getRuntime();
                if (System.getProperties().getProperty("os.name").equals("Windows 10")) {
                    runtime.exec("cmd /c start explorer " + folder);
                    System.out.println(folder);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                if (null != runtime) {
                    runtime.runFinalization();
                }
            }
        }
    }
}
