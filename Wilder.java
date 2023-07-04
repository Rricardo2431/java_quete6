package Wilder;
public class Wilder {

    private String firstname;
    private boolean aware;

public Wilder(String firstname, boolean aware) {
this.firstname = firstname;
this.aware = aware;
}

    public String getFirstname() {
        return this.firstname;
    }

    public String getAware() {
        if(aware){
            return "je suis aware";
        }
        else return "je ne suis pas aware";
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

        public String whoAmI() {
        return "My name is " + this.getFirstname() + " et " + this.getAware();
    }


public static void classroom(){
    
}
}

