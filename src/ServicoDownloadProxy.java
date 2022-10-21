import org.junit.jupiter.api.Test;

public class ServicoDownloadProxy implements ServicoDownload{
    @Override
    public void baixarMusica(Usuario usuario, String nomeMusica){
        if(usuario.getPlano().equalsIgnoreCase("PREMIUM")){
            System.out.println("A música " + nomeMusica + " foi Baixada com Sucesso!!!");
        }
        else{
            System.out.println("Usuário" + usuario.getNome() + " não possui liscença PREMIUM!! Assine agora por APENAS 4000R$");
        };
    };

};
