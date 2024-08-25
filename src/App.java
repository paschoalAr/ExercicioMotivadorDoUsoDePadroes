import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);

        System.out.println("Tipos de veiculos:");
        System.out.println(basico);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);


        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);

        System.out.println("\nTipos de veiculos:");
        System.out.println(esportivo);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        esportivo.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(esportivo);
        System.out.println("\nViajando com o carro basico");
        esportivo.viaja(250);
        esportivo.viaja(150);
        System.out.println(esportivo);

        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL, 5, 70);

        System.out.println("\nTipos de veiculos:");
        System.out.println(utilitario);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        utilitario.abastece(TipoCombustivel.DIESEL, 70);
        System.out.println(utilitario);
        System.out.println("\nViajando com o carro basico");
        utilitario.viaja(250);
        utilitario.viaja(150);
        System.out.println(utilitario);

        Carro suv = new Carro("SUV", TipoCombustivel.FLEX, 8, 55);

        System.out.println("\nTipos de veiculos:");
        System.out.println(suv);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        suv.abastece(TipoCombustivel.FLEX, 55);
        System.out.println(suv);
        System.out.println("\nViajando com o carro basico");
        suv.viaja(250);
        suv.viaja(150);
        System.out.println(suv);

        Map<TipoCombustivel, Integer> consumo = new HashMap<>();
        consumo.put(TipoCombustivel.FLEXALCOOL, 6);
        consumo.put(TipoCombustivel.FLEXGASOLINA, 8);

        CarroFlex suvFlex = new CarroFlex("Suv Flex", TipoCombustivel.FLEXGASOLINA, consumo, 65);

        System.out.println("\nTipos de veiculos:");
        System.out.println(suvFlex);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        suvFlex.abastece(TipoCombustivel.FLEXGASOLINA, 55);
        System.out.println(suvFlex);
        System.out.println("\nViajando com o carro basico");
        suvFlex.viaja(250);
        suvFlex.viaja(150);
        System.out.println(suvFlex);

        Carro econo = new Carro("Econo", TipoCombustivel.GASOLINA, 20, 55);

        System.out.println("\nTipos de veiculos:");
        System.out.println(econo);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        econo.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(econo);
        System.out.println("\nViajando com o carro basico");
        for(int i = 0; i < 89;i++){
            econo.viaja(550);
            econo.abastece(TipoCombustivel.GASOLINA, 55);
        }
        System.out.println(econo);


    }
}
