package com.goit.BouquetOfFlowers;

import java.util.*;

/**
 * Created by Daniel Solo on 06.03.2016.
 */
public class BouquetOfFlowers {
    public String Bouquet="Beautiful wedding bouquet which consist of;";
    public String Cham="Chamomiles";
    public String Ast="Asters";
    public String Tul="Tulips";
    public String Ros="Roses";

    private List Flowers = Arrays.asList(Cham, Ast, Tul, Ros);

    public List getFlowers() {
        return Flowers;
    }

    public void setFlowers(List flowers) {
        Flowers = flowers;
    }

    Iterator itr=Flowers.iterator();

    public void Bouquet(){
        System.out.println(Bouquet);
        while(itr.hasNext())

            System.out.println(itr.next());

    }
}
