
package Bai_6;

public class Dictionary{
    private String vn, en;
    
    public Dictionary(){
    }

    public Dictionary(String en, String vn) {
        this.vn = vn;
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }
    

    @Override
    public String toString() {
        return en + " - " + vn;
    }
    
    
}
