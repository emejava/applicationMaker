package com.applicationmaker.model.entity.main;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

@Entity(name="lessonEntity")
@Table(name="lesson_tbl")

public class Lesson {
    @Id
    @SequenceGenerator(name = "lessonSeq", sequenceName = "lesson_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "lessonSeq")
    private int id;

    @Column(name = "dep_name", length = 20)
    @NotBlank(message = "empty department")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String department;

    @Column(name = "course_name", length = 20)
    @NotBlank(message = "empty lesson name")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String name;

    @Column(name = "lecturer_name", length = 20)
    @NotBlank(message = "empty lecturer")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String lecturer;

    @Column(name = "lecture", length = 20)
    @NotBlank(message = "empty lecture")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String lecture;

    @Column(name = "date", length = 20)
    @NotBlank(message = "empty date")
    @Pattern(regexp = "[0-9]{4}[\\]{1}[0-9]{2}[\\]{1}[0-9]{2}")
    private String date;

    @Column(name = "time", length = 20)
    @NotBlank(message = "empty time")
    @Pattern(regexp = "^[0-9]{2}[':][0-9]{2}")
    private String time;

    @Column(name = "duration", length = 20)
    @NotBlank(message = "empty duration")
    @Pattern(regexp = "^[0-9]{2}[':][0-9]{2}")
    private String duration;

    @Column(name = "detail", length = 100)
    @NotBlank(message = "empty detail")
    @Pattern(regexp = ("^[a-z]{2,100}$"))
    private String detail;



}
