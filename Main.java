//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] arr={{"Hello,", "world", "!"}, {"It's", "me", "Genevieve"}};
        System.out.println(Methods.frequency(arr,"e"));

        //testing 2
        String[][] arr1={{"Hello,", "world", "!"}, {"It's", "me", "Genevieve"}};
        System.out.println(Methods.frequency(arr1,"l"));

        //testing 3
        String[][] arr2={{"H,", "w", "!"}, {"I", "D", "G"}};
        System.out.println(Methods.frequency(arr2,"g"));

        //algorithm 2
        int[][] arr3={{1, 2},{3, 4}};
        System.out.println(Methods.ifContainsInt(arr3,5));


        //testing 2
        int[][] arr4={{1, 5},{3, 4}};
        System.out.println(Methods.ifContainsInt(arr4,5));

        //testing 3
        int[][] arr5={{1, 5},{5, 4}};
        System.out.println(Methods.ifContainsInt(arr5,5));


        //algorithm 3
        //using arr 3
        for(int a:(Methods.firstIndex(arr3, 3))){
            System.out.print(a+ "");
        }
        System.out.println("");
        //testing 2
        //using arr 4
        for(int a:(Methods.firstIndex(arr4, 5))){
            System.out.print(a);
        }
        System.out.println("");

        //testing 3
        for(int a:(Methods.firstIndex(arr5, 5))){
            System.out.print(a);
        }
        System.out.println("");
        //algorithm 4
        for(int a:(Methods.diagonal(arr3))){
            System.out.print(a);
        }
        System.out.println("");
        //testing 2
        for(int a:(Methods.diagonal(arr4))){
            System.out.print(a);
        }
        System.out.println("");
        //testing 3
        for(int a:(Methods.diagonal(arr4))){
            System.out.print(a);
        }
        System.out.println("");
        //algorithm 5
        String[][] arr6={{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}};
        System.out.println(Methods.concatenated(arr6, 1));

        //testing 2
        System.out.println(Methods.concatenated(arr6, 0));

        //testing 3
        System.out.println(Methods.concatenated(arr6, 2));

        //algorithm 6
        int[][] arr7={{3, 2, 1}, {4, 5, 6}};
        System.out.println(Methods.maximum(arr7));

        //testing 2
        int[][] arr8={{3, 2, 10}, {4, 7, 6}};
        System.out.println(Methods.maximum(arr8));

        //testing 3
        int[][] arr9={{3, 2, 1}, {0, 5, 0}};
        System.out.println(Methods.maximum(arr9));

        //algorithm 7
        System.out.println(Methods.minimum(arr7));

        //testing 2
        System.out.println(Methods.minimum(arr8));

        //testing 3
        System.out.println(Methods.minimum(arr9));

        //algorithm 9
        System.out.println(Methods.shortest(arr6));

        //testing2
        System.out.println(Methods.shortest(arr1));

        //testing 3
        System.out.println(Methods.shortest(arr2));


        //algorithm 10
        System.out.println(Methods.longest(arr6));

        //testing2
        System.out.println(Methods.longest(arr1));

        //testing 3
        System.out.println(Methods.longest(arr2));

        //algorithm 11
        int[][] arr10={{2, 3, 4}, {-1, -2, -3}};
        int[][] arr11={{1, 2, 3}, {4, 5, 6}};
        System.out.println(Methods.largestAbsolute(arr10,arr11));

        //testing
        int[][] arr12={{2, 3, 5}, {-1, -2, -3}};
        int[][] arr13={{1, 8, 3}, {4, 5, 4}};
        System.out.println(Methods.largestAbsolute(arr12,arr13));

        //testing 3
        int[][] arr14={{2, 3, 40}, {-1, -2, -3}};
        int[][] arr15={{1, 2, 3}, {4, 5, 6}};
        System.out.println(Methods.largestAbsolute(arr15,arr15));

        //algorithm 12
        double[][] arr16={{1.6, 3.2, 5.4}, {6.3, 4.1, 2.5}};
        System.out.println(Methods.average(arr16));

        //testing 2
        double[][] arr17={{1.6, 3.2, 5.4}, {60.3, 4.1, 2.5}};
        System.out.println(Methods.average(arr17));
        //testing 3
        double[][] arr18={{1.6, 30.2, 50.4}, {6.3, 4.1, 2.5}};
        System.out.println(Methods.average(arr18));

        //algorithm  13
        int[][] arr19={{1, 2}, {3, 2}};
        System.out.println(Methods.ifRepeating(arr19));
        //testing 2
        int[][] arr20={{3, 2}, {3, 2}};
        System.out.println(Methods.ifRepeating(arr20));
        //testing 3
        int[][] arr21={{1, 4}, {3, 2}};
        System.out.println(Methods.ifRepeating(arr21));

        //algorithm 14
        String[][] arr22={{"bravo", "charlie"}, {"zebra", "alpha"}};
        System.out.println(Methods.lastAlphabetically(arr22));

        //testing 2
        String[][] arr23={{"bravo", "charlie"}, {"area", "alpha"}};
        System.out.println(Methods.lastAlphabetically(arr23));

        String[][] arr24={{"pop"}, {"area", "alpha"}};
        System.out.println(Methods.lastAlphabetically(arr24));
    }
}
