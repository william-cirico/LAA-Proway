import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        String[][] funcionarios = new String[5][11];
        Scanner input = new Scanner(System.in);
        int quantidadeFuncionarios = 0;

        // Limite de 5 funcionários.
        loopExterno: while (true) {
            System.out.println(
                    "Sistema de Cadastro de Funcionários\n1) Cadastrar funcionário\n2) Listar funcionários\n3) Listar funcionário pelo nome\n4) Remover funcionário\n 0) Sair");
            int opcao = input.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Finalizando o programa!");
                    break loopExterno;
                case 1:
                    // Limpando o scanner
                    input = new Scanner(System.in);

                    // Flag para cadastro inválido
                    boolean invalido = false;

                    // Cadastradanto o funcionário
                    System.out.print("Digite o nome do funcionário: ");
                    String nome = input.nextLine();

                    System.out.print(
                            "Digite o cargo do funcionário:\n1) Desenvolvedor Jr \n2) Desenvolvedor Pleno\n3) Desenvolvedor Sênior\n4)DBA (Administrador de banco de dados)\n5) Arquiteto de Software\nOpção escolhida: ");
                    int cargo = input.nextInt();

                    System.out.print("Digite a quantidade de horas extras: ");
                    int horasExtras = input.nextInt();

                    System.out.print("Digite a quantidade de faltas: ");
                    int faltas = input.nextInt();

                    System.out.print("Adere ao plano de saúde?\n1) Sim\n0) Não\nOpção escolhida: ");
                    int planoSaude = input.nextInt();

                    // Calculando os valores recebidos com base no cargo
                    String cargoEmString = "";
                    double valorHoraExtra = 0;
                    double salarioBruto = 0;
                    double salarioLiquido = 0;
                    double descontoPlanoSaude = 0;
                    double premioFaltas = 0;
                    double descontoValeAlimentacao = 0;
                    double descontoIR = 0;

                    // Salário Líquido = (salário bruto + horas extras trabalhadas + prêmio faltas)
                    // - (vale transporte + vale alimentação + plano de saúde + imposto de renda)
                    switch (cargo) {
                        case 1:
                            valorHoraExtra = horasExtras * 12.5;
                            salarioBruto = 2000;
                            descontoValeAlimentacao = 360;
                            descontoIR = 200;
                            cargoEmString = "Desenvolvedor JR.";
                            break;
                        case 2:
                            valorHoraExtra = horasExtras * 18.9;
                            salarioBruto = 3200;
                            descontoValeAlimentacao = 420;
                            descontoIR = 320;
                            cargoEmString = "Desenvolvedor Pleno";
                            break;
                        case 3:
                            valorHoraExtra = horasExtras * 25;
                            salarioBruto = 5000;
                            descontoValeAlimentacao = 500;
                            descontoIR = 500;
                            cargoEmString = "Desenvolvedor Sênior";
                            break;
                        case 4:
                            valorHoraExtra = horasExtras * 45;
                            salarioBruto = 7000;
                            descontoValeAlimentacao = 635;
                            descontoIR = 700;
                            cargoEmString = "DBA";
                            break;
                        case 5:
                            valorHoraExtra = horasExtras * 70;
                            salarioBruto = 8500;
                            descontoValeAlimentacao = 765;
                            descontoIR = 850;
                            cargoEmString = "Arquiteto de Software";
                            break;
                        default:
                            invalido = true;
                    }

                    if (faltas == 0) {
                        premioFaltas = 100;
                    }

                    if (planoSaude == 1) {
                        descontoPlanoSaude = 400;
                    }

                    // Calculando o desconto do vale transporte
                    double descontoValeTransporte = (salarioBruto * .06);

                    // Calculando o salário líquido
                    salarioLiquido = (salarioBruto + valorHoraExtra + premioFaltas)
                            - (descontoValeTransporte + descontoValeAlimentacao + descontoPlanoSaude + descontoIR);
                    
                    if (invalido) {
                        System.out.println("Cadastro inválido!");
                        break;
                    }

                    funcionarios[quantidadeFuncionarios][0] = nome;
                    funcionarios[quantidadeFuncionarios][1] = cargoEmString;
                    funcionarios[quantidadeFuncionarios][2] = String.valueOf(salarioBruto);
                    funcionarios[quantidadeFuncionarios][3] = String.valueOf(horasExtras);
                    funcionarios[quantidadeFuncionarios][4] = String.valueOf(valorHoraExtra);
                    funcionarios[quantidadeFuncionarios][5] = String.valueOf(premioFaltas);
                    funcionarios[quantidadeFuncionarios][6] = String.valueOf(descontoPlanoSaude);
                    funcionarios[quantidadeFuncionarios][7] = String.valueOf(descontoValeTransporte);
                    funcionarios[quantidadeFuncionarios][8] = String.valueOf(descontoValeAlimentacao);
                    funcionarios[quantidadeFuncionarios][9] = String.valueOf(descontoIR);
                    funcionarios[quantidadeFuncionarios][10] = String.valueOf(salarioLiquido);

                    quantidadeFuncionarios++;
                    break;
                case 2:
                    for (int i = 0; i < quantidadeFuncionarios; i++) {
                        System.out.printf("\n\nNome do funcionário: %s\n", funcionarios[i][0]);
                        System.out.printf("Cargo: %s\n", funcionarios[i][1]);
                        System.out.printf("Salário bruto: %s\n", funcionarios[i][2]);
                        System.out.printf("Quantidade de horas extras: %s\n", funcionarios[i][3]);
                        System.out.printf("Valor recebido pelas horas extras: %s\n", funcionarios[i][4]);
                        System.out.printf("Valor extra recebido pela quantidade faltas: %s\n", funcionarios[i][5]);
                        System.out.printf("Valor a ser descontado do plano de saúde: %s\n", funcionarios[i][6]);
                        System.out.printf("Desconto do vale transporte: %s\n", funcionarios[i][7]);
                        System.out.printf("Desconto do vale alimentação: %s\n", funcionarios[i][8]);
                        System.out.printf("Desconto do I.R.: %s\n", funcionarios[i][9]);
                        System.out.printf("Salário Líquido: %s\n\n", funcionarios[i][10]);
                    }
                    break;
                case 3:
                    // Limpando o scanner
                    input = new Scanner(System.in);

                    // Listar funcionário pelo nome
                    System.out.print("Digite o nome do funcionário: ");
                    String nomeProcurado = input.nextLine();

                    // Busca linear
                    for (int i = 0; i < quantidadeFuncionarios; i++) {                        
                        if (funcionarios[i][0] == nomeProcurado) {
                            System.out.printf("\n\nNome do funcionário: %s\n", funcionarios[i][0]);
                            System.out.printf("Cargo: %s\n", funcionarios[i][1]);
                            System.out.printf("Salário bruto: %s\n", funcionarios[i][2]);
                            System.out.printf("Quantidade de horas extras: %s\n", funcionarios[i][3]);
                            System.out.printf("Valor recebido pelas horas extras: %s\n", funcionarios[i][4]);
                            System.out.printf("Valor extra recebido pela quantidade faltas: %s\n", funcionarios[i][5]);
                            System.out.printf("Valor a ser descontado do plano de saúde: %s\n", funcionarios[i][6]);
                            System.out.printf("Desconto do vale transporte: %s\n", funcionarios[i][7]);
                            System.out.printf("Desconto do vale alimentação: %s\n", funcionarios[i][8]);
                            System.out.printf("Desconto do I.R.: %s\n", funcionarios[i][9]);
                            System.out.printf("Salário Líquido: %s\n\n", funcionarios[i][10]);
                            break;
                        }
                    }
                    break;
                case 4:
                    // Limpando o scanner
                    input = new Scanner(System.in);

                    // Remover um funcionário
                    System.out.print("Digite o nome do funcionário: ");
                    String nomeRemover = input.nextLine();
                    
                    // Busca linear
                    for (int i = 0; i < quantidadeFuncionarios; i++) {
                        if (funcionarios[i][0] == nomeRemover) {
                            funcionarios[i] = null;
                            // for (int j = 0; j < funcionarios[i].length; j++) {
                            //     funcionarios[i][j] = "";
                            // }

                            break;
                        }
                    }

                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        input.close();
    }
}
