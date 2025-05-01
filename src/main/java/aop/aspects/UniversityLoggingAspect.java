package aop.aspects;

import aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("getStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents");
//    }




//    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        //хотим получить первого студента
//        Student firstStudent = students.get(0);
//        // получаем его имя
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. "+ nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade++;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов после метода getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//    throwing = "exeption")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exeption) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс исклчения" + exeption);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(ProceedingJoinPoint joinPoint) throws Throwable {


        System.out.println("afterGetStudentsLoggingAdvice: логируем " +
                "нормальное окончание работы метода или выброс исключения");
    }


}
