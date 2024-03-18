package food.delivery.yumme;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "yumme_client_info")
public class ClientDetails {
    @Id
    private String clientId;
    private String number;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ClientDetails(boolean success) {
        this.success = success;
    }

    private boolean success;
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getPssword() {
        return pssword;
    }

    public void setPssword(String pssword) {
        this.pssword = pssword;
    }

    private String otp;

    public ClientDetails(String clientId, String number, String otp, String pssword) {
        this.clientId = clientId;
        this.number = number;
        this.otp = otp;
        this.pssword = pssword;
    }

    private String pssword;

    public ClientDetails(){
    }
}
