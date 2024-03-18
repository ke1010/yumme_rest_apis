package food.delivery.yumme;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientDetailsServiceImpl  implements ClientDetailsService{

    public ClientDetailsServiceImpl(ClientDetailsRepository clientDetailsRepository) {
        this.clientDetailsRepository = clientDetailsRepository;
    }

    ClientDetailsRepository clientDetailsRepository;
    @Override
    public String createClientDetails(ClientDetails clientDetails) {
      clientDetailsRepository.save(clientDetails);
        return "success";
    }

    @Override
    public String updateClientDetails(ClientDetails clientDetails) {
       clientDetailsRepository.save(clientDetails);
        return "success";
    }

    @Override
    public ClientDetails getClientDetails(String clientId) {
        return  clientDetailsRepository.findById(clientId).get();
    }

    @Override
    public List<ClientDetails> getAllClientDetails() {
        return clientDetailsRepository.findAll();
    }
}
