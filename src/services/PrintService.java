package services;

import java.util.ArrayList;
import java.util.List;

// Para que eu possa adicionar qualquer tipo de elemento a minha lista: "int, double, string, etc"
// implementar a classe como genérica <T>
// O <T> é um alias, poderia ser outra letra ou palavra ex. <TYPE>

public class PrintService<T> {
    // Criar lista usando um tipo genérico
    //List<Integer> list = new ArrayList<>();
    List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value); //adicionando elementos a lista
    }

    public T first() {
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
