public class Car {

    private String marka;
    private String kolor;
    private int rokProdukcji;

    public Car(String marka, String kolor, int rokProdukcji) {
        this.marka = marka;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
    }

    public Car(){}


    public String toString(){
        return "Samochod, marka: "+marka+" kolor: "+kolor+" rok produkcji: "+rokProdukcji+"";
    }

    public String getKolor(){
        return kolor;
    }

    public void setKolor(String kolor){
        this.kolor=kolor;
    }
}

