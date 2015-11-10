package jpa;

import javax.persistence.EntityManager;

import dao.Conexao;

public class ConexaoImp implements Conexao {

	// extra
	public EntityManager getEm() { //pega o em que está na thread
		return EM.getLocalEm();
	}
	
	@Override
	public void fecharConexao() {
		EM.closeLocalEm();
	}

	@Override
	public void iniciarTransacao() {
		EM.getLocalEm().getTransaction().begin();
	}

	@Override
	public void commit() {
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public void rollback() {
		EM.getLocalEm().getTransaction().rollback();
	}

	@Override
	public boolean transacaoAtiva() {
		return EM.getLocalEm().getTransaction().isActive();
	}

}
