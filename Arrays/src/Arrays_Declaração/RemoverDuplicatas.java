package Arrays_Declaração;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoverDuplicatas {
    public static void main(String[] args) {
        // Exemplo de array original
        int[] arrayOriginal = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};

        // Lista para armazenar os elementos únicos
        ArrayList<Integer> elementosUnicos = new ArrayList<>();

        // Percorrer o array original
        for (int numero : arrayOriginal) {
            // Verificar se o número já não está na lista
            if (!elementosUnicos.contains(numero)) {
                elementosUnicos.add(numero);
            }
        }

        // Converter a lista de volta para um array
        int[] arraySemDuplicatas = new int[elementosUnicos.size()];
        for (int i = 0; i < elementosUnicos.size(); i++) {
            arraySemDuplicatas[i] = elementosUnicos.get(i);
        }

        // Exibir o novo array
        System.out.println("Array sem duplicatas: " + Arrays.toString(arraySemDuplicatas));
    }
}

