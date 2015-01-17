/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Package;

/**
 * Clasa Product reprezinta toate produsele aflate in stoc in clasa Warehouse
 *
 * @author Doru
 */
public class Product {

    private String name;
    private int quantity;
    private int initialQuantity;
    private int price;

    /**
     * Constructorul clasei Product, acesta include:
     *
     * @param name Numele produsului
     * @param quantity CVantitatea acestuia
     * @param price Pretul
     */
    public Product(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        initialQuantity = quantity;
        this.price = price;
    }

    /**
     * Getter pentru numele produsului
     *
     * @return Numle
     */
    public String getName() {
        return name;
    }

    /**
     * Getter pentru pretul produsului
     *
     * @return Pretul
     */
    public int getPrice() {
        return price;
    }

    /**
     * Getter pentru cantitatea produsului in stock
     *
     * @return cantitatea
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Getter pentru cantitatea initiala a produsului in stock
     *
     * @return cantitatea initiala
     */
    public int getInitialQuantity() {
        return initialQuantity;
    }

    /**
     * Setter pentru cantitatea produsului
     *
     * @param newQuantity cantitatea noua
     */
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }
}
