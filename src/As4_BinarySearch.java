public class As4_BinarySearch {
    public static void run() {
        String[] creatures = {"anglerfish", "clownfish", "dolphin", "jellyfish", "octopus", "seahorse", "starfish", "swordfish", "turtle", "urchin"};
        String[] group = {"fish", "fish", "mammal", "cnidarian", "mollusk", "fish", "echinoderm", "fish", "reptile", "echinoderm"};
        Boolean[] endangered = {false, false, true, false, false, false, false, false, true, false};

        for (String creature : creatures) {
            System.out.println(creature);
        }

        while (true) {
            System.out.println("Enter a sea creature");
            String input = Library.input.nextLine();

            if(input.equals("exit")) {
                break;
            }

            int index = Search.binarySearch(creatures, input);

            if (index == -1) {
                System.out.println("I am sorry this creature is not in our list.  Please try again later");
            } else {
                System.out.println("I found it. A " + creatures[index] + " is a " + group[index]);
                if (endangered[index] == true) {
                    System.out.println("This species is endangered");
                } else {
                    System.out.println("This species is not endangered");
                }
            }
        }
    }
}
