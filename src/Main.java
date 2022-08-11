public class Main {

    public static void main(String[] args){

        // Get the number of rolls needed to get a Yahtzee
        int yahtzee = keepRolling();

        // We print the output
        System.out.println("We needed " + yahtzee + " rolls to get a Yahtzee!");
    }




    // Implementing the function RollDice with 6 sides
    public static int rollDice(){

        /* By default a dice has six sides so we set it to 6
        but if needed we can update that number*/
        int sides = 6;

        // We get a random number, this returns a random number from 0 to almost 1
        double randomNumber = Math.random();

        // Change range from 0 to almost 6
        randomNumber = randomNumber * sides;

        // Shift range by one to make range go from 1 to almost 7
        randomNumber = randomNumber + 1;

        // Cast randomNumber to int to get range from 1 to 6
        // Return statement
        return (int) randomNumber;

    }


    // Implementing a function to get number of rolls needed to get a Yahtzee
    public static int keepRolling(){

        // Dice roll at least once
        int dice1 = rollDice();
        int dice2 = rollDice();
        int dice3 = rollDice();
        int dice4 = rollDice();
        int dice5 = rollDice();

        // count number of rolls
        int rollCount = 1;

        while (!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)){

            // Dice roll repeat
            dice1 = rollDice();
            dice2 = rollDice();
            dice3 = rollDice();
            dice4 = rollDice();
            dice5 = rollDice();

            rollCount += 1;
        }

        return rollCount;

    }

}
