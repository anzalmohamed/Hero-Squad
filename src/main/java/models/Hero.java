package models;

import java.util.*;
public class Hero {

    private String msuperpower;

    private int mheroAge;


    private static List<Hero> Heroes =new ArrayList<>();

    public Hero(String superpower,int heroAge ) {
        msuperpower = superpower;
        mheroAge = heroAge;

    }

    public String getsuperpower() {

        return msuperpower;
    }
    public int getheroAge() {
        return mheroAge;
    }

}
