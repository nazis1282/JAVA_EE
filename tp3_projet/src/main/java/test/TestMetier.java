package test;
import java.util.List;

import metier.MetierImpl;
import metier.Projet;
public class TestMetier {
public static void main(String[] args) {
MetierImpl metier= new MetierImpl();
List<Projet> prods = metier.getProjetsParMotCle("HP");
for (Projet p : prods)
System.out.println(p.getNomProjet());
}
}