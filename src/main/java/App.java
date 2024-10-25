import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        ArrayList<Professor> listaProfessor = new ArrayList<Professor>();
        ArrayList<Psicologo> listaPsicologo = new ArrayList<Psicologo>();
        ArrayList<Pedagogo> listaPedagogo = new ArrayList<Pedagogo>();
        ArrayList<Tecnico> listaTecnico = new ArrayList<Tecnico>();
        ArrayList<Responsavel> listaResponsavel = new ArrayList<Responsavel>();
        ArrayList<Candidato> listaCanditado = new ArrayList<Candidato>();
        ArrayList<Advogado> listaAdvogado = new ArrayList<Advogado>();
        ArrayList<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
        ArrayList<Medico> listaMedico = new ArrayList<Medico>();

        Menu menu = new Menu();
        System.out.println(menu.getMenu());
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        String nome;
        String localNascimento;
        String dataNascimento;
        String formacao;
        String especialidade;
        String cargo;
        String funcao;
        String parentesco;
        String Oab;
        String crm;
        String materiaDeAtuacao;
        String especializacao;
        int totalPaciente;
        int quantidadeDeTurmas;
        int quantidadeDeAlunos;
        int numeroDeHorasTrabalhadas;
        int codigoDisciplina;
        int dataDeConcurso;
        int codigoDeVaga;
        int pontuacao;
        int anoEntrada;
        int registro;
        int quantidadeDeDisciplina;
        int crp;
        int cpf;
        int tempoServico;
        char sexo;
        double salario;
        double nota1;
        double nota2;
        double renda;


        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar aluno");

                    System.out.println("Informe o cpf: ");
                    cpf = scanner.nextInt();

                    Aluno aluno = new Aluno(cpf);

                    System.out.println("Informe o nome: ");
                    nome = scanner.next();
                    aluno.setNome(nome);

                    System.out.println("Informe a data nascimento: ");
                    dataNascimento = scanner.next();
                    aluno.setDataNascimento(dataNascimento);

                    System.out.println("Informe o local de nascimento: ");
                    localNascimento = scanner.next();
                    aluno.setLocalNascimento(localNascimento);

                    System.out.println("Informe o sexo: ");
                    sexo = scanner.next().charAt(0);
                    aluno.setSexo(sexo);

                    System.out.println("Informe a nota 1: ");
                    nota1 = scanner.nextDouble();
                    aluno.setNota1(nota1);

                    System.out.println("Informe a nota 2: ");
                    nota2 = scanner.nextDouble();
                    aluno.setNota2(nota2);

                    listaAluno.add(aluno);
                    break;
                case 2:
                    System.out.println("Listar Aluno");
                    System.out.println(listaAluno);
                    break;
                case 3:
                    System.out.println("Cadastrar professor");

                    System.out.println("Informe o cpf: ");
                    cpf = scanner.nextInt();

                    System.out.println("Informe a formação: ");
                    formacao = scanner.next();

                    Professor professor = new Professor(cpf, formacao);

                    System.out.println("Informe o nome: ");
                    nome = scanner.next();
                    professor.setNome(nome);

                    System.out.println("Informe a data nascimento: ");
                    dataNascimento = scanner.next();
                    professor.setDataNascimento(dataNascimento);

                    System.out.println("Informe o local de nascimento: ");
                    localNascimento = scanner.next();
                    professor.setLocalNascimento(localNascimento);

                    System.out.println("Informe o sexo: ");
                    sexo = scanner.next().charAt(0);
                    professor.setSexo(sexo);

                    System.out.println("Informe a quantidade de disciplina: ");
                    quantidadeDeDisciplina = scanner.nextInt();
                    professor.setQuantidadeDisciplina(quantidadeDeDisciplina);

                    System.out.println("Informe o tempo de serviço: ");
                    tempoServico = scanner.nextInt();
                    professor.setTempoServico(tempoServico);

                    listaProfessor.add(professor);
                    break;
                case 4:
                    System.out.println("listar professor");
                    System.out.println(listaProfessor);
                    break;
                case 5:
                    System.out.println("Cadastrar psicologo: ");

                    System.out.println("Informe o cpf: ");
                    cpf = scanner.nextInt();

                    Psicologo psicologo = new Psicologo(cpf);

                    System.out.println("Informe o nome: ");
                    nome = scanner.next();
                    psicologo.setNome(nome);

                    System.out.println("Informe a data de nascimento: ");
                    dataNascimento = scanner.next();
                    psicologo.setDataNascimento(dataNascimento);

                    System.out.println("Informe o local de nascimento: ");
                    localNascimento = scanner.next();
                    psicologo.setLocalNascimento(localNascimento);

                    System.out.println("Informe o sexo: ");
                    sexo = scanner.next().charAt(0);
                    psicologo.setSexo(sexo);

                    System.out.println("Informe o crp: ");
                    crp = scanner.nextInt();
                    psicologo.setCrp(crp);

                    System.out.println("Informe a sua especialidade: ");
                    especialidade = scanner.next();
                    psicologo.setEspecialidade(especialidade);

                    listaPsicologo.add(psicologo);
                    break;
                case 6:
                    System.out.println("Listar psicologo");
                    System.out.println(listaPsicologo);
                    break;
                case 7:
                    System.out.println("Cadastrar pedagogo");

                    System.out.println("Informe o cpf:");
                    cpf = scanner.nextInt();

                    Pedagogo pedagogo = new Pedagogo(cpf);

                    System.out.println("Informe o nome: ");
                    nome = scanner.next();
                    pedagogo.setNome(nome);

                    System.out.println("Informe a data de nascimento: ");
                    dataNascimento = scanner.next();
                    pedagogo.setDataNascimento(dataNascimento);

                    System.out.println("Informe o local de nascimento: ");
                    localNascimento = scanner.next();
                    pedagogo.setLocalNascimento(localNascimento);

                    System.out.println("Informe o sexo: ");
                    sexo = scanner.next().charAt(0);
                    pedagogo.setSexo(sexo);

                    System.out.println("Informe o registro: ");
                    registro = scanner.nextInt();
                    pedagogo.setRegistro(registro);

                    listaPedagogo.add(pedagogo);
                    break;
                case 8:
                    System.out.println("Listar pedagogo: ");
                    System.out.println(listaPedagogo);
                    break;
                case 9:
                    System.out.println("Cadastrar o tecnico: ");

                    System.out.println("Informe o cpf: ");
                    cpf = scanner.nextInt();

                    Tecnico tecnico = new Tecnico(cpf);

                    System.out.println("Informe o nome: ");
                    nome = scanner.next();
                    tecnico.setNome(nome);

                    System.out.println("Informe a data nascimento: ");
                    dataNascimento = scanner.next();
                    tecnico.setDataNascimento(dataNascimento);

                    System.out.println("Informe o local de nascimento: ");
                    localNascimento = scanner.next();
                    tecnico.setLocalNascimento(localNascimento);

                    System.out.println("Informe o sexo: ");
                    sexo = scanner.next().charAt(0);
                    tecnico.setSexo(sexo);

                    System.out.println("Informe o cargo: ");
                    cargo = scanner.next();
                    tecnico.setCargo(cargo);

                    System.out.println("Informe a função: ");
                    funcao = scanner.next();
                    tecnico.setFuncao(funcao);

                    System.out.println("Informe o ano de entrada: ");
                    anoEntrada = scanner.nextInt();
                    tecnico.setAnoEntrada(anoEntrada);

                    listaTecnico.add(tecnico);
                    break;
                case 10:
                    System.out.println("Lista tecnico: ");
                    System.out.println(listaTecnico);
                    break;
                case 11:
                    System.out.println("Cadastrar responsável: ");

                    System.out.println("Informe o cpf: ");
                    cpf = scanner.nextInt();

                    Responsavel responsavel = new Responsavel(cpf);

                    System.out.println("Informe o nome: ");
                    nome = scanner.next();
                    responsavel.setNome(nome);

                    System.out.println("Informe a data nascimento: ");
                    dataNascimento = scanner.next();
                    responsavel.setDataNascimento(dataNascimento);

                    System.out.println("Informe o local nascimento: ");
                    localNascimento = scanner.next();
                    responsavel.setLocalNascimento(localNascimento);

                    System.out.println("Informe o sexo: ");
                    sexo = scanner.next().charAt(0);
                    responsavel.setSexo(sexo);

                    System.out.println("Informe o parentesco: ");
                    parentesco = scanner.next();
                    responsavel.setParentesco(parentesco);

                    System.out.println("Informe a renda: ");
                    renda = scanner.nextDouble();
                    responsavel.setRenda(renda);

                    listaResponsavel.add(responsavel);
                    break;
                case 12:
                    System.out.println("Listar responsavel: ");
                    System.out.println(listaResponsavel);
                    break;
                case 13:
                    System.out.println("Cadastrar canditado: ");

                    System.out.println("Informe o cpf: ");
                    cpf = scanner.nextInt();

                    Candidato canditado = new Candidato(cpf);

                    System.out.println("Informe o nome: ");
                    nome = scanner.next();
                    canditado.setNome(nome);

                    System.out.println("Informe a data de nascimento: ");
                    dataNascimento = scanner.next();
                    canditado.setDataNascimento(dataNascimento);

                    System.out.println("Informe o local nascimento: ");
                    localNascimento = scanner.next();
                    canditado.setLocalNascimento(localNascimento);

                    System.out.println("Informe o sexo: ");
                    sexo = scanner.next().charAt(0);
                    canditado.setSexo(sexo);

                    System.out.println("Informe a data do concurso: ");
                    dataDeConcurso = scanner.nextInt();
                    canditado.setDataDeConcurso(dataDeConcurso);

                    System.out.println("Informe o codigo de vaga: ");
                    codigoDeVaga = scanner.nextInt();
                    canditado.setCodigoDeVaga(codigoDeVaga);

                    System.out.println("Informe a pontuacao: ");
                    pontuacao = scanner.nextInt();
                    canditado.setPontuacao(pontuacao);

                    listaCanditado.add(canditado);
                    break;
                case 14:
                    System.out.println("Listar canditado: ");
                    System.out.println(listaCanditado);
                    break;
                case 15:
                    System.out.println("Cadastrar advogado: ");

                    System.out.println("Informe o cpf: ");
                    cpf = scanner.nextInt();

                    Advogado advogado = new Advogado(cpf);

                    System.out.println("Informe o nome: ");
                    nome = scanner.next();
                    advogado.setNome(nome);

                    System.out.println("Informe a data de nascimento: ");
                    dataNascimento = scanner.next();
                    advogado.setDataNascimento(dataNascimento);

                    System.out.println("Informe o local de nascimento: ");
                    localNascimento = scanner.next();
                    advogado.setLocalNascimento(localNascimento);

                    System.out.println("Informe o sexo: ");
                    sexo = scanner.next().charAt(0);
                    advogado.setSexo(sexo);

                    System.out.println("Informe a formacão: ");
                    formacao = scanner.next();
                    advogado.setFormacao(formacao);

                    System.out.println("Informe a oab: ");
                    Oab = scanner.next();
                    advogado.setOab(Oab);

                    listaAdvogado.add(advogado);
                    break;
                case 16:
                    System.out.println("Listar Advogado");
                    System.out.println(listaAdvogado);
                    break;
                case 17:
                    System.out.println("Cadastrar Disciplina");

                    System.out.println("Informe o cpf: ");
                    cpf = scanner.nextInt();

                    System.out.println("Informe a formação: ");
                    formacao = scanner.next();

                    Disciplina disciplina = new Disciplina(cpf, formacao);

                    System.out.println("Informe o nome: ");
                    nome = scanner.next();
                    disciplina.setNome(nome);

                    System.out.println("Informe a data nascimento: ");
                    dataNascimento = scanner.next();
                    disciplina.setDataNascimento(dataNascimento);

                    System.out.println("Informe o local de nascimento: ");
                    localNascimento = scanner.next();
                    disciplina.setLocalNascimento(localNascimento);

                    System.out.println("Informe o sexo: ");
                    sexo = scanner.next().charAt(0);
                    disciplina.setSexo(sexo);

                    System.out.println("Informe a quantidade de disciplina: ");
                    quantidadeDeDisciplina = scanner.nextInt();
                    disciplina.setQuantidadeDisciplina(quantidadeDeDisciplina);

                    System.out.println("Informe a materia de atuacao: ");
                    materiaDeAtuacao = scanner.next();
                    disciplina.setMateriaDeAtuacao(materiaDeAtuacao);

                    System.out.println("Informme a quantidade de Turmas: ");
                    quantidadeDeTurmas = scanner.nextInt();
                    disciplina.setQuantidadeDeTurmas(quantidadeDeTurmas);

                    System.out.println("Informe a quantidade de alunos: ");
                    quantidadeDeAlunos = scanner.nextInt();
                    disciplina.setQuantidadeDeAlunos(quantidadeDeAlunos);

                    System.out.println("Informe o número de horas Trabalhadas: ");
                    numeroDeHorasTrabalhadas = scanner.nextInt();
                    disciplina.setHorasTrabalhadas(numeroDeHorasTrabalhadas);

                    System.out.println("Informe o codigo da disciplina: ");
                    codigoDisciplina = scanner.nextInt();
                    disciplina.setCodigoDisciplina(codigoDisciplina);

                    System.out.println("Informe o tempo de serviço: ");
                    tempoServico = scanner.nextInt();
                    disciplina.setTempoServico(tempoServico);

                    listaDisciplina.add(disciplina);
                    break;

                case 18:
                    System.out.println("Listar disciplina: ");
                    System.out.println(listaDisciplina);
                    break;
                case 19:
                    System.out.println("Cadastrar disciplina: ");

                    System.out.println("Informe o cpf: ");
                    cpf = scanner.nextInt();

                    Medico medico = new Medico(cpf);

                    System.out.println("Informe o nome: ");
                    nome = scanner.next();
                    medico.setNome(nome);

                    System.out.println("Informe a data nascimento: ");
                    dataNascimento = scanner.next();
                    medico.setDataNascimento(dataNascimento);

                    System.out.println("Informe o local de nascimento: ");
                    localNascimento = scanner.next();
                    medico.setLocalNascimento(localNascimento);

                    System.out.println("Informe o sexo: ");
                    sexo = scanner.next().charAt(0);
                    medico.setSexo(sexo);

                    System.out.println("Informe a crm: ");
                    crm = scanner.next();
                    medico.setCrm(crm);

                    System.out.println("Informe a total de paciente: ");
                    totalPaciente = scanner.nextInt();
                    medico.setTotalDePaciente(totalPaciente);

                    System.out.println("Informe a especialização: ");
                    especializacao = scanner.next();
                    medico.setEspecializacao(especializacao);

                    System.out.println("Informe o salario: ");
                    salario = scanner.nextDouble();
                    medico.setSalario(salario);

                    listaMedico.add(medico);
                    break;
                case 20:
                    System.out.println("Lista Medico: ");
                    System.out.println(listaMedico);
                    break;

            }
            System.out.println(menu.getMenu());
            opcao = scanner.nextInt();
        }

    }
}
