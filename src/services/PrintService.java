package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    // Criar lista usando um tipo genérico
    List<Integer> list = new ArrayList<>();

    public void addValue(Integer value) {
        list.add(value); //adicionando elementos a lista
    }

    public Object first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);// pegar o primeiro elemento da lista
    }

    public void print() {
        System.out.print("[");
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));

        }
        System.out.println(" ]");
    }
}
