package tn.esprit.zoomanegment.entities;

public class Dolphin extends Aquatic{
    float swimmingSpeed;
    public Dolphin(String name , String family , int age , boolean isMammal , String habitat , float swimmingSpeed){
        super(name, family, age, isMammal, habitat);
        this.swimmingSpeed=swimmingSpeed;
    }

    public Dolphin(){

    }


    public void swim(){
        System.out.println("this dolphin  is swimming");
    }
}
