package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {

        private String mmotive;

        private int msquadMagnitude;


    private static List<Squad> Squads=new ArrayList<>();

    public Squad(String motive,int squadMagnitude ) {
            mmotive = motive;
            msquadMagnitude = squadMagnitude;

        }

        public String getmotive() {

            return mmotive;
        }
        public int getsquadMagnitude() {
            return msquadMagnitude;
        }

    }

