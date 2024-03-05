public class Methods {
    public static int frequency(String[][] a, String b){
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int x=0;x<a[i].length;x++){
                if(a[i][x].indexOf(b)>=0) count++;
            }
        }
        return count;
    }
    public static boolean ifContainsInt(int[][]a, int b){
        for(int i=0;i<a.length;i++){
            for(int x=0;x<a[i].length;x++){
                if(a[i][x]==b) return true;
            }
        }
        return false;
    }
    public static int[] firstIndex(int[][]a, int b){
        for(int i=0;i<a.length;i++){
            for(int x=0;x<a[i].length;x++){
                if(a[i][x]==b) return new int[]{i, x};
            }
        }
        return new int[]{-1, -1};
    }
    public static int[] diagonal(int[][]a) {
        int[] arr = new int[a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int x = 0; x < a[i].length; x++) {
                if (i == x) arr[i] = a[i][x];
            }
        }
        return arr;
    }
    public static String concatenated(String[][] a, int b){
        String ans="";
        for(int i=0;i<a.length;i++){
            for (int x = 0; x < a[i].length; x++) {
                if (x==b) ans+=a[i][x] +" " ;
            }
        }
        return ans;
    }
    public static int maximum(int[][]a){
        int max=a[0][0];
        for(int i=0;i<a.length;i++){
            for (int x = 0; x < a[i].length; x++) {
                if (max<a[i][x]) max=a[i][x];
            }
        }
        return max;
    }
    public static int minimum(int[][]a){
        int min=a[0][0];
        for(int i=0;i<a.length;i++){
            for (int x = 0; x < a[i].length; x++) {
                if (min>a[i][x]) min=a[i][x];
            }
        }
        return min;
    }

    public static String shortest(String[][]a){
        String min=a[0][0];
        for(int i=0;i<a.length;i++){
            for (int x = 0; x < a[i].length; x++) {
                if (min.length()>a[i][x].length()) min=a[i][x];
            }
        }
        return min;
    }
    public static String longest(String[][]a){
        String max=a[0][0];
        for(int i=0;i<a.length;i++){
            for (int x = 0; x < a[i].length; x++) {
                if (max.length()<a[i][x].length()) max=a[i][x];
            }
        }
        return max;
    }

    public static int largestAbsolute(int[][]a, int[][]b){
        int temp=Math.abs(a[0][0]-b[0][0]);
        for(int i=0;i<a.length;i++){
            for (int x = 0; x < a[i].length; x++) {
                if (temp<Math.abs(a[i][x]-b[i][x])) temp=Math.abs(a[i][x]-b[i][x]);
            }
        }
        return temp;
    }
    public static double average(double[][]a){
        double sum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            for (int x = 0; x < a[i].length; x++) {
                sum+=a[i][x];
                count++;
            }
        }
        return sum/count;
    }
    public static boolean ifRepeating(int[][]a){
        for(int i=0;i<a.length;i++){
            for (int x = 0; x < a[i].length; x++) {
                for(int k=0;k<a.length;k++){
                    for(int l=0;l<a[0].length;l++){
                        if(i!=k || x!=l &&a[i][x]==a[k][l]) return true;
                    }
                }
            }
        }
        return false;
    }
    public static String lastAlphabetically(String[][]a){
        String max=a[0][0];
        for(int i=0;i<a.length;i++){
            for (int x = 0; x < a[i].length; x++) {
                if (max.compareTo(a[i][x])<0){
                    max=a[i][x];
            }
        }
    }
        return max;
    }
}
