public class Zoo
{
    Animal [] animals; // Tableau pour stocker les animaux
    String name,city;
    int nbrCages;
    int animalCount = 0;

    // Constructeur paramétré
    public Zoo(String name , String city, int nbrCages)
    {
        this.animals= new Animal [nbrCages]; //tableaux
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    // Méthode pour afficher les informations du zoo
    public void displayZoo()
    {
        System.out.println("Nom du Zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }

   /* @Override
    public String toString() {
        return "Zoo : " + name + "\n" +
                "Ville : " + city + "\n" +
                "Nombre de cages : " + nbrCages;
    }*/
   public boolean addAnimal(Animal animal)
   {
       if(animalCount < nbrCages)
       {
           animals[animalCount] = animal;
           animalCount++;
           return true;
       }
       else return false;
   }
}
