package tn.esprit.zoomanegment.entities;

public class Terrestrial extends Animal{
    int nbLegs;

    public Terrestrial(String name , String family , int age , boolean isMammal , int nbLegs)
        {  super(name, family, age, isMammal);
            this.nbLegs=nbLegs;

        }

}
