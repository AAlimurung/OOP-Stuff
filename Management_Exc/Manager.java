package Management_Exc;

public class Manager extends Employee {
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    /**
     * TODO this implementation
     * @param e the employee to be given raise
     * @param raise the raise
     * @throws IllegalArgumentException when raise is negative
     */
    public void giveRaise(Employee e, double raise) {
        if(raise > 0){
            if(e.equals(this)){
                this.setSalary(getSalary() + raise);
                return;
            }
            this.setSalary(getSalary() + (raise/2));
            e.setSalary(e.getSalary() + raise);
        } else{
            throw new IllegalArgumentException("Raise must be non-negative");
        }
    }

    @Override
    public String toString() {
        return "Mgr. " +super.toString();
    }
}
