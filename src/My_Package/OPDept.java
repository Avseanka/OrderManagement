/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Package;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Clasa OPDept Order Department Reprezinta mecanismul de plasare, prelucrare si
 * indeplinire a comenazilor, dar si ceea ce duce spre plasarea lor, afisarea
 * stockului, detaliilor, pentru a nu oferi operatorilor si clientilor acces in
 * Stock
 *
 * @author Doru
 */
public class OPDept {

    Warehouse wh;
    TreeMap<Integer, Order> orders = new TreeMap<>();
    ArrayList<Customer> clientList = new ArrayList();
    private int nrOrders = 0;

    /**
     * Constructorul clasei OPDept
     *
     * @param wh Obiect de tip Warehouse pentru a primi acces la Stock si a face
     * verificarile cerute
     */
    public OPDept(Warehouse wh) {
        this.wh = wh;
    }

    /**
     * Metoda afiseaza continutul stockului
     *
     * @return Stringul format din continutul stockului
     */
    public String viewStock() {
        return wh.getStock();
    }

    /**
     * Metoda plaseaza o comanda in arberele binar de cautare de la baza
     * Operadorului de comenzi
     *
     * @param ord obiect de tip Order
     */
    public void placeOrder(Order ord) {
        orders.put(nrOrders, ord);
        nrOrders++;
    }

    /**
     * Metoda permite operatorului sa vizualizeze comenzile
     *
     * @return Stringul
     */
    public String seeOrders() {
        String orderList = "";
        for (int i = 0; i < nrOrders; i++) {
            orderList = orderList + "Order ID: " + i + "   Client ID: " + orders.get(i).getClientId() + "   ProductID: " + orders.get(i).getProdId() + "   Quantity: " + orders.get(i).getQuantity() + "  Status: " + orders.get(i).getStatus() + "\n";
        }
        return orderList;
    }

    /**
     * In cazul in care operatorul confirma comanda, aceasta este scoasa din
     * stock, iar clientul primeste produsul in lista sa de produse
     *
     * @param id ID-ul orderului confirmat
     */
    public void orderConfirmed(int id) {
        orders.get(id).confirm();
        for (int i = 0; i < clientList.size(); i++) {
            if (clientList.get(i).getCustomerId() == orders.get(id).getClientId()) {
                clientList.get(i).buy(wh.getProduct(orders.get(id).getProdId()));
            }
        }
        wh.orderConfirmed(orders.get(id).getQuantity(), orders.get(id).getProdId());
    }

    /**
     * Anuleaza comanda cu ID-ul id
     *
     * @param id ID-ul comnenzii
     */
    public void anulare(int id) {
        orders.get(id).anulare();
    }

    /**
     * Permite vizualizarea detaliilor unui produs
     *
     * @param id IDul produsului
     * @return Detaliile
     */
    public String viewDetails(int id) {
        return wh.viewDetails(id);
    }

    /**
     * Returneaza obiectul de tip comanda cu chea i
     *
     * @param i cheia comnenzii
     * @return comanda
     */
    public Order getOrder(int i) {
        return orders.get(i);
    }

    /**
     * Metoda returneaza marimea arborelui care pastreaza comenzile
     *
     * @return marimea
     */
    public int getSize() {
        return orders.size();
    }

    /**
     * Returneaza cantitatea produsului primit ca parametru
     *
     * @param produs obiect de tip produs
     * @return cantitatea
     */
    public int getQuantity(int produs) {
        return wh.getQuantity(produs);
    }

    /**
     * Metoda returneaza marimea stockului
     *
     * @return Marimeqa
     */
    public int getWhSize() {
        return wh.getWhSize();
    }

    /**
     * Metoda returneaza obiectuld e tip Warehouse care reprezinta stockul
     *
     * @return obiect de tip Warehouse
     */
    public Warehouse getWh() {
        return wh;
    }

    /**
     * Metoda anuleaza o cumanda bazata pe IDul produsului si a clientului
     *
     * @param id IDul clientului
     * @param prodId IDul produsului
     */
    public void anulateOrder(int id, int prodId) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getClientId() == id && orders.get(i).getStatus().equals("Pending") && orders.get(i).getProdId() == prodId) {
                orders.get(i).anulare();
            }
        }
    }

    /**
     * Metoda modifica o comanda prin modificarea cantitatii produsului comandat
     *
     * @param id ID-ul clientului
     * @param prodId ID-ul produsului
     * @param quantity cantitatea noua
     */
    public void modifyOrder(int id, int prodId, int quantity) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getClientId() == id && orders.get(i).getStatus().equals("Pending") && orders.get(i).getProdId() == prodId) {
                orders.get(i).setQuantity(quantity);
            }
        }
    }

    /**
     * Adauga clientul intr-un ArrayList pentru a avea instantele clientilor
     * folositi pemntru a adauga comenzi
     *
     * @param c obiectul de tip client
     */
    public void intregistrareClient(Customer c) {
        clientList.add(c);
    }

    /**
     * Metoda ne returneaza mun String cu toate comenzile unui client a carui ID
     * este primit ca parametru
     *
     * @param id IDul clientului
     * @return comenzile acestuia
     */
    public String seeClientOrders(int id) {
        String order = "";
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getClientId() == id) {
                order = order + orders.get(i).getProdId() + "   " + wh.getProductName(orders.get(i).getProdId()) + "  " + orders.get(i).getQuantity() + "   " + orders.get(i).getStatus() + "\n";
            }
        }
        return order;
    }

}
