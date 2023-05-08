public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {

        //Define your visit
        int airFare = 100;

        System.out.println("Borcay's airFare is " + airFare);

        if (budget > airFare) {
            System.out.println("The white sand is so beautiful");
            budget = budget - airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("You cannot visit the location because the airFare is 100 and your budget is " + budget + "\n");
        }

    }

    public void visit(Pangasinan HundredIslands) {

        // Define your visit
        int airFare = 200;

        System.out.println("Pangasinan's Hundred Islands airFare is " + airFare);
        
        if (budget > airFare) {
            System.out.println("The islands are a masterpiece");
            budget = budget - airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("You cannot visit the location because the airFare is 200 and your budget is " + budget + "\n");
        }
    }

    public void visit(Zambales Subic) {

        // Define your visit
        int airFare = 300;

        System.out.println("Zambales' Subic airFare is " + airFare);

        if (budget > airFare) {
            System.out.println("The wind is so calming");
            budget = budget - airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("You cannot visit the location because the airFare is 300 and your budget is " + budget + "\n");
        }

    }

    public void visit(Baguio StrawberryFarm) {

        // Define your visit
        int airFare = 250;
        
        System.out.println("Baguio's Strawberry Farm airFare is " + airFare);

        if (budget > airFare) {
            System.out.println("The strawberries are delicious");
            budget = budget - airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("You cannot visit the location because the airFare is 250 and your budget is " + budget + "\n");
        }

    }

    public void visit(Bohol ChocolateHills) {

        // Define your visit
        int airFare = 150;

        System.out.println("Bohol's Chocolate Hills airFare is " + airFare);
        
        if (budget > airFare) {
            System.out.println("The hills really does look like a chocolate");
            budget = budget - airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("You cannot visit the location because the airFare is 150 and your budget is " + budget + "\n");
        }
    }

    public void visit(Batangas batangas) {

        // Define your visit
        int airFare = 350;

        System.out.println("Batangas' airFare is " + airFare);
        
        if (budget > airFare) {
            System.out.println("The beach in here is relaxing");
            budget = budget - airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("You cannot visit the location because the airFare is 350 and your budget is " + budget + "\n");
        }
    }


    public void checkBudget() {
        System.out.println("my budget is " + budget);

    }

}