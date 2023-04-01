public class Paranteze {
    private int n;
    private int[] stiva;
    public Paranteze(int n) {
        this.n = n;
        stiva = new int[n + 1];
    }
    public void afisare() {
        for (int i = 1; i <= n; i++) {
            if(stiva[i] == 1)
                System.out.print("(");
            else
                System.out.print(")");
        }
        System.out.println();
    }
    public boolean valid() {
        int ps = 0;
        int pd = 0;
        for (int i = 1; i <= n; i++) {
            if(stiva[i] == 1)
                ps++;
            else
                pd++;
            if(pd > ps)
                return false;
        }
        if(ps == pd)
            return true;
        return false;
    }
    public void ParantezeRec(int k) {
        if(n%2 == 1)
            System.out.println("Introduceti un numar par");
        else{
            if(k == n+1){
                if(valid())
                    afisare();
            }
            else {
                for (int i = 1; i <= 2; i++) {
                    stiva[k] = i;
                    ParantezeRec(k + 1);
                }
            }
        }
    }
}
