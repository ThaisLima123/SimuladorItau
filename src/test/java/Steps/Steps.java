package Steps;

import Pages.AcessoPage;
import Pages.CadastroPage;
import Pages.IniciarPage;
import Runner.RunSimulacao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Steps extends RunSimulacao {

    AcessoPage acessoPage  = new AcessoPage(driver);
    @Dado("que acesse o portal de credito imobiliario do itau")
    public void que_acesse_o_portal_de_credito_imobiliario_do_itau() {
    acessoPage.acessarSimulador();
    }

    IniciarPage iniciarPage  = new IniciarPage(driver);
    @Quando("preecho od dados pertinentes a simulacao")
    public void preecho_od_dados_pertinentes_a_simulacao() throws InterruptedException {
    iniciarPage.preencherCpf();

    }
    CadastroPage cadastroPage  = new CadastroPage(driver);
    @Entao("a simulação e realizada com sucesso")
    public void a_simulação_e_realizada_com_sucesso() throws InterruptedException {
        cadastroPage.cadastrar();


    }

}
