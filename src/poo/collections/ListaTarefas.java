package poo.collections;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> lista;

    public ListaTarefas() {
        this.lista = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        lista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        // lista para armazenar tarefas a serem removidas
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        // loop para percorrer lista de tarefas
        for(Tarefa t : lista) {
            // condicional para identificar elementos duplicados
            if(t.getDescricao().equalsIgnoreCase(descricao))
                tarefasParaRemover.add(t);
        }
        lista.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return lista.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(lista);
    }

    public static void main(String[] args) {
       ListaTarefas l01 = new ListaTarefas();

       System.out.println("NUM ELEMENTOS: " + l01.obterNumeroTotalTarefas());
       l01.adicionarTarefa("Tarefa 1");
       l01.adicionarTarefa("Tarefa 1");
       l01.adicionarTarefa("Tarefa 2");
       System.out.println("NUM ELEMENTOS: " + l01.obterNumeroTotalTarefas());
       l01.removerTarefa("Tarefa 1");
        System.out.println("NUM ELEMENTOS: " + l01.obterNumeroTotalTarefas());
        l01.obterDescricoesTarefas();


    }
}
