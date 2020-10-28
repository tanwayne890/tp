package seedu.address.model.expense;

public class Budget {
    private final Amount budget;

    public Budget() {
        this.budget = new Amount((double) 0);
    }

    public Budget(double budget) {
        this.budget = new Amount(budget);
    }

    public Budget remaining(double spending) {
        double remaining = this.getValue() - spending;
        return new Budget(remaining);
    }

    public boolean isEmpty() {
        return budget.getValue() <= 0;
    }

    @Override
    public String toString() {
        return budget.toString();
    }

    public double getValue() {
        return budget.getValue();
    }

}
