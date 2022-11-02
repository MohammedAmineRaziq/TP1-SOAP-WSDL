package WebService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "convertir")
    public double convertir( @WebParam(name = "mt") double mt){
        return mt*11;
    }
    @WebMethod(operationName = "consulter")
    public Compte consulter(@WebParam(name = "code") int code){
        return new  Compte(code,Math.random()*9888 ,new Date());
    }
    @WebMethod(operationName = "listComptes")
    public List<Compte> listComptes(){
        return List.of(
                new  Compte(1,Math.random()*9888 ,new Date()),
            new  Compte(2,Math.random()*9888 ,new Date()),
            new  Compte(3,Math.random()*9888 ,new Date())
        );
    }
}
