package element;

public class Cargo {
    String code;
    String country;
    String continent;
    String transport;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public Cargo(String code, String country, String continent, String transport) {
        this.code = code;
        this.country = country;
        this.continent = continent;
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "code='" + code + '\'' +
                ", country='" + country + '\'' +
                ", continent='" + continent + '\'' +
                ", transport='" + transport + '\'' +
                '}';
    }
}
