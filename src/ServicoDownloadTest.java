import org.junit.jupiter.api.Test;
public class ServicoDownloadTest {
   @Test
    public void baixarMusica1(){
       Usuario p1 = new Usuario("Luccas Silva",1,"PREMIUM");
       Usuario p2 = new Usuario("Robeto Carlos",2,"NORMAL");
       ServicoDownloadProxy verificar = new ServicoDownloadProxy();
       verificar.baixarMusica(p1,"Ocean Trid");
       verificar.baixarMusica(p2,"Ocean Trid");
   }
}