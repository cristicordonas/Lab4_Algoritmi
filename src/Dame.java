public class Dame {
    private int n;
    private int[] stiva;
    public Dame(int n) {
        this.n = n;
        stiva = new int[n + 1];
    }
    public void afisare(int k) {
        for(int i=1; i<=k; i++) {
            for(int j=1; j<=k; j++) {
                if (stiva[i] == j)
                    System.out.print("D ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public boolean valid(int k) {
        for(int i=1; i<k; i++)
            if(stiva[k]==stiva[i] || Math.abs(stiva[i]-stiva[k])==Math.abs(i-k)) //daca sunt pe aceeasi linie sau pe aceeasi diagonala
                return false;
        return true;
    }
    public void DameRec(int k) {
        for(int i=1; i<=n; i++) {
            stiva[k]=i;
            if(valid(k)) {
                if (k == n)
                    afisare(k);
                else
                    DameRec(k + 1);
            }
        }
    }
}
