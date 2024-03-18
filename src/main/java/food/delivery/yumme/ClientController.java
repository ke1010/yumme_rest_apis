package food.delivery.yumme;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/yumme")
public class ClientController {

    ClientDetailsService clientDetailsService;

    public ClientController(ClientDetailsService clientDetailsService) {
        this.clientDetailsService = clientDetailsService;
    }



    @GetMapping("{clientId}")
    public ClientDetails getClientDetails(@PathVariable("clientId") String clientId){

        return  clientDetailsService.getClientDetails(clientId);
    }
    @PostMapping
    public  ClientDetails postClientDetails(@RequestBody ClientDetails clientDetails){
      clientDetailsService.createClientDetails(clientDetails);
     // clientDetails.setSuccess(true);
        return  clientDetails;
    }

    @PutMapping
    public String updateClientDetails(@RequestBody ClientDetails clientDetails){

clientDetailsService.updateClientDetails(clientDetails);
        return "client created successfully";
    }

}
