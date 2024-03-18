package food.delivery.yumme;

import java.util.List;

public interface ClientDetailsService {

    public String createClientDetails(ClientDetails clientDetails);
    public String updateClientDetails(ClientDetails clientDetails);
public ClientDetails getClientDetails(String clientId);
public List<ClientDetails> getAllClientDetails();
}
