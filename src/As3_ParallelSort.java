public class As3_ParallelSort {
    public static String airport[] = MyFiles.loadStringArr("IntelliJ_DataSet/BusiestAirports/airport.txt");
    public static String country[] = MyFiles.loadStringArr("IntelliJ_DataSet/BusiestAirports/country.txt");
    public static int totalpassengers[] = MyFiles.loadIntArr("IntelliJ_DataSet/BusiestAirports/totalpassengers.txt");
    public static int year[] = MyFiles.loadIntArr("IntelliJ_DataSet/BusiestAirports/year.txt");

    public static void run() {
        while (true) {
            System.out.println("Press 1 to sort by airport\nPress 2 to print/sort by country\nPress 3 to filter by year\nPress 4 to total passengers by airport\nPress 5 to search for airport\nPress 6 to exit");

            int option = Library.input.nextInt();

            if (option == 1) {
                sortStringArr(airport);
                for (int i = 0; i < airport.length; i++) {
                    System.out.println(country[i] + " " + airport[i] + " " + totalpassengers[i] + " " + year[i]);
                }
            }

            if (option == 2) {
                sortStringArr(country);
                for (int i = 0; i < airport.length; i++) {
                    System.out.println(country[i] + " " + airport[i] + " " + totalpassengers[i] + " " + year[i]);
                }
            }

            if (option == 3) {
                System.out.println("What year do you want to filter by?");
                int answer = Library.input.nextInt();
                for (int i = 0; i < airport.length; i++) {
                    if (answer == year[i]) {
                        System.out.println(country[i] + " " + airport[i] + " " + totalpassengers[i] + " " + year[i]);
                    }
                }
            }

            if (option == 4) {
                System.out.println("For what airport do you want total passengers?");
                Library.input.nextLine();
                String airportSelected = Library.input.nextLine();
                int total = 0;
                for (int i = 0; i < airport.length; i++) {
                    if (airportSelected.equals(airport[i])) {
                        total += totalpassengers[i];
                    }
                }
                System.out.println("Total passengers: " + total);
            }

            if (option == 5) {
                System.out.println("What airport do you want to search for?");
                Library.input.nextLine();
                String answer1 = Library.input.nextLine();
                boolean found = false;
                for (int i = 0; i < airport.length; i++) {
                    if (answer1.equals(airport[i])) {
                        System.out.println(country[i] + " " + airport[i] + " " + totalpassengers[i] + " " + year[i]);
                        found = true;
                    }
                }
                if (found == false) {
                    System.out.println("Airport not found");
                }
            }

            if (option == 6) {
                break;
            }


        }
    }

    public static void sortStringArr(String[] arr) {
        for (int i = 0; i < country.length - 1; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareToIgnoreCase(arr[lowestIndex]) < 0) {
                    lowestIndex = j;
                }
            }
            String temp = airport[i];
            airport[i] = airport[lowestIndex];
            airport[lowestIndex] = temp;

            String temp1 = country[i];
            country[i] = country[lowestIndex];
            country[lowestIndex] = temp1;

            int temp2 = totalpassengers[i];
            totalpassengers[i] = totalpassengers[lowestIndex];
            totalpassengers[lowestIndex] = temp2;

            int temp3 = year[i];
            year[i] = year[lowestIndex];
            year[lowestIndex] = temp3;
        }
    }
}
