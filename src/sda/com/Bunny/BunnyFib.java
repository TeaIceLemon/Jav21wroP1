package sda.com.Bunny;

public class BunnyFib {
    public int BunnyNoFor(int n, int bunnyNo0, int bunnyNo1) {
        if (n == 0) {
            return bunnyNo0;
        } else if (n == 1) {
            return bunnyNo1;
        } else if (n > 1) {
            for (int i = 0; i < n; i++) {
                int temp = bunnyNo0 + bunnyNo1;
                bunnyNo0 = bunnyNo1;
                bunnyNo1 = temp;
            }
            return bunnyNo0;
        }
        return -1;
    }

    public int BunnyNoRec(int n, int bunnyNo0, int bunnyNo1) {
        if (n > 1) {
            int temp = bunnyNo0 + bunnyNo1;
            bunnyNo0 = bunnyNo1;
            bunnyNo1 = temp;
            return BunnyNoRec(n - 1, bunnyNo0, bunnyNo1);
        } else return bunnyNo1;


    }
}
