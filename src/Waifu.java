import java.util.ArrayList;
import java.util.List;

public class Waifu {
    private String nom;
    private int niveau;
    private int exp;
    private int attaque;
    private int defense;
    private int pointDeVie;
    private int velocite;
    private String type;
    private String avantage;
    private String desavantage;
    private int limiteArmes;
    private int limiteArtefacts;
    private int limitePotions;
    private Inventaire inventaire;

    public Waifu(String nom, int attaque, int defense, int pointDeVie, int velocite, String type, String avantage, String desavantage) {
        this.nom = nom;
        this.niveau = 1;
        this.exp = 0;
        this.attaque = attaque;
        this.defense = defense;
        this.pointDeVie = pointDeVie;
        this.velocite = velocite;
        this.type = type;
        this.avantage = avantage;
        this.desavantage = desavantage;
        this.limiteArmes = 2;
        this.limiteArtefacts = 3;
        this.limitePotions = 5;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getNiveau() {
        return niveau;
    }
    
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    
    public int getExp() {
        return exp;
    }
    
    public void gagnerExperience(int exp) {
        this.exp += exp;
        if (this.exp >= this.niveau * 10) {
            this.niveau += 1;
            this.attaque += 2;
            this.defense += 2;
            this.pointDeVie += 5;
            this.velocite += 1;
            System.out.println("Félicitations, " + this.nom + " a gagné un niveau !");
        }
    }
    
    public void ajouterArme(Arme arme) {
        if (arme.size() < limiteArmes) {
            arme.add(arme);
        } else {
            System.out.println("L'inventaire est plein. Vous ne pouvez pas ajouter d'autres armes.");
        }
    }
    
    public void retirerArme(Arme arme) {
        if (arme.contains(arme)) {
            arme.remove(arme);
        } else {
            System.out.println("Vous ne possédez pas cette arme.");
        }
    }
    
    public void ajouterArtefact(Artefact artefact) {
        if (artefact.size() < limiteArtefacts) {
            artefact.add(artefact);
        } else {
            System.out.println("L'inventaire est plein. Vous ne pouvez pas ajouter d'autres artefacts.");
        }
    }
    
    public void retirerArtefact(Artefact artefact) {
        if (artefact.contains(artefact)) {
            artefact.remove(artefact);
        } else {
            System.out.println("Vous ne possédez pas cet artefact.");
        }
    }
    
    public void ajouterPotion(Potion potion) {
        if (potion.size() < limitePotions) {
            potion.add(potion);
        } else {
            System.out.println("L'inventaire est plein. Vous ne pouvez pas ajouter d'autres potions.");
        }
    }
    
    public void retirerPotion(Potion potion) {
        if (potion.contains(potion)) {
            potion.remove(potion);
        } else {
            System.out.println("Vous ne possédez pas cette potion.");
        }
    }
    
    public int getAttaque() {
        return attaque;
    }
    
    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }
    
    public int getDefense() {
        return defense;
    }
    
    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    public int getPointDeVie() {
        return pointDeVie;
    }
    
    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }
    
    public int getVelocite() {
        return velocite;
    }
    
    public void setVelocite(int velocite) {
        this.velocite = velocite;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getAvantage() {
        return avantage;
    }
    
    public void setAvantage(String avantage) {
        this.avantage = avantage;
    }
    
    public String getDesavantage() {
        return desavantage;
    }
    
    public void setDesavantage(String desavantage) {
        this.desavantage = desavantage;
    }

    public int getNbPotions() {
        return inventaire.getNbPotions();
    }

    public List<Object> getInventaire() {
        List<Object> inventaire = new ArrayList<>();
        return inventaire;
    }

    public void attaquer(Simp ennemi) {
        Arme arme = this.getArmeEquipee();
        int degats = arme.getDegats();
        ennemi.recevoirDegats(degats);
        }
        
        public Arme getArmeEquipee() {
        return this.inventaire.getArmeEquipee();
        }

    /*
    public void attaquer(Simp ennemi) {
        Arme arme = getArmeEquipee();
        if (arme == null) {
            System.out.println("Vous n'avez pas d'arme équipée.");
            return;
        }
        int degats = arme.getDegats();
        ennemi.recevoirDegats(degats);
        System.out.println("Vous avez infligé " + degats + " dégâts à l'ennemi.");
    }
    
    public Arme getArmeEquipee() {
        for (Arme arme : inventaire.getNbArmes()) {
            if (arme.estEquipee()) {
                return arme;
            }
        }
        return null;
    }
    */
    
    public void utiliserPotion(Potion potion) {
    }
}