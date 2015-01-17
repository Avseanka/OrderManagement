/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Package;

import java.util.TreeMap;

/**
 * Clasa operator reprezinta persoana ce are grija de validarea comenzilor
 * Acesta mosteneste clasa User la fel ca Clientul
 *
 * @author Doru
 */
public class Operator extends User {

    private String nume;
    private int operatorId;
    private OPDept op;

    /**
     * Constructorul clasei Operator
     *
     * @param op obiectul de tip OPDept pentru a putea prin acesta efecftua
     * interogari asupra Warehousului
     * @param operatorId IDul unic a operatorului
     * @param nume Numele operatorului
     */
    public Operator(OPDept op, int operatorId, String nume) {
        super(op);
        this.op = op;
        this.operatorId = operatorId;
        this.nume = nume;
    }

    /**
     * Metoda seeOrders descrisa in OPDept
     *
     * @return COmenzile
     */
    public String seeOrders() {
        return op.seeOrders();
    }

    /**
     * Metoda confirm descrisa in OPDept
     *
     * @param id IDul comenzii
     */
    public void confirm(int id) {
        op.orderConfirmed(id);
    }

    /**
     * Metoda anulae descrisa in OPDept
     *
     * @param id IDul comenzii
     */
    public void anulare(int id) {
        op.anulare(id);
    }

    /**
     * Metoda folosita pentru validarea comenzilor, aceasta verifica daca
     * comanda este valida din punct de vedere al efectuarii, daca scotul
     * dispune de acest numar de produse, si de existenta clientului.
     */
    public void validareComenzi() {
        for (int i = 0; i < op.getSize(); i++) {
            if (op.getOrder(i).getStatus().equals("Pending")) {
                if (op.getOrder(i).getProdId() < 0 || op.getOrder(i).getProdId() > op.getWhSize()
                        || op.getOrder(i).getQuantity() > op.getQuantity(op.getOrder(i).getProdId())) {
                    anulare(i);
                } else {
                    confirm(i);
                }
            }
        }
    }

    /**
     * Metoda de restock, aceasta foloseste metoda statica underStock din Helper
     * pentru a vedea care produse anume trebuie comandate
     */
    public void restock() {
        int i = 0;
        String produs = "";
        String restock = Helper.underStock(op.getWh());
        while (i < restock.length()) {
            if (restock.substring(i, i + 1).equals("\n")) {
                for (int j = 0; j < op.getWhSize(); j++) {
                    if (produs.equals(op.getWh().getProductName(j))) {
                        op.getWh().setQuantity(j, op.getWh().getInitialQuantity(j));
                        produs = "";
                    }
                }
            } else {
                produs = produs + restock.substring(i, i + 1);
            }
            i++;
        }
    }

    public int getTotals() {
        return Helper.totals(op.getWh());
    }
}
