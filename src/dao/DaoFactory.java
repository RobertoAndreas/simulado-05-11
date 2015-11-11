package dao;
import jpa.BandaDaoImp;
import jpa.EM;
import jpa.EspetaculoDaoImp;
import jpa.ParticipacaoDaoImp;

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

