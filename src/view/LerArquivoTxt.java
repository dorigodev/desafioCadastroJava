package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoTxt {
    public static void leitor(String path){
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha="";

            while(linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao leiturar arquivo" + e.getMessage() );
        }
    }
}
