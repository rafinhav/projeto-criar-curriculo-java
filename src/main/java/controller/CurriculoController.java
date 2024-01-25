package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import model.CurriculoBase;
import model.CurriculoCombinado;
import model.CurriculoCronologico;
import model.CurriculoFuncional;
import model.Pessoa;
import view.CurriculoView;


public class CurriculoController {
    private CurriculoView curriculoView;

    public CurriculoController(CurriculoView curriculoView) {
        this.curriculoView = curriculoView;
    }

    public void criarCurriculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe o seu endereço:");
        String endereco = scanner.nextLine();

        System.out.println("Informe o seu e-mail:");
        String email = scanner.nextLine();

        System.out.println("Informe o seu telefone:");
        String telefone = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, endereco, email, telefone);

        System.out.println("Informe a sua experiência profissional:");
        String experienciaProfissional = scanner.nextLine();

        System.out.println("Escolha o tipo de currículo:");
        System.out.println("1. Currículo Cronológico");
        System.out.println("2. Currículo Funcional");
        System.out.println("3. Currículo Combinado");
        int tipoCurriculo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        CurriculoBase curriculo;

        switch (tipoCurriculo) {
            case 1:
                System.out.println("Informe o objetivo profissional:");
                String objetivoProfissional = scanner.nextLine();
                System.out.println("Informe a formação acadêmica:");
                String formacaoAcademica = scanner.nextLine();
                System.out.println("Informe as habilidades:");
                String habilidades = scanner.nextLine();
                System.out.println("Informe os idiomas:");
                String idiomas = scanner.nextLine();
                System.out.println("Informe as atividades extracurriculares:");
                String atividadesExtracurriculares = scanner.nextLine();
                System.out.println("Informe as referências:");
                String referencias = scanner.nextLine();
                System.out.println("Informe as observações:");
                String observacoes = scanner.nextLine();
                System.out.println("Informe a data e assinatura:");
                String dataAssinatura = scanner.nextLine();
                curriculo = new CurriculoCronologico(pessoa, objetivoProfissional, formacaoAcademica,
                        experienciaProfissional, habilidades, idiomas, atividadesExtracurriculares, referencias,
                        observacoes, dataAssinatura);
                break;
            case 2:
                System.out.println("Informe o resumo profissional:");
                String resumoProfissional = scanner.nextLine();
                System.out.println("Informe as competências:");
                String competencias = scanner.nextLine();
                System.out.println("Informe a formação acadêmica:");
                String formacaoAcademicaFuncional = scanner.nextLine();
                System.out.println("Informe outras informações:");
                String outrasInformacoes = scanner.nextLine();
                curriculo = new CurriculoFuncional(pessoa, resumoProfissional, competencias, experienciaProfissional,
                        formacaoAcademicaFuncional, outrasInformacoes);
                break;
            case 3:
                System.out.println("Informe o resumo profissional:");
                String resumoProfissionalCombinado = scanner.nextLine();
                System.out.println("Informe as competências:");
                String competenciasCombinado = scanner.nextLine();
                System.out.println("Informe a formação acadêmica:");
                String formacaoAcademicaCombinado = scanner.nextLine();
                System.out.println("Informe outras informações:");
                String outrasInformacoesCombinado = scanner.nextLine();
                System.out.println("Informe o objetivo profissional:");
                String objetivoProfissionalCombinado = scanner.nextLine();
                System.out.println("Informe a formação acadêmica do currículo cronológico:");
                String formacaoAcademicaCronologico = scanner.nextLine();
                System.out.println("Informe as habilidades do currículo cronológico:");
                String habilidadesCronologico = scanner.nextLine();
                System.out.println("Informe os idiomas do currículo cronológico:");
                String idiomasCronologico = scanner.nextLine();
                System.out.println("Informe as atividades extracurriculares do currículo cronológico:");
                String atividadesExtracurricularesCronologico = scanner.nextLine();
                System.out.println("Informe as referências do currículo cronológico:");
                String referenciasCronologico = scanner.nextLine();
                System.out.println("Informe as observações do currículo cronológico:");
                String observacoesCronologico = scanner.nextLine();
                System.out.println("Informe a data e assinatura do currículo cronológico:");
                String dataAssinaturaCronologico = scanner.nextLine();
                CurriculoCronologico curriculoCronologico = new CurriculoCronologico(pessoa,
                        objetivoProfissionalCombinado, formacaoAcademicaCronologico, experienciaProfissional,
                        habilidadesCronologico, idiomasCronologico, atividadesExtracurricularesCronologico,
                        referenciasCronologico, observacoesCronologico, dataAssinaturaCronologico);
                curriculo = new CurriculoCombinado(pessoa, resumoProfissionalCombinado, competenciasCombinado,
                        experienciaProfissional, formacaoAcademicaCombinado, outrasInformacoesCombinado,
                        curriculoCronologico);
                break;
            default:
                curriculoView.mostrarMensagem("Opção inválida. Saindo do programa.");
                return;
        }

        String detalhesCurriculo = curriculo.obterDetalhes();

        System.out.println("Informe o diretório de destino do arquivo:");
        String diretorio = scanner.nextLine();
        
        System.out.println("Informe o nome do arquivo:");
        String nomeArquivo = scanner.nextLine();

        String caminhoCompleto = diretorio + "/" + nomeArquivo + ".txt";

        // Salvar o currículo em um arquivo
        try {
            FileWriter arquivo = new FileWriter(caminhoCompleto);
            PrintWriter gravador = new PrintWriter(arquivo);
            gravador.println(detalhesCurriculo);
            gravador.close();
            arquivo.close();
            curriculoView.mostrarMensagem("Currículo criado e salvo com sucesso.");
        } catch (IOException e) {
            curriculoView.mostrarMensagem("Ocorreu um erro ao salvar o currículo.");
        }
    }
    
}