/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package binaryTree;

/**
 * @author kamaj
 */
public class Menu {

    public static void main(String[] args) {

//        printMenu();
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(27);
        tree.insert(17);
        // tree.insert(32);
        // tree.insert(29);
        // tree.insert(26);
        // tree.insert(22);
        tree.insert(15);
        tree.insert(12);


        // tree.inOrder();
        System.out.println();
        // tree.delete(20);
        System.out.println();
        tree.inOrder();

    }

    private static void printMenu() {
        char select;
        Tree tree = new Tree();
        String data;
        do {

            System.out.println("\n\t\t\t1. Lisää avain.");
            System.out.println("\t\t\t2. Etsi avaimella.");
            System.out.println("\t\t\t3. Käy puu läpi esijärjestyksessä.");
            System.out.println("\t\t\t4. lopetus ");
            System.out.print("\n\n"); // tehdään tyhjiä rivejä
            select = Lue.merkki();
            switch (select) {
                case '1':
                    System.out.println("Anna uusi avain (merkkijono)");
                    data = new String(Lue.rivi());
                    tree.insert(Integer.parseInt(data));
                    break;
                case '2':
                    System.out.println("Anna etsittävä avain (merkkijono)");
                    data = Lue.rivi();
                    if (tree.get(Integer.parseInt(data)) != null)
                        System.out.println("Avain löytyi.");
                    else
                        System.out.println("Avainta ei löytynyt.");
                    break;
                case '3':
                    tree.inOrder();
                    char h = Lue.merkki(); // pysäytetään kontrolli
                    break;
                case '4':
                    break;
            }
        }
        while (select != '4');
    }
}

