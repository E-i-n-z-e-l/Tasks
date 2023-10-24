package ArkhitekturaPO.Seminars.Seminar10.dao.EasyDAO;

import java.util.List;

public interface MyDao {
    public Object findById(Long id);
    public List<Object> findAll();
    public void save(Object entity);
    public void update(Object entity);
    public void delete(Object entity);
}
