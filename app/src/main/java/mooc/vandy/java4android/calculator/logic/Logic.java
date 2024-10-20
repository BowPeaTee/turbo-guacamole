package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

   
    private final static int ADD = 1;
    private final static int SUBTRACT = 2;
    private final static int MULTIPLY = 3;
    private final static int DIVIDE = 4;
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        switch (operation)
        {
            case ADD:
                Add addition = new Add(argumentOne,argumentTwo,mOut);
                addition.perform();
                break;
            case SUBTRACT:
                Subtract subtraction = new Subtract(argumentOne,argumentTwo,mOut);
                subtraction.perform();
                break;
            case MULTIPLY:
                Multiply multiplication = new Multiply(argumentOne,argumentTwo,mOut);
                multiplication.perform();
                break;
            case DIVIDE:
                Divide division = new Divide(argumentOne,argumentTwo,mOut);
                division.perform();
                break;
        }

    }
}