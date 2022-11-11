package hafta6Lab;

import java.util.HashMap;
import java.util.Scanner;

public class AnketHashMap {

	public static void main(String[] args) {
		HashMap<String,Double> soru=new HashMap<String,Double>();
		Scanner input= new Scanner(System.in);
		double s1=0,s2=0,s3=0,s4=0,s5=0;
		System.out.println(" Sorulara 1-10 arasi deger veriniz:");
		
		
		int cntrl=1;
		double puan=0;
		int kisisayisi=0;
	
		
		while(cntrl==1) {
			 kisisayisi++;
			 
			 while(puan<=0 || puan>10) {
				 System.out.println("1- Kadin haklari: ");
				 puan=input.nextDouble();
				 
			 }
			 s1+=puan;
			 puan=0;
			 
			 while (puan<=0|| puan>10 ) {
				 System.out.println("2- Gida Krizi: ");
				 puan=input.nextDouble();
				 }
			 s2+=puan;
			 puan=0;
			 
			 while (puan<=0|| puan>10 ) {
				 System.out.println("3- Sürdürülebilirlik: ");
				 puan=input.nextDouble();
				 }
			 s3+=puan;
			 puan=0;
			 
			 while (puan<=0|| puan>10 ) {
				 System.out.println("4- Tarim: ");
				 puan=input.nextDouble();
				 }
			 s4+=puan;
			 puan=0;
			 while (puan<=0|| puan>10 ) {
			 System.out.println("5-Sehirlesme: ");
			 puan=input.nextDouble();
			}
			 s5+=puan; 
			 puan=0;
			 
			 System.out.println("Devam---1 bitiş---2");
			 
		}
		soru.put("1- Kadin haklari", s1);
		soru.put("2- Gida krizi", s2);
		soru.put("3- Kadin haklari", s3);
		soru.put("4- Kadin haklari", s4);
		soru.put("5- Kadin haklari", s5);
		for(String i:soru.keySet()) {
			System.out.println("key: "+ i+ " Value :"+soru.get(i));
		}
		HashMap<String,Double> ortalama=new HashMap<String,Double>();
		
		ortalama.put("Ekonomi",(double) (s1/kisisayisi));
		ortalama.put("Ekonomi",(double) (s2/kisisayisi));
		ortalama.put("Ekonomi",(double) (s3/kisisayisi));
		ortalama.put("Ekonomi",(double) (s4/kisisayisi));
		ortalama.put("Ekonomi",(double) (s5/kisisayisi));
		 for(String i:ortalama.keySet()) {
			 System.out.println("key: "+ i+ " Value :"+ortalama.get(i));
		 }
		
		}
	}


