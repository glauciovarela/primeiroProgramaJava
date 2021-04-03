package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.excecao.ExcecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;



public class PrimeiraClasseJava {

	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			
			LerArquivo();
			
			/*File fil = new File ("C://lines.txt");
			Scanner scanner = new Scanner(fil);*/
		
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
				
		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {
			
			
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
				
		for (int qtd = 1 ; qtd <= 1 ; qtd ++) {
			
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno"+qtd+" ?");
		String idade = JOptionPane.showInputDialog("Qual a idade ");
		
		/*String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento ");
		String rg = JOptionPane.showInputDialog("RG");
		String cpf = JOptionPane.showInputDialog("CPF");
		String mae = JOptionPane.showInputDialog("Nome da Mãe");
		String pai = JOptionPane.showInputDialog("Nome do Pai");
		String matricula = JOptionPane.showInputDialog("Data da Matricula");
		String serie = JOptionPane.showInputDialog("Qual a Série");
		String escola = JOptionPane.showInputDialog("Qual o nome da Escola");*/
		
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		
		/*aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMaricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);*/
		

		for (int pos = 1; pos <=1; pos++ ) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " +pos+ "?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " +pos+ "?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja excluir alguma disciplina ?");
		
		if (escolha == 0){
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while (continuarRemover == 0) {
			String diciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou 4 ?");
			System.out.println(aluno1.getDisciplinas().remove(Integer.valueOf(diciplinaRemover).intValue()-posicao));
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ? ");
	}
}	
		
		alunos.add(aluno1);
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		
		for (Aluno aluno : alunos) {
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
		}
		
		}
	
		System.out.println("-------------------------Lista dos Aprovados------------------------------ ");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Aluno = " + aluno.getNome()+ "..." + "Resultado = " + aluno.getAlunoAprovado2() + " Com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("-------------------------Lista dos em Recuperacao------------------------------- ");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Aluno = " + aluno.getNome()+ "..." + "Resultado = " + aluno.getAlunoAprovado2() + " Com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("-------------------------Lista dos Reprovados----------------------------------- ");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Aluno = " + aluno.getNome()+ "..." + "Resultado = " + aluno.getAlunoAprovado2() + " Com média de = " + aluno.getMediaNota());
		}
		
		}else{
			JOptionPane.showMessageDialog(null, "Acesso não Permitido ");
		}
		
	

		
		}catch (Exception e) {
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace();
			
			System.out.println("Mensagem: " + e.getMessage());
			
			for (int pos = 0; pos < e.getStackTrace().length; pos++) {
				
				saida.append("\n Classe de erro : " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Metodo de erro : " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro : " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class : " + e.getClass().getName());
				
			}
			
			JOptionPane.showMessageDialog(null, "Erro de conversão de número" + saida.toString());
			
		}finally {
			JOptionPane.showMessageDialog(null, "Obrigado Jesus!!!, por me ensinar Java");
		}
	
    }
	private static void LerArquivo() {
		
	}
	public static void lerArquivo1 () throws ExcecaoProcessarNota {		
		try {
			File fil = new File("C: //lines.txt");
			Scanner scanner = new Scanner(fil); 
		}catch (FileNotFoundException e) {
				throw new ExcecaoProcessarNota (e.getMessage());
}

}
}
