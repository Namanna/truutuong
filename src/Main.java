/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lenovo
 */
public class Main {
    
         public static void main(String[] args) {
        // TODO code application logic here
        Square sq = new Square(7.0,3.0,3.0);
        Round rd = new Round(1, 2, 3);
        System.out.println("Square's Square: ");
        System.out.println(sq.getArea());
        System.out.println("Round's Square: ");
        System.out.println(rd.getArea());
    }
       
}
/*d lop dong vat co t tinh ten va t tinh so chan cp phuong thuc truu tuong la lay ten va lay so chan.
XD 3 lop con: lop ca kt tu lop dong vat, lop meo kt tu dong vat, lop ga kt tu lop dv.*/