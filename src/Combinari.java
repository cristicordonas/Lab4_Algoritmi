public class Combinari {
    private int n;
    private int k;
    private int[] stiva;
    public Combinari(int n, int k) {
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
        for(int i = 1 ; i < k ; ++ i)
            if(stiva[k] == stiva[i])
                return false;
        if(stiva[k] <= stiva[k-1])
            return false;
        return true;
    }
    public void CombRec(int k) {
        if(k == this.k+1){
            afisare();
        }
        else {
            for (int i = 1; i <= n; i++) {
                stiva[k] = i;
                if (valid(k)) {
                    CombRec(k + 1);
                }
            }
        }
    }
}
