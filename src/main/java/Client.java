public class Client {
    private Long id;
    private String name;
    private String surname;

    public Client() {
        super();
    }

    public Client (Long id, String name, String surname) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Client(String name, String surname) {
        super();
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Client [id=%s, name=%s, surname=%s]", id, name, surname);
    }

}