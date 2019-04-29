package animales;


public  class Animal {
    private String color = "";
    public void duerme() {
    System.out.println("A dormir!");
    }
    public void come() {
    System.out.println("A comer!");
    }
    public int getNumeroPatas() {
   return 0;
    }
    public void setColor(String color) {
    this.color = color;
    }
    }