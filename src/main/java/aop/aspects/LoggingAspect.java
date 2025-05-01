package aop.aspects;

import aop.Book;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinpoint){
        MethodSignature methodSignature = (MethodSignature) joinpoint.getSignature();
        System.out.println("methodSignature = "+ methodSignature);
        System.out.println("methodSignature.getMethod = "+ methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = "+ methodSignature.getReturnType());
        System.out.println("methodSignature.getName = "+ methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] args = joinpoint.getArgs();
            for(Object obj : args){
                if(obj instanceof Book){
                    Book myBook = (Book)obj;
                    System.out.println("Информация о книге: название - "+ myBook.getName()+ ", автор - "+myBook.getAuthor()+", год издания - " + myBook.getYearOfPublication());
                }else if(obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет "+ obj);
                }
            }
        }

        System.out.println("beforegetBookAdvice: логирование попытки получить книгу/журнал");
        System.out.println("-------------------------");

    }

//   @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazinePointcut() {}
//
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodPointcut() {}
//
//    @Pointcut("allMethodPointcut()&&!returnMagazinePointcut()")
//    private void allWithoutReturnPointcut() {}
//
//    @Before("allWithoutReturnPointcut()")
//    public void beforeAdvice() {
//        System.out.println("allWithoutReturnPointcut: отработал");
//    }
//@Pointcut("execution( * aop.UniLibrary.get*())")
//private void allGetMethodsFromUniLibrary() {}
//
//@Pointcut("execution( * aop.UniLibrary.return*())")
//private void allReturnMethodsFromUniLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {}
//
//@Before("allGetMethodsFromUniLibrary()")
//    public void beforGetLoggingAdvice(){
//    System.out.println("beforGetLoggingAdvice: writting Log #1");
//}
//
//@Before("allReturnMethodsFromUniLibrary()")
//    public void beforReturnLoggingAdvice(){
//    System.out.println("beforReturnLoggingAdvice: writting Log #2");
//}
//
//
//@Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforGetAndReturnLoggingAdvice(){
//    System.out.println("beforGetAndReturnLoggingAdvice: writting Log #3");
//}



}
