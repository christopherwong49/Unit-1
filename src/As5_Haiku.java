public class As5_Haiku {
    public static void run() {
        String[] poem = MyFiles.loadStringArr("IntelliJ_DataSet/Poems/HaikuPoem1.txt");
        System.out.println("Original Haiku");
        for(String line: poem) {
            System.out.println(line);
        }

        Sort.sort(poem, 0, poem.length-1);

        System.out.println("Merge Sorted Haiku");
        for(String line: poem) {
           System.out.println(line);
        }

        System.out.println("What is the number of the file you would like to open?");
        int file = Library.input.nextInt();
        Library.input.nextLine();

        System.out.println("What word would you like to replace?");
        String replace = Library.input.nextLine();

        System.out.println("What word would you like to replace it with?");
        String word = Library.input.nextLine();

        for (int i = 0; i < poem.length; i++) {
            poem[i] = poem[i].replace(replace, word);
        }

        for(String line: poem) {
            System.out.println(line);
        }

        System.out.println("Would to like to save the file");
        if(Library.input.nextLine().equals("yes")) {
            MyFiles.saveStringArray("IntelliJ_DataSet/Poems/HaikuPoem" + file + ".txt", poem);
        }
    }
}
