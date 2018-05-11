/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.*;

import static pl.edu.ur.oopl9.Zadanie_1.losowanie;

/**
 *
 * @author maarchyl
 */
public class Main {


    public static void main(String[] args) {
            Random rand = new Random();
            int[] zad_1 = new int[100];


            // Arrays.sort();



//   //Zadanie 1

//        losowanie(zad_1);
//
//       System.out.println("");
//       Arrays.sort(losowanie(zad_1));
//       System.out.println("");
//
//       for(int i =0; i<100;i++){
//           System.out.println(zad_1[i]);
//       }


//       Zadanie 2

//            TreeSet<Integer> zad_2 = new TreeSet<Integer>();
//            for(int k =0;k<100;k++){
//                zad_2.add(k);
//            }
//
//            Iterator iter = zad_2.iterator();
//            while (iter.hasNext()) {
//                System.out.println(iter.next());
//            }
//
//            //ZaDANIE 3
//
//
//            Auta audi = new Auta ("Audi" , 2018);
//            Auta bmw = new Auta ("BMW" , 1995);
//            Auta mers = new Auta ("Mers" , 2014);
//
//            ArrayList<Auta> auta = new ArrayList<Auta>();
//            auta.add(audi);
//            auta.add(bmw);
//            auta.add(mers);


        //Zadanie 4

        Scanner sc = new Scanner(System.in);

        Tlumacz BD = new Tlumacz(1);


        BD.pod_danych();
        BD.odpowiedz();
    }
    
}
