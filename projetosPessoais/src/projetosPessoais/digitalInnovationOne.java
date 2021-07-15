package projetosPessoais;

import java.io.BufferedReader;
import java.io.InputStreamReader;


		//DESAFIO 1

public class digitalInnovationOne {
    public static void main(String[] args) throws Exception{
        int contagem = 0;
        
        BufferedReader val = new BufferedReader(new InputStreamReader(System.in));
        double[] num = new double[6];

        for (int i = 0; i < num.length; i++) {
            num[i] = Double.parseDouble(val.readLine());
            if (num[i] > 0) {
                contagem++;
            } 
            
        }
            System.out.println(contagem + " valores positivos");
        
    }
}
