public class conditionals {
    public static void main(String[] args) {
        /*
        int age =13;
        if(age>18){
            System.out.println("Eligible for vote");
        }else{
            System.out.println("Not Eligible for vote");
    }
    */

    /*
    int salary = 1000;
    
    if(salary >1500){
        salary = salary +1;
    }else{
        salary= salary-1;
    }
    System.out.println(salary);
    */

    int age =19;

    if(age<18){
        age += 3;
    } else if(age == 18){
        System.out.println("can vote");
    }else{
        age -=  18;
    }
    System.out.println(age);
}
}
