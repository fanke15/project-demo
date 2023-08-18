package entity.example;

public class DefaultExampleEntity {
    private int id;
    private String userId;
    @Override
    public String toString(){
        return "User [id=" + id + ", userId=" + userId + "]";
    }
}
