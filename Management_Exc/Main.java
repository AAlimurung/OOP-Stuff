package Management_Exc;

import com.sun.source.tree.BreakTree;

import java.util.*;

public class Main {

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param manager the manager to give the salary
     * @param employee the employee to receive the raise
     * @param salary the salary increase to be given
     * @throws ClassCastException when manager or employee is not a manager or employee
     * @throws IllegalArgumentException when salary is invalid
     * @throws NoSuchElementException when given manager or employee does not exist in the list of persons
     */
    public static void giveRaise(List<Person> persons, String manager, String employee, double salary)  {
           int aps = 0;
            for(Person eep : persons){
               if(eep.getName().equals(manager) && eep instanceof Manager){
                   for(Person foo : persons){
                       if(foo.getName().equals(employee) && foo instanceof Employee){
                           try{
                               ((Manager)eep).giveRaise((Employee) foo, salary);
                           }catch (IllegalArgumentException i){
                               System.out.println(i.getMessage());
                           }
                           aps++;
                           break;
                       }
                   }
               }
           }
            for(Person eep : persons){
                if(eep.getName().equals(manager) && !(eep instanceof Manager)){
                    throw new ClassCastException(eep.getName() + " is not a manager");
                } else if (eep.getName().equals(employee) && !(eep instanceof Employee)) {
                    throw new ClassCastException(eep.getName() + " is not an employee");
                }
            }
            boolean check = false;

            for(Person foo : persons){
                if(!(foo.getName().equals(manager))){
                    check = true;
                }
            }
            if(!check){
                throw new NoSuchElementException("name does not exist");
            }


           if(aps == 0){
               System.out.println("Invalid input");
           }
    }

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param developer the developer to be assigned
     * @param manager the manager assigned to the dev
     * @throws ClassCastException when manager or developer is not a manager or employee
     * @throws NoSuchElementException when given manager or developer does not exist in the list of persons
     * @throws IllegalStateException when developer already has a manager
     */
    public static void assignPM(List<Person> persons, String developer, String manager) {
        int aps = 0;
        for(Person p : persons){
            if(p.getName().equals(developer) && p instanceof Developer){
                if(manager.equals("NULL")){
                    ((Developer)p).removePM();
                    aps++;
                }
                for(Person f : persons){
                    if(f.getName().equals(manager) && f instanceof Manager){
                        ((Developer)p).setProjectManager((Manager)f);
                        aps++;
                    }
                }
            }
        }
        if(aps == 0){
            System.out.println("Invalid input");
        }
    }

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param customer the customer to speak to the employee
     * @param employee the employee to be spoken to
     * @return the dialogue of the customer to the employee
     * @throws IllegalArgumentException when given customer or employee is not what they are
     * @throws NoSuchElementException when given customer or employee is not in the list of persons
     */
    public static String customerSpeak(List<Person> persons, String customer, String employee) {
        int fcn = 0;
        for(Person cs : persons){
            if(cs instanceof Customer && cs.equals(customer)){
                for(Person ee : persons){
                    if(ee instanceof Employee && cs.equals(employee)){
                        ((Customer)cs).speak((Employee) ee);
                        fcn = 1;
                    }
                }
            }
        }

        if(fcn == 0){
            System.out.println("Invalid input");
        }
        return customer;
    }

}
