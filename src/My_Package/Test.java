/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Package;

/**
 *
 * @author Doru
 */
public class Test {

    public static void main(String Args[]) {

        // o.restock();
//        System.out.println(o.viewDetails(0));
//        System.out.println(o.viewDetails(1));
//        System.out.println(o.viewDetails(2));
//        System.out.println(o.viewDetails(3));
//        System.out.println(o.viewDetails(4));
//        System.out.println(o.viewDetails(5));
//        System.out.println(o.viewDetails(5));
        System.out.println("seeClientOrders");
        Warehouse wh = new Warehouse();
        wh.generateWarehouse();
        OPDept op = new OPDept(wh);
        Customer instance = new Customer(op, 2, "Ashot");
        Customer instance2 = new Customer(op, 12, "Anton");
        instance.placeOrder(4, 66);
        instance.placeOrder(1, 26);
        instance2.placeOrder(1, 6);
        instance2.placeOrder(2, 16);

        String expResult = "";
        String result = instance2.seeClientOrders();
        System.out.println(result);
        // c.placeOrder(3,550);
        //c.placeOrder(2,280);
        //o.validareComenzi();
    }

}
