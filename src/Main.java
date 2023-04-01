public class Main {
    public static void main(String[] args) {
        //EXERCITIU 1
        System.out.println("Permutari:");
        Permutari p = new Permutari(3);
        p.PermRec(1);
        System.out.println();
        System.out.println("Aranjamente:");
        Aranjamente a = new Aranjamente(3,2);
        a.AranjRec(1);
        System.out.println();
        System.out.println("Combinari:");
        Combinari c = new Combinari(4,3);
        c.CombRec(1);
        //EXERCITIU 2
        System.out.println();
        System.out.println("Generare paranteze:");
        Paranteze par = new Paranteze(6);
        par.ParantezeRec(1) ;
        //EXERCITIU 3
        System.out.println();
        System.out.println("Dame:");
        Dame d = new Dame(4);
        d.DameRec(1);
    }
}