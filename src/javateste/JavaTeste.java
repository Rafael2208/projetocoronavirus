
package javateste;


import java.text.NumberFormat;
import java.util.*;

        
public class JavaTeste {

    
public static void main(String[] args) {
       
Scanner ler = new Scanner(System.in);
Locale localeBr = new Locale("pt","BR");
NumberFormat inteiro = NumberFormat.getInstance();

// Variaveis
int porcentagemDaRegiao = 0;
int calculo = 0;
String casosNoBrasil = "2859073";
String SP = "585265" , CE = "181443" , BA = "179737" , RJ = "172679" ,
PA = "160695" , MG = "139661" , MA = "125459" ,DF = "115966" , AM = "104250", 
PE = "100321" , SC = "95410", ES = "87242" , PB = "87071" , PR = "85317" , 
GO = "76605" , RS = "76563" , AL = "64194" , SE = "61986" , MT = "58506" ,
PI = "55919" , RN = "53490" , RO = "42020" , AP = "37318" , RR = "34296" , 
MS = "28315" , TO = "28312" , AC = "21033" ;

// Convertendo String para inteiro
int brasilTotal = Integer.parseInt( casosNoBrasil);
int sp = Integer.parseInt( SP ), ce = Integer.parseInt( CE ), ba = Integer.parseInt( BA ),
   rj = Integer.parseInt( RJ ) , pa = Integer.parseInt( PA ) ,mg = Integer.parseInt( MG ),
   df = Integer.parseInt( DF ), am = Integer.parseInt( AM ) , pe = Integer.parseInt( PE ),
   sc = Integer.parseInt( SC ), es = Integer.parseInt( ES ),pb = Integer.parseInt( PB ), 
   pr = Integer.parseInt( PR ) , go = Integer.parseInt( GO ) ,rs = Integer.parseInt( RS ),
   al = Integer.parseInt( AL ),se = Integer.parseInt( SE ) , mt = Integer.parseInt( MT ), 
   pi = Integer.parseInt( PI ) ,rn = Integer.parseInt( RN ) ,ro = Integer.parseInt( RO ),
   ap = Integer.parseInt( AP ),rr = Integer.parseInt( RR ), ms = Integer.parseInt( MS ) , 
   to = Integer.parseInt( TO ) ,ac = Integer.parseInt( AC ), ma = Integer.parseInt( MA );

// início do programa 

System.out.println("Programa de Calculo"
        + " de Coronavírus nas Regiões do Brasil - ");
System.out.println("Digite o UF da Região em letras maiúsculas que deseja saber - ex: SP -");
//leitura do valor
 String uf = ler.nextLine();


//Processamento

switch(uf){

        case "SP":
            calculo = (sp * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos em São Paulo: "+inteiro.format(sp));
            break;

        case "CE":
            calculo = (ce * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Ceará: "+inteiro.format(ce));
            break;
        case "BA":
            calculo = (ba * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos na Bahia: "+inteiro.format(ba));
            break;
        case "RJ":
            calculo = (rj * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Rio de Janeiro: "+inteiro.format(rj));
            break;
        case "PA":
            calculo = (pa * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Pará: "+inteiro.format(pa));
            break;
        case "MG":
            calculo = (mg * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos em Minas Gerais: "+inteiro.format(mg));
            break;
        case "MA":
            calculo = (ma * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Maranhão: "+inteiro.format(ma));
            break;
        case "DF":
            calculo = (df * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Distrito Federal: "+inteiro.format(df));
            break;
        case "AM":
            calculo = (am * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Amazonas: "+inteiro.format(am));
            break;
        case "PE":
            calculo = (pe * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Pernambuco: "+inteiro.format(pe));
            break;
        case "SC":
            calculo = (sc * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos em Santa Catarina: "+inteiro.format(sc));
            break;
        case "ES":
            calculo = (es * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Espírito Santo: "+inteiro.format(es));
            break;
        case "PB":
            calculo = (pb * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos na Paraíba: "+inteiro.format(pb));
            break;
        case "PR":
            calculo = (pr * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Paraná: "+inteiro.format(pr));
            break;
        case "GO":
            calculo = (go * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos em Goiás: "+inteiro.format(go));
            break;
        case "RS":
            calculo = (rs * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Rio Grande do Sul: "+inteiro.format(rs));
            break;
        case "AL":
            calculo = (al * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos em Alagoas : "+inteiro.format(al));
            break;
        case "SE":
            calculo = (se * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos em Sergipe: "+inteiro.format(se));
            break;
        case "MT":
            calculo = (mt * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Mato Grosso: "+inteiro.format(mt));
            break;
        case "PI":
            calculo = (pi * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Piauí: "+inteiro.format(pi));
            break;
        case "RN":
            calculo = (rn * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Rio Grande do Norte: "+inteiro.format(rn));
            break;
        case "RO":
            calculo = (ro * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos em Rondônia: "+inteiro.format(ro));
            break;
        case "AP":
            calculo = (ap * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Amapá: "+inteiro.format(ap));
            break;
        case "RR":
            calculo = (rr * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos em Roraima: "+inteiro.format(rr));
            break;
        case "MS":
            calculo = (ms * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos em Mato Grosso do Sul: "+inteiro.format(ms));
            break;
        case "TO":
            calculo = (to * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos em Tocantins: "+inteiro.format(to));
            break;
        case "AC":
            calculo = (ac * 100)/brasilTotal;
            
            //saída
            System.out.println("Casos no Acre: "+inteiro.format(ac));
            break;
        default:
            //caso não for nenhum desses casos
           //saída
            System.out.println("Erro, entre com outro valor!");

}



//saída
System.out.println("Número Total de Casos no Brasil: "+inteiro.format(brasilTotal));
System.out.println("Percentual na UF escolhida: "+inteiro.format(calculo)+ "%");


 }
}

    
    

