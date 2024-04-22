public class Test {
    
    public static double testCosCumparaturi() {
        CosCumparaturi cos = new CosCumparaturi();
        
        Produs p1 = new Produs("Produs1", 150);
        Produs p2 = new Produs("Produs2", 300);
        Produs p3 = new Produs("Produs3", 600);
        
        cos.adaugaProdus(p1);
        cos.adaugaProdus(p2);
        cos.adaugaProdus(p3);
        
        return cos.calculeazaTotal();
    }
    
    public static void main(String[] args) {
    	
        double total = testCosCumparaturi();
        
        System.out.println(total);
    }
}
