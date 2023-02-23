package Interfaces;

public class Main {
    /*
      * Tenemos qué el objeto cocheCRUD es de tipo interfaz (CocheCRUD) y es mediante esta relación
      * o inyección de dependencia, qué la clase Main.java se relaciona con la implementación
      * llamada CocheCRUDImpl en la cual se concrecionaron los métodos previamente declarados
      * en la interfaz.
    */
    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        System.out.println(cocheCRUD);
    }
}
