public class Animal
{
    String family,name;
    int age;
    boolean isMammal;

    // Constructeur paramétré
    public Animal(String family,String name,int age,boolean isMammal)
    {
        this.family = family; //this
        this.name=name;
        this.age=age;
        this.isMammal= isMammal;
    }
    public void displayAnimal()
    {
        System.out.println("Nom de l'Animal: " + name);
        System.out.println("Famille: " + family);
        System.out.println("Âge: " + age + " ans");
        System.out.println("Est un mammifère: " + isMammal);
    }

   /* @Override
    public String toString()
    {
        return "Animal : " + name + "\n" +
                "Famille : " + family + "\n" +
                "Âge : " + age + " ans\n" +
                "Est un mammifère : " + isMammal;
    }*/

}
