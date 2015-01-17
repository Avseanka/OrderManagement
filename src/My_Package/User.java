/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Package;

/**
 * Clasa User, mnetodele acesteia este mostenite in clasele Costumer sio
 * Operator
 *
 * @author Doru
 */
public class User {

    OPDept dept;

    /**
     * Constructorul clasei User, acesta primeste ca parametru:
     *
     * @param dept obiect de tiop OPDept
     */
    public User(OPDept dept) {
        this.dept = dept;
    }

    /**
     * Metoda viewStock care permite vizualizarea stockului.
     *
     * @return Stringul care contine Stockul
     */
    public String viewStock() {
        return dept.viewStock();
    }

    /**
     * Metoda viewDetails care permite vizualizarea informatiei detalizata a
     * unui produs
     *
     * @param id ID ul produsului
     * @return informatia detaliata
     */
    public String viewDetails(int id) {
        return dept.viewDetails(id);
    }
}
