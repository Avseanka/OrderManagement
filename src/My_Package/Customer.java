/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Package;

import java.util.ArrayList;

/**
 * Clasa client, mosteneste impreuna cu clasa operator User.
 *
 * @author Doru
 */
public class Customer extends User {

    private ArrayList<Product> produseCumparate = new ArrayList();
    private int customerId;
    private String nume;
    private OPDept op;

    /**
     * Constructorul clasei customer
     *
     * @param op obiect de tip OPDept
     * @param customerId ID-ul clientului
     * @param nume Numele acestuia
     */
    public Customer(OPDept op, int customerId, String nume) {
        super(op);
        this.op = op;
        this.customerId = customerId;
        this.nume = nume;
    }

    /**
     * Metoda plaseaza comanda facuta de client in OPDept
     *
     * @param id ID-ul oomenzii
     * @param quantity cantitatea produselor comandate
     */
    public void placeOrder(int id, int quantity) {
        Order o = new Order(id, customerId, quantity);
        op.placeOrder(o);
    }

    /**
     * Metoda anuleaza o comanda facuta, in cazul in care aceasta nu a fost
     * confirmata de operator
     *
     * @param orderId ID-ul comenzii
     */
    public void anulateOrder(int orderId) {
        op.anulateOrder(customerId, orderId);
    }

    /**
     * Metoda modifica cantitatea propdusului comandat
     *
     * @param orderId ID-ul comenzii
     * @param quantity Cantitatea noua
     */
    public void modifyOrder(int orderId, int quantity) {
        op.modifyOrder(customerId, orderId, quantity);
    }

    /**
     * In cazul in care comanda este confirmata, produsul este cumparat de
     * client, si este adaugat in lista produselor cumparate de el.
     *
     * @param p obiectul cumparat de tip Produs
     */
    public void buy(Product p) {
        produseCumparate.add(p);
    }

    /**
     * Afiseaza produsele din lista produselor cumparate de client
     *
     * @return un String cu lista
     */
    public String propduseCumparate() {
        String prod = "";
        for (int i = 0; i < produseCumparate.size(); i++) {
            prod = prod + produseCumparate.get(i).getName() + "\n";
        }
        return prod;
    }

    /**
     * Getter pentru ID-ul clientului
     *
     * @return customer ID
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Metoda afiseaza comenzile facute de client
     *
     * @return returneaza Stringul format din comenzile sale
     */
    public String seeClientOrders() {
        return op.seeClientOrders(customerId);
    }

    /**
     * Filtru de preturi, afiseaza lista formata din produsele care intra in
     * intervalul dat
     *
     * @param min Pret minim
     * @param max Pret maxim
     * @return returneaza Stringul cerut
     */
    public String priceFilter(int min, int max) {
        return Helper.priceFilter(op.getWh(), min, max);
    }

    /**
     * Filtru pentru cantitate, afiseaza lista formata din produsele care se
     * incadreaza in intervalul dat
     *
     * @param min cantitate minima
     * @param max cantitate maxima
     * @return Stringul cerut
     */
    public String quantityFilter(int min, int max) {
        return Helper.quantityFilter(op.getWh(), min, max);
    }
}
