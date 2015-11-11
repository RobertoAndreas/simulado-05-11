package dao;
import dao.jpa.BandaDaoImp;
import dao.jpa.EM;
import dao.jpa.EspetaculoDaoImp;
import dao.jpa.ParticipacaoDaoImp;

public class DaoFactory {
	
public static BandaDao criarBandaDao() {
return new BandaDaoImp(EM.get());
}
public static EspetaculoDao criarEspetaculoDao() {
return new EspetaculoDaoImp(EM.get());
}
public static ParticipacaoDao criarParticipacaoDao() {
return new ParticipacaoDaoImp(EM.get());
}
}
