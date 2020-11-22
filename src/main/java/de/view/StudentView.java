package de.view;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import de.domain.Student;
import de.service.StudentService;
import org.vaadin.crudui.crud.impl.GridCrud;

@Route("")
public class StudentView extends VerticalLayout {
    public StudentView(StudentService service) {
        GridCrud<Student> crud = new GridCrud<>(Student.class, service);
        add(crud);
        setSizeFull();
    }
}
