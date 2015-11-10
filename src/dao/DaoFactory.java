package dao;
import jpa.BandaDaoImp;
import jpa.EM;
import jpa.EspetaculoDaoImp;
import jpa.ParticipacaoDaoImp;

public class DaoFactory {
public static BandaDao criarArtistaDao() {
return new BandaDaoImp(conn);
}
public static EspetaculoDao criarAlbumDao() {
return new EspetaculoDaoImp(EM.get());
}
public static ParticipacaoDao criarMusicaDao() {
return new MusicaDaoImp(EM.get());
}
}

