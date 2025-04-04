package br.com.escola.teste;

import java.sql.Connection;

import br.com.escola.conexao.Conexao;
import br.com.escola.dao.ProfessorDAO;
import br.com.escola.model.Professor;

public class ProgramaDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		{
			
			Connection con = Conexao.abrirConexao();

			Professor professor = new Professor();
			ProfessorDAO professordao = new ProfessorDAO(con);////////
			
			professor.setCurso("rh");
			System.out.println(professordao.deletar(professor));
			
			Conexao.fecharConexao(con);
		}
		
	}

}
