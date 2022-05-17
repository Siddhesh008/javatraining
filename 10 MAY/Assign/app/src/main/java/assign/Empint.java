package assign;

public interface  Empint {
    
    void save(Employee emp);
    void update(Employee emp);
    void delete(Employee emp);
    void insert(Employee emp);
    void create(Employee emp);
    void select(Employee emp);
    Employee getEmployee(int id);

}
