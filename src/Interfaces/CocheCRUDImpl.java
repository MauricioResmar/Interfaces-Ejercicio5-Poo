package Interfaces;

public class CocheCRUDImpl implements CocheCRUD {

    // Atributos:
    String save = "Guardando";
    String findAll = "Buscar todo";
    String delete = "Borrando";


    // Metodos implementados por guía de la interface:
    @Override
    public void save() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

    }

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }

}
