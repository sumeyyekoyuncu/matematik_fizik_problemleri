
public class problem {
    public static class matematik{
        public static void daire_alan(int yaricap){
            System.out.println("dairenin alani: "+(yaricap*yaricap*Math.PI));
        }
        public static void ucgen_cevresi(int kenar1,int kenar2,int kenar3){
            System.out.println("ucgenin cevresi: "+(kenar1+kenar2+kenar3));
        }
    }
    public static class fizik{
        public static void iccarpim(Vec vec1,Vec vec2){
            int iccarpim=vec1.getI()*vec2.getI() + vec1.getJ()*vec2.getJ() + vec1.getK()*vec2.getK();
            System.out.println(vec1.getIsim()+" ile "+vec2.getIsim()+" adli vectorlerin carpimi: "+iccarpim);
        }
    }
}
