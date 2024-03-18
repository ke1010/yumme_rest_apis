package food.delivery.yumme;

public class ClientResponse {

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

    private String clientId;

    public ClientResponse(String clientId, String number, String otp, String pssword) {
        this.clientId = clientId;
        this.number = number;
        this.otp = otp;
        this.pssword = pssword;
    }

    private String number;
    private String otp;
    private String pssword;
}
