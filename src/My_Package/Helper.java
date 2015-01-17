/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Package;

/**
 * Clasa Helper , o clasa fara constrctor care are numai metode statice pentru a
 * nu fi initializat
 *
 * @author Doru
 */
public class Helper {

    /**
     * Metoda care ne da lista produselor subStock
     *
     * @param wh Obiectul de tip Warehouse, pentru a avea acces la stock
     * @return UnderStockul
     */
    public static String underStock(Warehouse wh) {
        String underStock = "";
        for (int i = 0; i < wh.getWhSize(); i++) {
            if (wh.getQuantity(i) < wh.getInitialQuantity(i) * 0.2) {
                underStock = underStock + wh.getProductName(i) + "\n";
            }
        }
        return underStock;
    }

    /**
     * Returneaza produsele peste 0,8* cantitatea initiala
     *
     * @param wh obiect de tip Warehouse
     * @return returneza overStockul
     */
    public static String overStock(Warehouse wh) {
        String overStock = "";
        for (int i = 0; i < wh.getWhSize(); i++) {
            if (wh.getQuantity(i) > wh.getInitialQuantity(i) * 0.8) {
                overStock = overStock + wh.getProductName(i) + "\n";
            }
        }
        return overStock;
    }

    /**
     * Filtru de preturi, afiseaza lista formata din produsele care intra in
     * intervalul dat
     *
     * @param wh obiect de tip Warehouse pentru a avea acces la stock
     * @param min Pret minim
     * @param max Pret maxim
     * @return returneaza Stringul cerut
     */
    public static String priceFilter(Warehouse wh, int min, int max) {
        String result = "";
        for (int i = 0; i < wh.getWhSize(); i++) {
            if (wh.getPrice(i) > min && wh.getPrice(i) < max) {
                result = result + wh.getProductName(i) + "\n";
            }
        }
        return result;
    }

    /**
     * Filtru pentru cantitate, afiseaza lista formata din produsele care se
     * incadreaza in intervalul dat
     *
     * @param wh obiect de tip Warehouse pentru a avea acces la stock
     * @param min cantitate minima
     * @param max cantitate maxima
     * @return Stringul cerut
     */
    public static String quantityFilter(Warehouse wh, int min, int max) {
        String result = "";
        for (int i = 0; i < wh.getWhSize(); i++) {
            if (wh.getQuantity(i) > min && wh.getQuantity(i) < max) {
                result = result + wh.getProductName(i) + "\n";
            }
        }
        return result;
    }

    /**
     * Metoda pentru calculul sumei tuturor produselor din stock
     *
     * @param wh obiect de tip Warehouse pentru a avea acces la stock
     * @return returneaza suma
     */
    public static int totals(Warehouse wh) {
        int rez = 0;
        for (int i = 0; i < wh.getWhSize(); i++) {
            rez = rez + wh.getQuantity(i);
        }
        return rez;
    }

}
