package de.view;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import de.domain.Student;
import de.service.StudentService;

@Route("")
public class StudentView extends VerticalLayout {
    public StudentView(StudentService service) {
        Grid<Student> grid = new Grid<>();
        grid.setItems(service.findAll());
    }
}
