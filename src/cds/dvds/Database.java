package cds.dvds;

import java.util.ArrayList;

public class Database {
    private ArrayList<CD> cds;
    private ArrayList<DVD> dvds;
    
    public Database(){
        cds = new ArrayList<CD>();
        dvds = new ArrayList<DVD>();
    }

    public void setCD(CD cd) {
        cds.add(cd);
    }

    public void setDVD(DVD dvd) {
        dvds.add(dvd);
    }

    public ArrayList<CD> getCds() {
        return cds;
    }

    public ArrayList<DVD> getDvds() {
        return dvds;
    }
}
