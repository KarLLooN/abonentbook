package abonentbook;

import java.util.List;

public interface AbonentRepository {

    Abonent findById();

    void deliteById();

    Abonent create();

    Abonent update();
}
