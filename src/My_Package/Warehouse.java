/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Package;

/**
 * Clasa Warehouse reprezinta Stockul. Acesta este reprezentat de un TreeMap
 * care implementeaza arbore binar de cautare. In el sunt asezate obiecte de tip
 * Product cu cheia: un intreg.
 *
 * @author Doru
 */
import java.util.*;

public class Warehouse {

    TreeMap<Integer, Product> Wh = new TreeMap<>();

    /**
     * Constructorul clasei Warehouse
     */
    public Warehouse() {

    }

    /**
     * Metoda care genereaza produse in stock pentru a usura munca
     */
    public void generateWarehouse() {
        int i = 0;
        Wh.put(i, new Product("Laptop", 23, 4000));
        i++;
        Wh.put(i, new Product("Tastatura", 140, 400));
        i++;
        Wh.put(i, new Product("Cooler", 300, 50));
        i++;
        Wh.put(i, new Product("Mouse", 600, 18));
        i++;
        Wh.put(i, new Product("Boxe", 90, 340));
        i++;
        Wh.put(i, new Product("MasaPC", 50, 600));
        i++;
        Wh.put(i, new Product("Stationar", 80, 3000));
        i++;
    }

    /**
     * Metoda care returneaza continutul stocului
     *
     * @return Stringul cu cdatele din stoc
     */
    public String getStock() {
        String stock = "";
        for (int i = 0; i < Wh.size(); i++) {
            stock = stock + i + ". " + Wh.get(i).getName() + "\n";
        }
        return stock;
    }

    /**
     * Modifica continutul stocului in urma confirmarii comenzii, scade din
     * continut produsele cuparate
     *
     * @param quantity cantitatea care urmeaza sa fie scazuta
     * @param id IDul produsului conandat
     */
    public void orderConfirmed(int quantity, int id) {
        Wh.get(id).setQuantity(Wh.get(id).getQuantity() - quantity);
    }

    /**
     * Returneaza Stringul cu informatia detaliata a unui produs
     *
     * @param id IDul produsului
     * @return Strngul cu informatia detaliata
     */
    public String viewDetails(int id) {
        return "Produs: " + Wh.get(id).getName() + "   Price: " + Wh.get(id).getPrice() + "   Quantity: " + Wh.get(id).getQuantity();
    }

    /**
     * Getter pentru cantitatea produsului in stock
     *
     * @param produs produsul intrebat
     * @return cantitatea
     */
    public int getQuantity(int produs) {
        return Wh.get(produs).getQuantity();
    }

    /**
     * Getter pentru pret
     *
     * @param produs produsul intrebat
     * @return
     */
    public int getPrice(int produs) {
        return Wh.get(produs).getPrice();
    }

    /**
     * Getter pentru marimea stocului
     *
     * @return marimea
     */
    public int getWhSize() {
        return Wh.size();
    }

    /**
     * Adauga un produs in stock
     *
     * @param p produsul adaugat
     */
    public void addProduct(Product p) {
        Wh.put(Wh.size(), p);
    }

    /**
     * Getter pentru obiectul de tip produs din stock
     *
     * @param id IDul produsului cautat
     * @return Produsul
     */
    public Product getProduct(int id) {
        return Wh.get(id);
    }

    /**
     * Getter pentru cantitatea initiala
     *
     * @param produs produsul cautat
     * @return cantitatea
     */
    public int getInitialQuantity(int produs) {
        return Wh.get(produs).getInitialQuantity();
    }

    /**
     * Getter pentru numele produsului
     *
     * @param produs produsul cautat
     * @return Numele produsului
     */
    public String getProductName(int produs) {
        return Wh.get(produs).getName();
    }

    /**
     * Setter pentru cantitatea produsului din stock
     *
     * @param produs IDul produsului
     * @param quantity cantitatea noua
     */
    public void setQuantity(int produs, int quantity) {
        Wh.get(produs).setQuantity(quantity);
    }
}
