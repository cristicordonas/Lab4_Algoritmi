public class Aranjamente{
    private int n;
    private int k;
    private int[] stiva;
    public Aranjamente(int n, int k) {
        this.n = n;
        this.k = k;
        stiva = new int[k + 1];
    }
    public void afisare() {
        for (int i = 1; i <= k; i++) {
            System.out.print(stiva[i] + " ");
        }
        System.out.println();
    }
    public boolean valid(int k) {
        for (int i = 1; i < k; i++) {
            if (stiva[i] == stiva[k]) {
                return false;
            }
        }
        return true;
    }
    public void AranjRec(int k) {
        if(k == this.k+1){
            afisare();
        }
        else {
            for (int i = 1; i <= n; i++) {
                stiva[k] = i;
                if (valid(k)) {
                    AranjRec(k + 1);
                }
            }
        }
    }
}
