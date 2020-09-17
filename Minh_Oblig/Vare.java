package oppgave2;

class Produkt {

    private String navn;
    private int antall;
    private double pris;

    public Produkt(String navn, int antall, double pris) {
        this.pris = pris;
        this.navn = navn;
        this.antall = antall;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAntall(String stringAntall) {
        try {
            antall = Integer.parseInt(stringAntall);
            if (antall < 0) {
                System.out.println("Feil oppstod, antall må være større enn 0");
                antall = 0;
            }
        } catch (Exception e) {
            antall = 0;
            System.out.println("Feil oppstod, antall ble ikke oppgitt");
        }
    }

    public void setPris(String stringPris) {
        try {
            antall = Integer.parseInt(stringPris);
            if (antall < 0) {
                System.out.println("Feil oppstod, pris må være større enn 0");
                antall = 0;
            }
        } catch (Exception e) {
            antall = 0;
            System.out.println("Feil oppstod, pris ble ikke oppgitt");
        }
    }


    public String getNavn() {
        return navn;
    }

    public int getAntall() {
        return antall;
    }

    public double getPris() {
        return pris;
    }

    public double totalPris() {
        double totalPris = antall * pris;
        String totPris = String.format("%.2f", totalPris);
        System.out.println("Totalpris: " + totPris);
        return totalPris;
    }

}

public class Vare {
    public static void main(String[] args) {

        Produkt vare1 = new Produkt("Eple", 10, 5.99);
        vare1.setAntall("-4");
        vare1.totalPris();

    }
}
