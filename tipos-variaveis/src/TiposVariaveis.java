public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        String cep = "21070333"; // Alterado para String para evitar problemas com zeros à esquerda
        String cpf = "98765432109"; // Alterado para String pelo mesmo motivo
        float pi = 3.14F;
        double salario = 1275.33;

        // Exibindo os valores
        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("CEP: " + cep);
        System.out.println("CPF: " + cpf);
        System.out.println("Pi: " + pi);
        System.out.println("Salário: " + salario);
    }
}
