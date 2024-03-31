package tn.esprit.zoomanegment.main;

import tn.esprit.zoomanegment.entities.*;

public class ZooManagment {
    public static void main (String[] arg){

        //Prosit 1
        /*
        //Instruction 1
        int nbrCages= 20;
        String zooName  = " myzoo";
        System.out.println(zooName+ " comporte "+nbrCages +" cages");
        */

        /*
        //Instruction 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisi le nom du zoo ...");
        String zoo = sc.next();
        System.out.println("Saisi le nbr cages ...");
        int nbr = sc.nextInt();
        System.out.println(zoo+ " comporte "+nbr +" cages");*/

        //Prosit 2
         /*
        tn.esprit.zoomanegment.entities.Animal a1 = new tn.esprit.zoomanegment.entities.Animal();
        a1.name="lion";
        a1.family="lion";
        a1.age= 2;
        a1.isMammal=true;*/



        //Prosit 2

        /*
        tn.esprit.zoomanegment.entities.Animal a2 = new tn.esprit.zoomanegment.entities.Animal("lion","lion",3,true);


        tn.esprit.zoomanegment.entities.Zoo z1 = new tn.esprit.zoomanegment.entities.Zoo();
        z1.name="abc";
        z1.city="Sousse";
        z1.nbrCages=30;

        tn.esprit.zoomanegment.entities.Zoo z2 =new tn.esprit.zoomanegment.entities.Zoo("xyz","tunis",50);



        System.out.println(z2);
        System.out.println(z2.toString());

        */

        /*
        //Prosit 3

        Zoo z2 =new Zoo(null,"tunis",25);
        Zoo zoo3 =new Zoo("friguia","sousse",22);
        Animal a2 = new Animal("lion","lion",3,true);
        Animal a1 = new Animal("chat","siamoi",5,true);
        Animal a3 = new Animal("chien","pikenoi",4,true);

        //ajouter des animaux au tableau
        z2.addAnimal(a1);

        z2.setName("d");
        z2.addAnimal(a2);
        System.out.println(z2.addAnimal(a3));


        System.out.println("le zoo qui contient le max d'animaux est : "+ Zoo.comparerZoo(z2,zoo3));

*/


        //Prosit 5
        Aquatic aquatic = new Dolphin();
        aquatic.setName("ac");
        try {
            System.out.println("etape 1");
            aquatic.setAge(3);
            System.out.println("etape 2");

        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("etape 3");

        aquatic.setFamily("poisson");
        aquatic.setMammal(false);
        aquatic.setHabitat("MMM");

        Penguin p = new Penguin("abc","abc",4,true,"abc",4.0f);
        Dolphin d = new Dolphin("abc","abc",4,true,"abc",4.0f);
        Dolphin d1 = new Dolphin("abc","abc",4,true,"abc",4.0f);
        Penguin c = new Penguin("abc","abc",4,true,"abc",4.0f);
        Penguin v = new Penguin("abc","abc",4,true,"abc",4.0f);



        System.out.println("***********");
        aquatic.swim();
        d.swim();
        p.swim();

        System.out.println("****   PROSIT 6   ******");

        Zoo z = new Zoo("abc","tunis",24);
        z.addAquaticAnimal(p);
        z.addAquaticAnimal(d);
        z.addAquaticAnimal(d);
        z.addAquaticAnimal(aquatic);
        z.afficherSwim();
        z.displayNumberOfAquaticsByType();


        System.out.println(d1.equals(d));






















    }
}
