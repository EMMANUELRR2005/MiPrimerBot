package model;

public class Cuestionario {
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Long getTelegramid() {
        return telegramid;
    }

    public void setTelegramid(Long telegramid) {
        this.telegramid = telegramid;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Integer getPreguntaid() {
        return preguntaid;
    }

    public void setPreguntaid(Integer preguntaid) {
        this.preguntaid = preguntaid;
    }

    private String seccion;
    private Long telegramid;
    private String response;
    private Integer preguntaid;
}
