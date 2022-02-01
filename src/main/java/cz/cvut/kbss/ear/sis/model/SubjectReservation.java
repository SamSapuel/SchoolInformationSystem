package cz.cvut.kbss.ear.sis.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SUBJECT_RESERVATIONS")
@NamedQueries({
        @NamedQuery(name = "SubjectReservation.findByOwner", query = "SELECT s FROM SubjectReservation s WHERE s.student.id = :student")
})
public class SubjectReservation {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = true)
    private Integer grade;

    @ManyToOne
    @JoinColumn(name = "classroom", nullable = false)
    private Classroom classroom;

    @ManyToOne
    @JoinColumn(name = "subject", nullable = false)
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "student", nullable = false)
    private Student student;

    public Integer getId() {
        return id;
    }

    public Integer getGrade() { return grade; }

    public void setGrade(Integer grade) { this.grade = grade; }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    // TODO cho tam s vazbami? Ne uveren prosto

}
