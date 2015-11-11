package dao;
import dao.jpa.BandaDaoImp;
import dao.jpa.EM;
import dao.jpa.EspetaculoDaoImp;
import dao.jpa.ParticipacaoDaoImp;

public class DaoFactory {
	
public static BandaDao criarBandaDao() {
return new BandaDaoImp();
}
public static EspetaculoDao criarEspetaculoDao() {
return new EspetaculoDaoImp();
}
public static ParticipacaoDao criarParticipacaoDao() {
return new ParticipacaoDaoImp();
}
}

