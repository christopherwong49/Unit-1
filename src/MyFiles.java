import java.io.*;

public class MyFiles {

    public static String[] loadStringArr(String filename) {
        String addLines = "";
        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {
                addLines += file.readLine();
                addLines += ",";

            }
        } catch (IOException e) {
            System.out.println(e);
        }

        String[] tempStringArray = addLines.split(",");
        return tempStringArray;
    }

    public static int[] loadIntArr(String filename) {
        String addLines = "";
        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {
                addLines += file.readLine();
                addLines += ",";

            }
        } catch (IOException e) {
            System.out.println(e);
        }

        String[] tempStringArray = addLines.split(",");

        int[] tempIntArray = new int[tempStringArray.length];

        for (int i = 0; i < tempStringArray.length; i++) {
            tempIntArray[i] = Integer.parseInt(tempStringArray[i]);
        }

        return tempIntArray;
    }

    public static void saveStringArray(String filename,String[] temp ) {
        try {
            PrintWriter file = new PrintWriter(new FileWriter(filename));

            for (int i = 0; i < temp.length; i++) {
                file.println(temp[i]);
            }
            file.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
