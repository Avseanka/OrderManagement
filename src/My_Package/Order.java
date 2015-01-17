/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Package;

/**
 * Clasa Order, obiectele acestei clase sunt folosite pentru a reprezenta
 * comenzile efectuate de clienti. Acestea sunt stocate in OPDept intr-un arbore
 * binar de cautare.
 *
 * @author Doru
 */
public class Order {

    private int prodId;
    private int clientId;
    private int quantity;
    private String status = "Pending";

    /**
     * \
     * Constructorul clasei Order. acesta cuprinde:
     *
     * @param prodId IDul produsului
     * @param clientId IDul clientului
     * @param quantity Cantitatea produsului comandat
     */
    public Order(int prodId, int clientId, int quantity) {
        this.prodId = prodId;
        this.clientId = clientId;
        this.quantity = quantity;
    }

    /**
     * Getter pentru IDul produsului
     *
     * @return IDul produsului
     */
    public int getProdId() {
        return prodId;
    }

    /**
     * Getter pentru IDul clientului
     *
     * @return IDul clientului
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Getter pentru cantitatea produslui comandat
     *
     * @return cantitatea
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter pentru cantitate, pentru modificarea acesteia
     *
     * @param newQuantity valoarea noua a cantitatii
     */
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    /**
     * Getter pentru statulul comenzii, fie este aceasta anulata confirmata sau
     * inca urmeaza a fi verificata
     *
     * @return statutul
     */
    public String getStatus() {
        return status;
    }

    /**
     * Metoda pentru setarea statutului comenzii la COnfirmata
     */
    public void confirm() {
        status = "Confirmed";
    }

    /**
     * Metoda pentru setarea statutului comenzii la Anulata
     */
    public void anulare() {
        status = "Anulated";
    }

}
