import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {
        String kullaniciAdi, sifre;
        int miktar;
        double bakiye = 500;
        int right = 3;
        while (right>0){
            Scanner input = new Scanner(System.in);
            System.out.print("Lutfen Kullanici adinizi giriniz: ");
            kullaniciAdi = input.nextLine();
            System.out.print("Lutfen şifrenizi giriniz: ");
            sifre = input.nextLine();

            if(kullaniciAdi.equals("thalera") && sifre.equals("sifre123")){

                System.out.println("Tebrikler basari ile giris yaptiniz thalera!");
                System.out.println("Yapmak istediginiz islemi lutfen soyleyiniz:\n 1- Para çekme \n 2- Para Yatırma \n 3- Çıkış Yapma");
                int secim = input.nextInt();
                if(secim==1){
                    System.out.println("Bakiyeniz " + bakiye + "TL'dir, Lutfen cekmek istediginiz miktarı giriniz: ");
                    miktar = input.nextInt();
                    if(miktar>bakiye){
                        System.out.println("Cekmek istediginiz tutar toplam bakiyenizden büyük bir tutar");
                    }
                    else{
                    bakiye -= miktar;
                    System.out.println("Guzel gunlerde harcayiniz. Kalan Bakiye: "+bakiye+"TL'dir.");}
                }
                else if(secim==2){
                    System.out.println("Lutfen yatirmak istediginiz miktarı giriniz: ");
                    miktar = input.nextInt();
                    bakiye +=miktar;
                    System.out.println("Isleminiz basari ile tamamlanmıştır. Yeni bakiyeniz: "+bakiye+"TL'dir.");
                }
                else if(secim==3){
                    System.out.println("Bankamizi tercih ettiginiz için teşekkür ederiz: ");
                    System.exit(0);
                }
                else
                    System.out.println("Belirtilen numara aralığında seçim yapmadınız");
                System.exit(0);
            }

            else{
                right--;
                System.out.print("Hatali kullanici adı veya şifre girdiniz lütfen tekrar deneyiniz: ");
                if(right==0){
                    System.out.println("3 veya daha fazla giriş yaptınız hesabınız bloke olmuştur");
                }
                else{
                    System.out.println("Kalan giriş hakkınız: "+right);
                }
            }

        }
    }
    }

