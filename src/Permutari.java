public class Permutari {
    private int n;
    private int[] stiva;
    public Permutari(int n) {
        this.n = n;
        stiva = new int[n + 1];
    }
    public void afisare() {
        for (int i = 1; i <= n; i++) {
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
    public void PermRec(int k) {
        if(k == n+1){
            afisare();
        }
        else {
            for (int i = 1; i <= n; i++) {
                stiva[k] = i;
                if (valid(k)) {
                    PermRec(k + 1);
                }
            }
        }
    }

}
