package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

import java.time.Instant;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Garden {
    private double area;
    private  boolean hasOrchard ;
    private boolean hasVegetableGarden;
    private int numberOfFlowers;

    private static Garden Instance = new Garden();

    public static Garden getInstance() {
        return Instance;
    }

    public void plantFlower(int count){

        if (count>=0){
            this.numberOfFlowers += count;
        }
        else{
            numberOfFlowers= numberOfFlowers;
        }

    }
    public void removeFlower(int count){
        if(numberOfFlowers>0){

            if(count<numberOfFlowers){
                numberOfFlowers -= count;
            }
            else{
                numberOfFlowers=0; //менше нуля квіток буте не може тому так
            }

        }
        else{
            numberOfFlowers=0; //менше нуля квіток буте не може тому так
        }
    }


    public void addVegetableRegion(double area){
        if(this.area>=area){
            this.area+=area;
        }
        else {
            if(area<=0){
                this.area=0;
            }
            else{
                this.area+=area;
            }
        }
    }

    public void Print(){
        System.out.println(area);
        System.out.println(hasOrchard);
        System.out.println(hasVegetableGarden);
        System.out.println(numberOfFlowers);
    }
    public static void main(String[] args) {

        Garden[] garden= {new Garden(),
                new Garden(2,true,false,5),
                new Garden(45,true,true,100)};

        garden[1].removeFlower(2);
        garden[2].plantFlower(14);
        garden[1].addVegetableRegion(20);

        garden[1].getInstance();

        for(int i=0 ; i<3; i++){
            System.out.println(garden[i].toString());
        }



    }
}