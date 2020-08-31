package Client;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import static com.sun.webkit.network.URLs.newURL;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class SOAPConsumer {

    public static void main(String[] args) {     
        try {
            URL url = newURL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");
            
            QName qname = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AtendeClienteService");
            
            //conecta ao servico
            Service service = Service.create(url, qname);

            //recebe a classe acessada através do servico
            AtendeCliente receptorCliente = service.getPort(AtendeCliente.class);
            
            String bairro=""+receptorCliente.consultaCEP("18035630").getBairro();
            String cidade=""+receptorCliente.consultaCEP("18035630").getCidade();
            
            System.out.println("bairro:"+bairro+"\n cidade:"+cidade);
            
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(SOAPConsumer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException_Exception ex) {
            Logger.getLogger(SOAPConsumer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SigepClienteException ex) {
            Logger.getLogger(SOAPConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
