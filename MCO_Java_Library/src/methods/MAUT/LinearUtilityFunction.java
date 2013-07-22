package methods.MAUT;


/**
 * Linear utility function class.
 * result = a_ + b_ * value;
 * Implements UtilityFunction interface.
 * Utility function is part of every criterium in MAUT method. It describes how dimensionless utility value of the criterium between 0 and 1 is calculated from real world criterium values.
 * @author Mateusz Krasucki
 * @see UtilityFunction
 */
public class LinearUtilityFunction implements UtilityFunction {
        
        
    /**
     * Parameter a of linear utility function.
     * result = a_ + b_ * value;
     */
    private double a_;
    
    /**
     * Parameter b of linear utility function.
     * result = a_ + b_ * value;
     */
    private double b_;
  
    
    /**
     * Constructor with worst and best function arguments values as parameters.
     * For worst argument value function value will be 0 and for best argument value it will be 1. 
     * Using those worst and best values a_ and b_ parameters are calculated: result = a_ + b_ * value;
     * @param worst Value for which function value will be equal to 0.
     * @param best Value for which function value will be equal 1. 
     */
    public LinearUtilityFunction(double worst, double best)  {
        a_ = -worst/(best-worst);
        b_ = 1/(best-worst);     
    }
        
    /**
     * Calculates utility function value for number provided as parameter. 
     * The calculations are based on equation: result = a_ + b_ * value;
     * a_ and b_ parameters are determined based on worst and best arguments values provided when object is created. 
     * If result is less than 0 method returns 0. If result is greater than 1 method returns 1. 
     * @param value Number for which function will be calculated.
     * @return Function value for number provided as parameter.
     */ 
    public double calculate(double value)   {
        double result = a_ + b_ * value;
        if(result < 0)  {
            return 0;
        }
        else if(result > 1) {
            return 1;
        }
        
        return result; 
    }
}
