public class DistanceTable {
    public static void main(String[] args) {

        String[] cities = {
            "Chicago", "Boston", "New York",
            "Atlanta", "Miami", "Dallas", "Houston"
        };

        int[][] distances = {
            {0, 983, 787, 714, 1375, 967, 1087},
            {983, 0, 214, 1102, 1763, 1723, 1842},
            {787, 214, 0, 888, 1549, 1548, 1627},
            {714, 1102, 888, 0, 661, 781, 810},
            {1375, 1763, 1549, 661, 0, 1426, 1187},
            {967, 1723, 1548, 781, 1426, 0, 239},
            {1087, 1842, 1627, 810, 1187, 239, 0}
        };

        // Display the distance between every pair of cities
        System.out.printf("%-12s", "");

        for (String city : cities) {
            System.out.printf("%-12s", city);
        }

        System.out.println();

        for (int i = 0; i < distances.length; i++) {
            System.out.printf("%-12s", cities[i]);

            for (int j = 0; j < distances[i].length; j++) {
                System.out.printf("%-12d", distances[i][j]);
            }

            System.out.println();
        }

        // Example: Find the distance between Boston and New York
        System.out.println("\nDistance between Boston and New York: "
                + distances[1][2] + " miles");

   
    for(int i =0;i < distances.length;i++ ){
         int sum =0 ;
        for(int j = 0; j<7;j++){
            sum += distances[i][j];
        }
        System.out.println(sum +"\n");
    }

    
   }
}