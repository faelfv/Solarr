package service;
import java.util.ArrayList;
import java.util.List;

import dao.FuncaoColaboradorDAO;

import model.FuncaoColaborador;

public class FuncaoColaboradorService {
FuncaoColaboradorDAO dao = new FuncaoColaboradorDAO();
	
	public int criar(FuncaoColaborador colaborador) {
		return dao.criar(colaborador);
	}
	public void atualizar(FuncaoColaborador colaborador) {
	dao.atualizar(colaborador);
	}
	public void excluir(int idcolab) {
	dao.excluir(idcolab);
	}
	public FuncaoColaborador carregar(int idcolab) {
		return  dao.carregar(idcolab);
	
	}
	public void recuperar(FuncaoColaborador colaborador) {
		dao.recuperar(colaborador);
		
	}
	
	
	public ArrayList<FuncaoColaborador> listarColaboradores(){
		return dao.listarColaboradores();
	}
	public ArrayList<FuncaoColaborador> listarColaboradores(String chave){
		return dao.listarColaboradores(chave);
	}
}
