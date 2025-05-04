public class Counterparty {
    public int c_id;
    private String c_name;
    private String c_address;

    public Counterparty(int c_id, String c_name, String c_address) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_address = c_address;
    }

    @Override
    public String toString() {
        return "Counterparty{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", c_address='" + c_address + '\'' +
                '}';
    }
}
