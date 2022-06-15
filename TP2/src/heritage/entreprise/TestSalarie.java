package heritage.entreprise;

public class TestSalarie {
    public TestSalarie() {
// TODO Auto-generated constructor stub
    }
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Individu am=new Individu("Aurélien","Martineau");
        System.out.println("Individu ="+am.toString());
        Salarie ak=new Salarie("Alain","Kerlero",5000);
        System.out.println("Individu : "+ak.toString());
        System.out.println("Salarie : "+ak.toString());
    }
}

