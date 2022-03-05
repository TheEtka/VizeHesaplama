public class Vize {

    private final String ders;
    private final double viz1;
    private final double viz2;
    private final double fin;

    public Vize(String ders, double viz1, double viz2, double fin) {
        this.ders = ders;
        this.viz1 = viz1;
        this.viz2 = viz2;
        this.fin = fin;
    }

    public void bilgiAl()
    {
        System.out.println("\nDers: " + ders);
        System.out.println("1.Vize: " + viz1);
        System.out.println("2.Vize: " + viz2);
        System.out.println("Final: " + fin);
    }

    public void ort()
    {
        double viz3 = (viz1 + viz2) / 2;
        double viz4 = (viz3 * 60) / 100;
        double fi = (fin * 40) / 100;
        double ortala = viz4 + fi;

        if (ortala >= 90)
        {
            String not = "AA";
            double deger = 4.00;
            String acıklama = "Mükemmel";

            System.out.println("\n***** ORTALAMA *****");
            System.out.println("Yüzlük Değer: " + ortala);
            System.out.println("Başarı Notu: " + not);
            System.out.println("Sayısal Değer: " + deger);
            System.out.println("Açıklama: " + acıklama);
        }
        else if (ortala >= 80)
        {
            String not = "BA";
            double deger = 3.50;
            String acıklama = "Pekiyi";

            System.out.println("***** ORTALAMA *****");
            System.out.println("Yüzlük Değer: " + ortala);
            System.out.println("Başarı Notu: " + not);
            System.out.println("Sayısal Değer: " + deger);
            System.out.println("Açıklama: " + acıklama);
        }
        else if (ortala >= 70)
        {
            String not = "BB";
            double deger = 3.00;
            String acıklama = "İyi";

            System.out.println("***** ORTALAMA *****");
            System.out.println("Yüzlük Değer: " + ortala);
            System.out.println("Başarı Notu: " + not);
            System.out.println("Sayısal Değer: " + deger);
            System.out.println("Açıklama: " + acıklama);
        }
        else if (ortala >= 60)
        {
            String not = "CB";
            double deger = 2.50;
            String acıklama = "Orta";

            System.out.println("***** ORTALAMA *****");
            System.out.println("Yüzlük Değer: " + ortala);
            System.out.println("Başarı Notu: " + not);
            System.out.println("Sayısal Değer: " + deger);
            System.out.println("Açıklama: " + acıklama);
        }
        else if (ortala >= 50)
        {
            String not = "CC";
            double deger = 2.00;
            String acıklama = "Yeterli";

            System.out.println("***** ORTALAMA *****");
            System.out.println("Yüzlük Değer: " + ortala);
            System.out.println("Başarı Notu: " + not);
            System.out.println("Sayısal Değer: " + deger);
            System.out.println("Açıklama: " + acıklama);
        }
        else if (ortala >= 40)
        {
            String not = "DC";
            double deger = 1.50;
            String acıklama = "Koşullu Başarılı";

            System.out.println("***** ORTALAMA *****");
            System.out.println("Yüzlük Değer: " + ortala);
            System.out.println("Başarı Notu: " + not);
            System.out.println("Sayısal Değer: " + deger);
            System.out.println("Açıklama: " + acıklama);
        }
        else if (ortala >= 30)
        {
            String not = "DD";
            double deger = 1.00;
            String acıklama = "Başarısız";

            System.out.println("***** ORTALAMA *****");
            System.out.println("Yüzlük Değer: " + ortala);
            System.out.println("Başarı Notu: " + not);
            System.out.println("Sayısal Değer: " + deger);
            System.out.println("Açıklama: " + acıklama);
        }
        else if (ortala >= 20)
        {
            String not = "FD";
            double deger = 0.50;
            String acıklama = "Başarısız";

            System.out.println("***** ORTALAMA *****");
            System.out.println("Yüzlük Değer: " + ortala);
            System.out.println("Başarı Notu: " + not);
            System.out.println("Sayısal Değer: " + deger);
            System.out.println("Açıklama: " + acıklama);
        }
        else if (ortala >= 0)
        {
            String not = "FF";
            double deger = 0.00;
            String acıklama = "Başarısız";

            System.out.println("***** ORTALAMA *****");
            System.out.println("Yüzlük Değer: " + ortala);
            System.out.println("Başarı Notu: " + not);
            System.out.println("Sayısal Değer: " + deger);
            System.out.println("Açıklama: " + acıklama);
        }
        else
        {
            System.out.println("HATA!");
        }
    }

}
